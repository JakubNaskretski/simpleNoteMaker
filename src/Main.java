public class Main {

    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m, v);
//        c.initController();
    }

}
