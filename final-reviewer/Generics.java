

// Generic means parameterized types. 
// The idea is to allow type (Integer, String, … etc., and user-defined types) 
// to be a parameter to methods, classes, and interfaces. 
// Using Generics, it is possible to create classes that work with different data types. 
// An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

public class Generics {

    public static void main(String[] args) {

        Gen<String> myData = new Gen<String>(); // created an object that is specifically for String
        Gen<Integer> myData2 = new Gen<Integer>(); // created an object that is specifically for Integers
        Gen<Double> myData3 = new Gen<Double>(); // created an object that is specifically for Double
        TwoGen<String, Integer> myData4 = new TwoGen<String, Integer>(); // created an object that allows String and Integer

        // data 1

        myData.setData("Hello");
        
        System.out.println(myData.getData());

        myData.showDataType();
 
        // data 2
        myData2.setData(20);

        System.out.println(myData2.getData());

        myData2.showDataType();
     
        // data 3

        myData3.setData(2.2);

        System.out.println(myData3.getData());

        myData3.showDataType();

        // data 4

        myData4.setData("World", 30);

        String dataString = myData4.getType1Data();
        int dataInt = myData4.getType2Data();

        System.out.println(dataString);
        System.out.println(dataInt);

        
    }
    
}

class Gen<Type> {

    private Type data;

    public void setData(Type data) {
        this.data = data;
    }
    public Type getData() {
        return data;
    }
    public void showDataType() {
        System.out.println("Type is: "+data.getClass().getName());
    }
}

class TwoGen<Type1, Type2> {

    private Type1 data;
    private Type2 data2;

    public void setData(Type1 data, Type2 data2) {

        this.data = data;
        this.data2 = data2;
    }
    public Type1 getType1Data() {

        return data;

    }
    public Type2 getType2Data() {

        return data2;

    }

}
