public class Translate <Key, String> {
    private Key key;
    private String string;
    public Translate(Key _key, String _string){
        this.key = _key;
        this.string = _string;
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
}
