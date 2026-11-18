// ---------- Datos ----------

const products = JSON.parse(document.getElementById('productos-json').textContent);

let cart = []; // [{ id, qty }]
// ---------- Utilidades ----------
function formatPrice(n) {
return n.toFixed(2) + ' €';
}
function escapeHTML(str) {
return String(str).replace(/[&<>"']/g, c => ({
'&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;'
}[c]));
}
function findProduct(id) {
return products.find(p => p.id === id);
}
// ---------- Verificación de edad ----------
function confirmAge() {
try { sessionStorage.setItem('ageOk', '1'); } catch (e) { /* sin
almacenamiento */ }
document.getElementById('age-modal').classList.add('hidden');
document.body.classList.remove('locked');
}
function exitSite() {
window.location.href = 'https://www.google.es';
}
function checkAge() {
let ok = false;
try { ok = sessionStorage.getItem('ageOk') === '1'; } catch (e) { ok = false;
}
if (ok) confirmAge();
}
// ---------- Catálogo ----------
function exploreCatalog(category) {
filterProducts(category, document.getElementById('btn-' + category));
document.getElementById('shop-section').scrollIntoView({ behavior: 'smooth'
});

}
function filterProducts(category, btn) {
document.querySelectorAll('.filter-btn').forEach(b =>
b.classList.remove('active'));
if (btn) btn.classList.add('active');
renderProducts(category);
}
function renderProducts(filter) {
const grid = document.getElementById('product-grid');
grid.innerHTML = '';
let filtered = products;
if (filter === 'plugs') {
filtered = products.filter(p => p.type === 'plug');
} else if (filter && filter !== 'todos') {
filtered = products.filter(p => p.category === filter);
}
if (filtered.length === 0) {
grid.innerHTML = '<p class="empty-msg">No hay productos en esta categoría.</p>';
return;
}
filtered.forEach(product => {
const card = document.createElement('div');
card.className = 'product-card';
card.innerHTML = `
<div class="product-img">
<span class="tag">${escapeHTML(product.tag)}</span>
<span class="product-icon">${escapeHTML(product.icon)}</span>
<span class="product-type-label">${escapeHTML(product.typeLabel)}
</span>
</div>
<div class="product-info">
<div>
<h3 class="product-title">${escapeHTML(product.name)}</h3>
<p class="product-specs">${escapeHTML(product.material)}
<br>${escapeHTML(product.size)}</p>
<div class="compatibility-note">${escapeHTML(product.note)}
</div>
</div>
<div class="product-footer">
<span class="price">${formatPrice(product.price)}</span>
<button type="button" class="btn btn-primary" data-

id="${product.id}">Añadir</button>
</div>
</div>
`;
card.querySelector('button').addEventListener('click', () =>
addToCart(product.id));
grid.appendChild(card);
});
}
// ---------- Carrito ----------
function addToCart(id) {
if (!findProduct(id)) return;
const line = cart.find(l => l.id === id);
if (line) {
line.qty++;
} else {
cart.push({ id, qty: 1 });
}
updateCartUI();
if (!document.getElementById('cart-sidebar').classList.contains('open')) {
toggleCart();
}
}
function changeQty(id, delta) {
const line = cart.find(l => l.id === id);
if (!line) return;
line.qty += delta;
if (line.qty <= 0) {
removeFromCart(id);
return;
}
updateCartUI();
}
function removeFromCart(id) {
cart = cart.filter(l => l.id !== id);
updateCartUI();
}
function updateCartUI() {
const totalUnits = cart.reduce((sum, l) => sum + l.qty, 0);
document.getElementById('cart-count').textContent = `(${totalUnits})`;
const container = document.getElementById('cart-items');
container.innerHTML = '';

let total = 0;
if (cart.length === 0) {

container.innerHTML = '<p style="color:var(--text-muted); text-align:center; margin-top:2rem;">Tu carrito está vacío.</p>';

}
cart.forEach(line => {
const item = findProduct(line.id);
const subtotal = item.price * line.qty;
total += subtotal;
const div = document.createElement('div');
div.className = 'cart-item';
div.innerHTML = `
<div>
<strong>${escapeHTML(item.name)}</strong><br>
<small style="color:var(--text-muted)">${formatPrice(item.price)}
× ${line.qty} = ${formatPrice(subtotal)}</small>
</div>
<div class="qty-controls">

<button type="button" class="qty-btn" data-action="minus" aria-
label="Quitar uno">−</button>

<span>${line.qty}</span>

<button type="button" class="qty-btn" data-action="plus" aria-
label="Añadir uno">+</button>

<button type="button" class="remove-btn" data-
action="remove">Eliminar</button>

</div>
`;
div.querySelector('[data-action="minus"]').addEventListener('click', ()=> changeQty(line.id, -1));
div.querySelector('[data-action="plus"]').addEventListener('click', () =>
changeQty(line.id, 1));
div.querySelector('[data-action="remove"]').addEventListener('click', ()=> removeFromCart(line.id));
container.appendChild(div);
});
document.getElementById('total-price').textContent = formatPrice(total);
}
function toggleCart() {
document.getElementById('cart-sidebar').classList.toggle('open');
document.getElementById('cart-overlay').classList.toggle('open');
}

function checkout() {
if (cart.length === 0) {
alert('Añade al menos un producto antes de finalizar la compra.');
return;
}
const total = cart.reduce((sum, l) => sum + findProduct(l.id).price * l.qty,
0);
alert(`Pedido confirmado. Total: ${formatPrice(total)}`);
cart = [];
updateCartUI();
toggleCart();
}
// Cerrar carrito con Escape
document.addEventListener('keydown', e => {

if (e.key === 'Escape' && document.getElementById('cart-sidebar').classList.contains('open')) {

toggleCart();
}
});
// ---------- Inicio ----------
checkAge();
renderProducts('todos');
updateCartUI();