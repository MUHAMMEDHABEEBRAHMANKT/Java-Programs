public class extclasdg {

    public class animal {

        void eating() {
            System.out.print("anima is eating");
        }

        void sleeping() {
            System.out.print("anima is sleeping");
        }

    }

    public class dog extends animal {
        void bark() {

            System.out.println(" dog is barkign");
        }

    }

    public static void main(String[] args) {

        dog ob = new dog();
        ob.sleeping();
        ob.eating();
        ob.bark();
    }
}