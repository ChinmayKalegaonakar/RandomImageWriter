package brush;

public class CircleBrush extends Brush{
	
	//bresenhams
	public CircleBrush() {
        this(2);
    }
	public CircleBrush(int radius) {
		this.WIDTH = 2*radius;
		this.HEIGHT = 2*radius;
		this.BRUSH_NAME = "CIRCLE_BRUSH";
		this.pattern = new int[this.HEIGHT][this.WIDTH];
		int side = radius;
		for(int i = 0; i<side ;i++) {
			for(int j = 0; j < side;j++) {
				if(j == (side-1)/2)
					this.pattern[i][j] = 1;
				else if(i == (side-1)/2 )
					this.pattern[i][j] = 1;
				else
					this.pattern[i][j]=0;
			
			}
		}
		int P = 1 - radius; 
		int x = this.WIDTH;
		int y = this.HEIGHT-1;
		int x_centre = this.WIDTH/2;
		int y_centre = this.HEIGHT/2;
		while (x > y) { 
            
            y++; 
          
            
            if (P <= 0) P = P + 2 * y + 1; 
            else { 
                x--; 
                P = P + 2 * y - 2 * x + 1; 
            } 
          
            
            if (x < y) 
                break; 
          
            // Printing the generated point and its  
            // reflection in the other octants after 
            // translation 
            System.out.print("(" + (x + x_centre)  + ", " + (y + y_centre) + ")"); 
                      
            System.out.print("(" + (-x + x_centre)  + ", " + (y + y_centre) + ")"); 
                      
            System.out.print("(" + (x + x_centre) +  ", " + (-y + y_centre) + ")"); 
                      
            System.out.println("(" + (-x + x_centre)  + ", " + (-y + y_centre) + ")"); 
          
            // If the generated point is on the  
            // line x = y then the perimeter points 
            // have already been printed 
            if (x != y) { 
                  
                System.out.print("(" + (y + x_centre) + ", " + (x + y_centre) + ")"); 
                        
                System.out.print("(" + (-y + x_centre)  + ", " + (x + y_centre) + ")"); 
                        
                System.out.print("(" + (y + x_centre)  + ", " + (-x + y_centre) + ")"); 
                        
                System.out.println("(" + (-y + x_centre)  + ", " + (-x + y_centre) +")"); 
            } 
        } 
	}

}
