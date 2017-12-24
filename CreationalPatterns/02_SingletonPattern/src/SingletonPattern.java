public class SingletonPattern {

    public static void main(String[] args) {
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        SingleObject singleObject = SingleObject.getInstance(); //only object aviable
        singleObject.showMessage();
    }
}
