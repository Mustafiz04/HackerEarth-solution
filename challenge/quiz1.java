class Quiz{
    public static void main(String args[]) {
        int a = 2, b = 4;
        int c = Math.abs(a++ - --b*2);
        System.out.println(c);
    }
}