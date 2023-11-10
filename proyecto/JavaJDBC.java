import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JavaJDBC {

	public static void main(String[] args) {
		boolean bucle = true;
		while(bucle) {
		
			System.out.println("Menu de Datos");
			System.out.println("Selecciona segun su número");
			System.out.println();
			
			
			System.out.println("Mostrar información de los clientes. " + " 1");
			System.out.println("Mostrar los eventos. " + " 2");
			System.out.println("Mostrar Empresas. " + " 3");
			System.out.println("Mostrar Empresa y sus eventos. " + " 4");
			System.out.println("Mostrar Clientes y su evento " + " 5");
			
		    Scanner scanner = new Scanner(System.in);
			int respuesta = scanner.nextInt(); 
		    
	          if(respuesta == 1) {
	
		        try {
			            Class.forName("com.mysql.cj.jdbc.Driver");
			            Connection connection = DriverManager.getConnection(
			            		 "jdbc:mysql://mysql-8001.dinaserver.com:3306/Unidedprojectup", "Brayanblu", "5Xsjb3/-5?67"
			            );
			            Statement statement = connection.createStatement();
			            ResultSet resultSet = statement.executeQuery("select * from clientes");
			            while (resultSet.next()) {
			                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " " + resultSet.getInt(4) + " " + resultSet.getDate(5) + " " + resultSet.getString(6) + " " + resultSet.getString(7) + " " + resultSet.getString(8) + " " + resultSet.getString(9));
			                ;
	
			            }
			            
			            connection.close();
			        } catch (Exception e) {
			            System.out.println(e);
			        }
	          }
	          
	          if(respuesta == 2) {
	
	  	        try {
	  		            Class.forName("com.mysql.cj.jdbc.Driver");
	  		            Connection connection = DriverManager.getConnection(
	  		                    "jdbc:mysql://mysql-8001.dinaserver.com:3306/Unidedprojectup", "Brayanblu", "5Xsjb3/-5?67"
	  		            );
	  		            Statement statement = connection.createStatement();
	  		            ResultSet resultSet = statement.executeQuery("select * from evento");
	  		            while (resultSet.next()) {
	  		                System.out.println(resultSet.getInt(1) + " " + resultSet.getInt(2) + " " + resultSet.getDate(3) + " " + resultSet.getDate(4) + " " + resultSet.getString(5) + " " + resultSet.getString(6) + " " + resultSet.getString(7));
	  		                ;
	
	  		            }
	  		            
	  		            connection.close();
	  		        } catch (Exception e) {
	  		            System.out.println(e);
	  		        }
	            }
	          
	          if(respuesta == 3) {
	
	    	        try {
	    		            Class.forName("com.mysql.cj.jdbc.Driver");
	    		            Connection connection = DriverManager.getConnection(
	    		            		 "jdbc:mysql://mysql-8001.dinaserver.com:3306/Unidedprojectup", "Brayanblu", "5Xsjb3/-5?67"
	    		            );
	    		            Statement statement = connection.createStatement();
	    		            ResultSet resultSet = statement.executeQuery("select * from empresa");
	    		            while (resultSet.next()) {
	    		                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4) );
	    		                ;
	
	    		            }
	    		            
	    		            connection.close();
	    		        } catch (Exception e) {
	    		            System.out.println(e);
	    		        }
	              }
	          
	          if(respuesta == 4) {
	
	  	        try {
	  		            Class.forName("com.mysql.cj.jdbc.Driver");
	  		            Connection connection = DriverManager.getConnection(
	  		            		 "jdbc:mysql://mysql-8001.dinaserver.com:3306/Unidedprojectup", "Brayanblu", "5Xsjb3/-5?67"
	  		            );
	  		            Statement statement = connection.createStatement();
	  		            ResultSet resultSet = statement.executeQuery("select * from empresa join evento on empresa.IDempresa=evento.IDempresa");
	  		            while (resultSet.next()) {
	  		                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4) + " " + resultSet.getInt(5) + " " + resultSet.getInt(6) + " " + resultSet.getDate(7) + " " + resultSet.getDate(8) + " " + resultSet.getString(9) + " " + resultSet.getString(10) + " " + resultSet.getString(11));
	  		                ;
	  		            }
	  		            
	  		            connection.close();
	  		        } catch (Exception e) {
	  		            System.out.println(e);
	  		        }
	            }
	          if(respuesta == 5) {
	
	  	        try {
	  		            Class.forName("com.mysql.cj.jdbc.Driver");
	  		            Connection connection = DriverManager.getConnection(
	  		            		 "jdbc:mysql://mysql-8001.dinaserver.com:3306/Unidedprojectup", "Brayanblu", "5Xsjb3/-5?67"
	  		            );
	  		            Statement statement = connection.createStatement();
	  		            ResultSet resultSet = statement.executeQuery("select * from clientes");
	  		            while (resultSet.next()) {
	  		                System.out.println(resultSet.getString(2) + " " + resultSet.getString(7) + " " + resultSet.getString(8) );
	  		                ;
	
	  		            }
	  		            
	  		            connection.close();
	  		        } catch (Exception e) {
	  		            System.out.println(e);
	  		        }
	            }
		
	        System.out.println(" ");
			System.out.println("¿Quieres saber más información? s/n");
			
			Scanner trampa = new Scanner(System.in);
			String trampa2 = scanner.nextLine();
			
			Scanner scanner2 = new Scanner(System.in);
			String respuesta2 = scanner.nextLine(); 
			
			if (respuesta2.equals("s") || respuesta2.equals("S")) {
				bucle = true;
			} else if (respuesta2.equals("n") || respuesta2.equals("N")) {
				bucle = false;
			} else {
				bucle = false;
				System.out.print("Respuesta no valida, tiene que ser una 'n' o 's'");
				}
			
			}
          
          
		}

	}




	


