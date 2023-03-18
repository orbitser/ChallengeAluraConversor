package alura_challenge_divisas;

import javax.swing.*;

public class Conversor {

    public static void main(String[] args) {
        String[] opcionesConversion = {"Monedas", "Distancias", "Pesos"};
        String conversion = (String) JOptionPane.showInputDialog(null, "¿Qué desea convertir?", "Menú Principal", 
        		JOptionPane.PLAIN_MESSAGE, null, opcionesConversion, opcionesConversion[0]);
        
        if (conversion == null) {
            JOptionPane.showMessageDialog(null, "Ha cancelado la operación. ¡Hasta luego!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if (conversion.equals("Monedas")) {
            String[] opcionesMonedas = {"MXN a USD", "USD a MXN", "MXN a EUR", "EUR a MXN", "MXN a GBP", "GBP a MXN", "MXN a JPY", "JPY a MXN", "MXN a KRW", "KRW a MXN"};
            String monedaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione la moneda a la que desea convertir:", "Conversor de Monedas", 
            		JOptionPane.PLAIN_MESSAGE, null, opcionesMonedas, opcionesMonedas[0]);
            
            if (monedaSeleccionada == null) { 
                JOptionPane.showMessageDialog(null, "Ha cancelado la operación. ¡Hasta luego!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            double valorConversion = 0;
            while (true) {
                try {
                    valorConversion = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la Divisa que desea convertir a " + monedaSeleccionada + ":"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: El valor ingresado debe de ser numérico!. Intente nuevamente por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Ha cancelado la operación. ¡Hasta luego!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0); 
                }
            }

            double resultado = 0;
            String divisa1 = ""; 	 
            String divisa2 = ""; 	
            					 	       
            switch (monedaSeleccionada) {
                case "MXN a USD":
					resultado = valorConversion / 19;
					divisa1 = "MXN";
					divisa2 = "USD";
					break;
				
				case "USD a MXN":
					resultado = valorConversion * 19;
					divisa1 = "USD";
					divisa2 = "MXN";
					break;
                
				case "MXN a EUR":
					resultado = valorConversion / 20;
                    divisa1 = "MXN";
                    divisa2 = "EUR";
                    break;
                case "EUR a MXN":
                	resultado = valorConversion * 20;
                    divisa1 = "EUR";
                    divisa2 = "MXN";
                    break;
                case "MXN a GBP":
                	resultado = valorConversion / 23;
                    divisa1 = "MXN";
                    divisa2 = "GBP";
                    break;
                case "GBP a MXN":
                	resultado = valorConversion * 23;
                    divisa1 = "GBP";
                    divisa2 = "MXN";
                    break;
                case "MXN a JPY":
                	resultado = valorConversion * 0.14;
                    divisa1 = "MXN";
                    divisa2 = "JPY";
                    break;
                case "JPY a MXN":
                	resultado = valorConversion / 0.14;
                    divisa1 = "JPY";
                    divisa2 = "MXN";
                    break;
                case "MXN a KRW":
                	resultado = valorConversion * 0.014;
                    divisa1 = "MXN";
                    divisa2 = "KRW";
                    break;
                case "KRW a MXN":
                	resultado = valorConversion / 0.014;
                    divisa1 = "KRW";
                    divisa2 = "MXN";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, por favor seleccione una conversión.");
                    return;
            }
            
            JOptionPane.showMessageDialog(null, valorConversion + " " + divisa1 + " equivalen a " + resultado + " " + divisa2 + ".", "Conversión realizada exitosamente", JOptionPane.INFORMATION_MESSAGE);
            
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                main(args);
            } else {
                JOptionPane.showMessageDialog(null, "Muchas gracias por usar el programa de conversión. ¡Vuelva pronto!", "Despedida", JOptionPane.INFORMATION_MESSAGE);
            }
        	
        	}   
        
        	else if (conversion.equals("Distancias")) {
            String[] opcionesDistancias = {"Metros a Pies", "Pies a Metros", "Kilómetros a Millas", "Millas a Kilómetros"};
            String distanciaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione la distancia a la que desea convertir:", "Conversor de Distancias", 
            		JOptionPane.PLAIN_MESSAGE, null, opcionesDistancias, opcionesDistancias[0]);
            
            if (distanciaSeleccionada == null) { 
                JOptionPane.showMessageDialog(null, "Ha cancelado la operación. ¡Hasta luego!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            double valorDistancia = 0;
            while (true) {
                try {
                    valorDistancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la Distancia que desea convertir a " + distanciaSeleccionada + ":"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: El valor ingresado debe de ser numérico!. Intente nuevamente por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Ha cancelado la operación. ¡Hasta luego!", "Despedida", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0); 
                }
            }
			
			double resultado = 0;
            String unidad1 = "";
            String unidad2 = "";
            switch (distanciaSeleccionada) {
                case "Metros a Pies":
                    resultado = valorDistancia * 3.28084;
                    unidad1 = "Metros";
                    unidad2 = "Pies";
                    break;
                case "Pies a Metros":
                    resultado = valorDistancia / 3.28084;
                    unidad1 = "Pies";
                    unidad2 = "Metros";
                    break;
                case "Kilómetros a Millas":
                    resultado = valorDistancia * 0.621371;
                    unidad1 = "Kilómetros";
                    unidad2 = "Millas";
                    break;
                case "Millas a Kilómetros":
                    resultado = valorDistancia / 0.621371;
                    unidad1 = "Millas";
                    unidad2 = "Kilómetros";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, por favor seleccione una conversión.");
                    return;
            }	
			
			JOptionPane.showMessageDialog(null, valorDistancia + " " + unidad1 + " equivalen a " + resultado + " " + unidad2 + ".", "Conversión realizada exitosamente", JOptionPane.INFORMATION_MESSAGE);
			
			int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                main(args);
            } else {
                JOptionPane.showMessageDialog(null, "Muchas gracias por usar el programa de conversión. ¡Vuelva pronto!", "Despedida", JOptionPane.INFORMATION_MESSAGE);
            }
        	
        	}         
        	
        	else if (conversion.equals("Pesos")) {
            String[] opcionesPesos = {"Kilogramos a Libras", "Libras a Kilogramos", "Gramos a Onzas", "Onzas a Gramos"};
            String pesoSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione el peso que desea convertir:", "Conversor de Pesos", 
            		JOptionPane.PLAIN_MESSAGE, null, opcionesPesos, opcionesPesos[0]);
            
            if (pesoSeleccionado == null) { 
                JOptionPane.showMessageDialog(null, "Ha cancelado la operación. ¡Hasta luego!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            double valorPeso = 0;
            while (true) {
                try {
                    valorPeso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el Peso que desea convertir a " + pesoSeleccionado + ":"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: El valor ingresado debe de ser numérico!. Intente nuevamente por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Ha cancelado la operación. ¡Hasta luego!", "Despedida", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0); 
                }
            }
			
			double resultado = 0;
            String unidad1 = "";
            String unidad2 = "";
            switch (pesoSeleccionado) {
                case "Kilogramos a Libras":
                    resultado = valorPeso * 2.20462;
                    unidad1 = "Kilogramos";
                    unidad2 = "Libras";
                    break;
                case "Libras a Kilogramos":
                    resultado = valorPeso / 2.20462;
                    unidad1 = "Libras";
                    unidad2 = "Kilogramos";
                    break;
				case "Gramos a Onzas":
                    resultado = valorPeso / 28.35;
                    unidad1 = "Gramos";
                    unidad2 = "Onzas";
                    break;
                case "Onzas a Gramos":
                    resultado = valorPeso * 28.35;
                    unidad1 = "Onzas";
                    unidad2 = "Gramos";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, por favor seleccione una conversión.");
                    return;
            }	
			
			JOptionPane.showMessageDialog(null, valorPeso + " " + unidad1 + " equivalen a " + resultado + " " + unidad2 + ".", "Conversión realizada exitosamente", JOptionPane.INFORMATION_MESSAGE);
			
			int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                main(args);
            } else {
                JOptionPane.showMessageDialog(null, "Muchas gracias por usar el programa de conversión. ¡Vuelva pronto!", "Despedida", JOptionPane.INFORMATION_MESSAGE);
            }
        	
        	} 
        	
        	else {
            JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
            main(args);
        	}
        
    }
    
}
