from PyQt6.QtCore import QDate, QSize, Qt
from PyQt6.QtWidgets import QApplication, QMessageBox,QDateEdit, QHBoxLayout, QRadioButton, QTextEdit, QWidget, QPushButton,QMainWindow,QLabel,QLineEdit,QVBoxLayout,QCheckBox,QComboBox,QListWidget,QAbstractItemView,QSlider,QDial,QCalendarWidget
from PyQt6.QtGui import QPixmap



   

       

        

        



class MainWindow(QMainWindow): 

    def __init__(self):
        super().__init__()
        #Widget Principal
        widget = QWidget() #importante para mostrar la interfaz

        # Vertical y horizontal
        vertical = QVBoxLayout()
        fila1 = QHBoxLayout()
        fila2 = QHBoxLayout()



        #RadioButtons
        alagon = QRadioButton("Alagon")
        valencia = QRadioButton("Comunitat Valensiana")

        #ComboBox
        boxAlagon = QComboBox()
        boxValencia = QComboBox()

        #Listas
        boxAlagon.addItems(["Teruel","Zalagoza","Huesca"])
        boxValencia.addItems(["Alicante","Valensia","Castellon"])

        fila1.addWidget(alagon)
        fila1.addWidget(valencia)

        vertical.addLayout(fila1)



        widget.setLayout(vertical)


        self.setCentralWidget(widget)




    
        
        
        




        
    







        





app = QApplication([])

window = MainWindow()


window.show()

app.exec()