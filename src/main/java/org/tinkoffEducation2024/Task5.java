//package org.tinkoffEducation2024;
//
//import java.util.*;
//
//public class Task5 {
//
//
//    class Edge {
//        public final Node source;
//        public final Node target;
//
//        public Edge(Node source, Node target) {
//            this.source = source;
//            this.target = target;
//        }
//
//        class Node {
//            char glade;
//            int weight;
//            List<Edge> outcomingEdges = new ArrayList<>();
//
//
//            public Node(char glade, int weight) {
//                this.glade = glade;
//                this.weight = weight;
//            }
//
//            public class createGraph {
//                final Map<String, Node> nodes = new HashMap<>();
//                final Map<String, Edge> edges = new HashMap<>();
//
//                public void createNode (String id, char glade) {
//                    int weight;
//                    if (glade == 'C') {
//                        weight = 1;
//                    } else weight = 0;
//                    Node node = new Node(glade, weight);
//                    nodes.put(id, node);
//                }
//
//
//                /*for(int line = 0; line < lines; line++){
//                    for(int j = 0; j < 3; j++){
//
//                    }
//                    Math.max(0, )
//                }*/
//                }
//            }
//
//        }
//
//
//        //// решение неверное. думаю
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        char[][] forest = new char[n][3];
//        scanner.nextLine();
//        for (int i = 0; i < n; i++) {
//            forest[i] = scanner.nextLine().toCharArray();
//        }
//        System.out.println(maxMashrooms(n, forest));
//    }
//}
//
//
//            /*for(
//    char cell :way)
//
//    {
//        count++;
//        if (cell == 'C' && Math.abs(prevPoint - count) < 2) {
//            prevPoint = count;
//            mushrooms++;
//            break;
//        }
//        if (cell == 'W') {
//            pointWWW++;
//        }
//        prevPoint = count;
//    }
//            if(pointWWW ==3)
//
//    {
//        break;
//    }
//
//    maxMushrooms +=mushrooms;
//    count =0;
//}
//
//        System.out.
//
//println(maxMushrooms);
//    }
//            }
//
//*/