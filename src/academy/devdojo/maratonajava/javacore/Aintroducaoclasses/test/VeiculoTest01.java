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

        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
