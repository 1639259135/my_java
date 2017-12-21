
public class Task03_2 {
	public static void main(String[] args) {
		for (int x = 0;x<10 ;x++ ){//假设一共有10竖排
        
            if (x<=5){//上半个三角形的情况
            
                for (int z =5-x;z>0 ;z-- ){//前边的空格是一个越来越少的三角形形态，所以定义为5-x
                
                    System.out.print(" ");
                }
                for (int y=0;y<x ;y++ ){//这里了开始就进入正题了，
                
                    if (y==0 | y==x-1){ //这是两边的框， 此时输出“* ”
                    
                        System.out.print("* ");
                    }else{//中间剩下的部分输出空格
                        System.out.print("  ");
                    }
                }
            }else{                
                for (int z =0;z<x-5 ;z++ ){ //此时前边空格形态是上少下多，正好为x-5；
                
                    System.out.print(" ");// 不多说，先把空格怼进去
                }
                for (int y=10-x;y>0 ;y-- ){// 10-x为有几列
                
                    if (y==1 | y==10-x ){ //第一列和10-x（最后一列）输出“*”做一个框出来
                    
                        System.out.print("* ");
                    }else{  //中间部分输出空格
                        System.out.print("  ");
                    }
                }            
            }
            System.out.println("");
        }
	}

}
