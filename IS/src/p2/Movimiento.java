package p2;

import java.util.Date;

public class Movimiento 
{
	public String mConcepto;
	public Date mFecha;
	public double mImporte;
 
	public Movimiento()
	{
		mFecha=new Date();
	}
	
	public double getImporte() 
	{
		return mImporte;
	}

	public String getConcepto()
	{
		return mConcepto;
	}

	public void setConcepto(String newMConcepto)
	{
		mConcepto = newMConcepto;
	}

	public Date getFecha()
	{
		return mFecha;
	}

	public void setFecha(Date newMFecha)
	{
		mFecha = newMFecha;
	}


	public void setImporte(double newMImporte)
	{
		mImporte = newMImporte;
	}
}