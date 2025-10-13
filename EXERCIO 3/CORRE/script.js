function ex1() {
const nomes = ['Ana', 'João', 'Maria', 'Ricardo', 'Caio'];
const nomes2 = ['Joana', 'Marcos', 'Amanda', 'Gustavo', 'Jessica']


const listaCompleta = nomes.concat(nomes2);
document.writeln(listaCompleta);
}

function ex2(){
const nomes = [
"Ana", "Carlos", "Beatriz", "Eduardo", "Fernanda",
"Gustavo", "Helena", "Igor", "Júlia", "Luiz",
"Mariana", "Nicolas", "Olga", "Paulo", "Quésia",
"Rafael", "Sandra", "Thiago", "Ulisses", "Vera"
];
const nomes2 = nomes.slice(10);
document.writeln(nomes2);
}

function ex3() {
const numeros = [12, 57, 34, 89, 25, 47, 61, 93, 18, 73];
const numerosInvertidos = [];
i = 9
numeros.forEach((numero) => {
numerosInvertidos[i] = numero;
i--;
}
);
document.writeln(numerosInvertidos);
}
