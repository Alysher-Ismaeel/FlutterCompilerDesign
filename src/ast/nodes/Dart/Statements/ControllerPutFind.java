package ast.nodes.Dart.Statements;

import ast.nodes.Dart.Istedaaaclass;
import ast.nodes.Node;

import java.util.ArrayList;

public class ControllerPutFind extends Node {
    private ArrayList<String> vars;
    Istedaaaclass istedaaaclass ;


    public Istedaaaclass getIstedaaaclass() {
        return istedaaaclass;
    }

    public void setIstedaaaclass(Istedaaaclass istedaaaclass) {
        this.istedaaaclass = istedaaaclass;
    }


    public ArrayList<String> getVars() {
        return vars;
    }

    public void setVars(ArrayList<String> vars) {
        this.vars = vars;
    }

    @Override
    public String toString() {
        if (vars != null) {
            return
                    "\nControllerPutFind{"+ "var1='" + vars.get(0) + '\'' +
                            ", var2='" + vars.get(1) + '\'' + ", CallClass=" + istedaaaclass +
                    "\n}";
        }
        return
                "\nControllerPutFind{"+
                        ", vars='" + null + '\'' + ", CallClass=" + istedaaaclass +
                        "\n}";
    }
}
