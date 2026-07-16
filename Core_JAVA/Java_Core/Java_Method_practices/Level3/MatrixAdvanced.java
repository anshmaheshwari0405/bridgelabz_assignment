import java.util.*;
public class MatrixAdvanced {
    public static double[][] randomMatrix(int r,int c){
        double[][] m=new double[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=Math.round(Math.random()*10);
        return m;
    }
    public static double[][] transpose(double[][] a){
        int r=a.length,c=a[0].length; double[][] t=new double[c][r];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) t[j][i]=a[i][j];
        return t;
    }
    public static double det2(double[][] a){ return a[0][0]*a[1][1]-a[0][1]*a[1][0]; }
    public static double det3(double[][] m){
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    public static double[][] inverse2(double[][] a){
        double d = det2(a); if(d==0) return new double[][]{};
        return new double[][]{{a[1][1]/d, -a[0][1]/d},{-a[1][0]/d, a[0][0]/d}};
    }
    public static double[][] inverse3(double[][] m){
        double d = det3(m); if(d==0) return new double[][]{};
        double[][] inv = new double[3][3];
        for(int i=0;i<3;i++) for(int j=0;j<3;j++){
            double cofactor = ((i+j)%2==0?1:-1) * (
                m[(j+1)%3][(i+1)%3]*m[(j+2)%3][(i+2)%3] - m[(j+1)%3][(i+2)%3]*m[(j+2)%3][(i+1)%3]
            );
            inv[i][j] = cofactor / d;
        }
        return inv;
    }
    public static void print(double[][] m){
        for(double[] r:m){ for(double x:r) System.out.print(x+" "); System.out.println(); }
    }
    public static void main(String[] args){
        double[][] a = randomMatrix(3,3);
        System.out.println("A"); print(a);
        System.out.println("Transpose"); print(transpose(a));
        System.out.println("Determinant 3x3: "+det3(a));
        System.out.println("Inverse 3x3"); print(inverse3(a));
        double[][] b = new double[][]{{1,2},{3,4}};
        System.out.println("Det2:"+det2(b));
        System.out.println("Inv2"); print(inverse2(b));
    }
}
