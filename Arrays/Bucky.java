package Arrays;

public class Bucky{
    public static void main(String args[]){
        String[] words = {"funk", "chunk", "furry", "baconator"};

        //startsWith
        for(String w : words){
            if(w.startsWith("fu")){
                System.out.println(w + " Starts with fu");
            }
        }

        //endsWith
        for(String w: words){
            if(w.endsWith("unk")){
                System.out.println(w + " ends with unk");
            }
        }

        String s = "bucklemyShoeandletshavesomedrink";
//        System.out.println(s.indexOf("b", 5));
        System.out.println(s.indexOf("Shoe"));

        String a = "Bacon";
        String b = "monster";
        System.out.println(a.concat(b));

        System.out.println(a.replace("B", "F"));
        System.out.println(b.toUpperCase());

//        String t = a.charAt(2);
//        System.out.println(t.toUpperCase());


        //
    }
}