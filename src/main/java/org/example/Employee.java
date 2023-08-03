package org.example;

public class Employee extends Person {
    private int numEmpleado;

    public Employee(String name, int age, int numEmpleado) {
        super(name, age);
        this.numEmpleado = numEmpleado;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
}
