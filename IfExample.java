class IfExample {
public static void main(String args[]) {
int x, y;
x=10;
y=20;
if(x<y) System.out.println("x is less than y");
x = x * 2;
if (x==y) System.out.println("Now x and y are equal");
x = x * 2;
if(x==y) System.out.println("You wont see this line");
}}