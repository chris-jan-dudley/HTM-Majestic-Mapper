/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmmajestic;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author Chris
 */
public class HTMMajestic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("Tutorial 1");
        graph.addNode("A");
        graph.getNode("A").addAttribute("ui.style", "fill-color: rgb(0,100,255);");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("AB", "A", "B");
        graph.getEdge("AB").addAttribute("ui.style", "fill-color: rgb(0,100,255);weight:10px;");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");
        graph.display();
    }

}
