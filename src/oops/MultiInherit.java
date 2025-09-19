package oops;

class Person{
	void Bio(String name, int age) {
		System.out.println(name+" had turned "+age+" this year");
	}
}
class Employee extends Person {
	void Earning(String name, int age, double salary) {
		System.out.println(name+ " is earning "+salary+ " at "+age);
	}
}
class Manager extends Employee {
	void Extra(String name, double bonus) {
		System.out.println(name+ " earned a bonus of "+bonus);
	}
}
public class MultiInherit {

	public static void main(String[] args) {
		Manager obj = new Manager();
		obj.Bio("Krish",21);
		obj.Earning("Krish",21, 1234567);
		obj.Extra("Krish",10000);
	}
}
