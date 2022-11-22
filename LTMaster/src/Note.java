public class Note {
    /* 
        Java String
     */
    //  StringBuilder vs StringBuffer
    //  https://www.digitalocean.com/community/tutorials/string-vs-stringbuffer-vs-stringbuilder
    //  StringBuffer is Thread Safe, but StringBuilder is not

    //  String vs StringBuilder vs StringBuffer
    //  String is immutable but the other two is mutable
    public void test1(){
        StringBuilder stb = new StringBuilder();
        stb.append(0);
        System.out.println(stb);
    }
}
