package model;
import java.util.ArrayList;
import java.util.List;

public class Grammar {
    private List<String> t;
    private List<String> n;
    private List<String> p;
    private String s;

    public Grammar(String s){
        this.s = s;
        t = new ArrayList<>();
        n = new ArrayList<>();
        p = new ArrayList<>();
    }

    public List<String> getT() {
        return t;
    }

    public void setT(List<String> t) {
        this.t = t;
    }

    public List<String> getN() {
        return n;
    }

    public void setN(List<String> n) {
        this.n = n;
    }

    public List<String> getP() {
        return p;
    }

    public void setP(List<String> p) {
        this.p = p;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
