


public class ProductDFA {

    
    public static void main(String[] args) {
        char[][] automata1 = 
        {
            {'1','1','2','E','E','E','E','E','E','E','E','E','E','E'},
            {'E','E','E','E','E','E','E','E','E','E','E','E','3','4'},
            {'E','E','E','E','E','E','E','E','E','E','E','E','E','4'},
            {'3','3','3','3','3','3','3','3','3','3','E','E','E','4'},
            {'5','5','6','E','E','E','E','E','E','E','5','6','E','E'},
            {'E','E','E','E','E','E','E','E','E','E','E','E','7','8'},
            {'E','E','E','E','E','E','E','E','E','E','E','E','E','8'},
            {'7','7','7','7','7','7','7','7','7','7','E','E','E','8'},
            {'E','9','9','9','9','E','E','E','E','E','E','E','E','E'},
            {'E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
            {'E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
        };
        char[][] automata2 = 
        {
            {'1','1','1','1','1','1','1','1','1','1','1','1', 'E','E'},
            {'1','1','1','1','1','1','1','1','1','1','E','E', '2','E'},
            {'2','2','2','2','2','2','2','2','2','2','E','E', 'E','E'},
            {'E','E','E','E','E','4','E','E','E','E','E','E', 'E','E'},
            {'4','4','4','4','4','4','4','4','4','4','E','E', 'E','5'},
            {'5','5','5','5','5','5','5','5','5','5','5','5', '5','5'},
            {'E','E','E','E','E','E','E','E','E','E','E','E', 'E','E',}         
        };
        
        String[] nodos1 = {"0","1","2","3","4","5","6","7","8","9","E"};
        String[] nodos2 = {"0","1","2","3","4","5","E"};
        
        
        int nFuncionesTransicion = automata1[0].length;
        int nEstados1 = automata1.length, nEstados2 = automata2.length;
        int filasEliminadas = 0;
        char Error = 'E';
        String[][] producto = new String[nEstados1 * nEstados2][nFuncionesTransicion];
        String[] indices = new String[nEstados1*nEstados2];
        boolean[] apariciones = new boolean[nEstados1*nEstados2];
        
        for(int k = 0; k < nEstados2; k++)
            for(int i = 0; i < nEstados1; i++)
                for(int j = 0; j < nFuncionesTransicion; j++)
                    producto[k*10 + i + k][j] = automata1[i][j]+"_"+automata2[k][j];
        
        for(int i = 0; i < nEstados2; i++)
            for(int j = 0; j < nEstados1; j++)
                indices[i*10+j+i] = nodos1[j]+"_"+nodos2[i];
                
        
            
        
        /**
         * OUTPUT
         */
        for(int k = 0; k < nEstados2; k++)
        {
            for(int i = 0; i < nEstados1; i++)
            {
                if(i == 10 && k == 6) System.out.print("["+Error+","+Error+"]");
                else if(i == 10) System.out.print("["+Error+","+k+"]");
                else if(k == 6) System.out.print("["+i+","+Error+"]");
                else System.out.print("["+i+","+k+"]");

                for(int j = 0; j < nFuncionesTransicion; j++)
                    System.out.print("{"+producto[k*10 + i + k][j]+"} ");
                

                System.out.println();
            }
        }
        
        
        
    }
    
}
