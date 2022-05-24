public class ExternalClass {

    public int x = 10;
    public int y = 20;

    class InternalClass {

        public int z = 30;

        void internalClassMethod(int z) {
            System.out.println("x = " + z);
            System.out.println("this.z = " + this.z);
            System.out.println("InternalClass.this.x = " + ExternalClass.this.x);
            System.out.println("InternalClass.this.y = " + ExternalClass.this.y);
        }
    }

    public static void main(String[] args) {
        ExternalClass st = new ExternalClass();
        ExternalClass.InternalClass fl = st.new InternalClass();
        fl.internalClassMethod(23);
    }
}
