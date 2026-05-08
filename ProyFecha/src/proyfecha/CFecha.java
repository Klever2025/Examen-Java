/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyfecha;

/**
 *
 * @author User-15
 */
public class CFecha {
    private int dia;
    private int mes;
    private int anio;
    public CFecha()
    {
        dia=0;
        mes=0;
        anio=0;
    }
    public void SetDia(int d)
    {
        dia=d;
    }
    public void SetMes(int m)
    {
        mes=m;
    }
    public void SetAnio(int a)
    {
        anio=a;
    }
    
    
public void SetFecha (int d, int m, int a)
{
dia=d;
mes=m;
anio=a;
}
public int GetDia()
{
    return dia;
}
public int GetMes()
{
    return mes;
    
}
public int GetAnio()
{
    return anio;
    
}
public int CalcularEdad()
{
    return(2026-anio);
}
}