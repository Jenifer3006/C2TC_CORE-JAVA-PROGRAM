package day6;

public class student {
 private String name;
 private static int id;
 private int reg;
 public student() {
 id++;
 reg++;
 System.out.println("constructor called");
 }
 static {
	 System.out.println("static block executed");
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public static int getId() {
	return id;
 }
 public static void setId(int id) {
	student.id = id;
 }
 public int getReg() {
	return reg;
 }
 public void setReg(int reg) {
	this.reg = reg;
 }
 @Override
 public String toString() {
	return "student [id:"+id+", name=" + name + ", reg=" + reg + "]";
 }
 }
 
 
