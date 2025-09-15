import tkinter as tk

from sqlalchemy import desc

# 0-sera vermelho 1-para amarelo 2-verde
estado = 0 

# somando +1 para trocar a cor 
def trocar():
    global estado
    estado = (estado+1)%3 
    desenhar()              

def desenhar():
    cores = ["grey20","grey20","grey20"]
    if estado == 0:
        cores [0] ="red"
    elif estado == 1 :
        cores[1] ="yellow"
    else:
        cores[2]="green"

        canvas.itemconfig(circulo_vermelho, fill=cores[0])
        canvas.itemconfig(circulo_amarelo, fill=cores[1])
        canvas.itemconfig(circulo_verde, fill=cores[2])


root = tk.Tk()
root.title("Semaforo")

canvas = tk.Canvas(root,width=120, height=300, bg="black")
canvas.pack(padx=10,pady=10)


circulo_vermelho = canvas.create_oval(20,20,100,100,fill="grey20")
circulo_amarelo= canvas.create_oval(20,20,110,100,190,fill="grey20")
circulo_verde = canvas.create_oval(20,200,100,280,fill="grey20")

botao = tk.Button(root,text="Trocar", command=trocar)
botao.pack(pady=(0,10))

root.bind("<space>", lambda e:trocar())

desenhar()
root.mainloop()