package topic11;

import kong.unirest.Unirest;

public class CatFactAPI {

    public static void main(String[] args) {
        String url = "https://catfact.ninja/fact";
//        String catFact = Unirest.get(url).asString().getBody(); // get json string
        CatFact catFact = Unirest.get(url).asObject(CatFact.class).getBody(); // get CatFact object
        String fact = catFact.getFact();
        int length = catFact.getLength();
        System.out.println("A cat fact is:\n" + fact);
        System.out.println("The fact is " + length + " characters long");
    }
}

class CatFact {
    // a new class to create CatFact object
    private String fact;
    private int length;

    // getters
    public String getFact() {
        return fact;
    }

    public int getLength() {
        return length;
    }

}
