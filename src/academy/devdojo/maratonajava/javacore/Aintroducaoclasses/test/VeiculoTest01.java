package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Veiculo;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo();
        Veiculo carro2 = new Veiculo();
        carro1.nome = "Toyota";
        carro1.modelo = "Etios";
        carro1.ano = 2026;
        carro2.nome = "Onix";
        carro2.modelo = "Joy";
        carro2.ano = 2025;
        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
