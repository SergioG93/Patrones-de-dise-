public abstract class Template
{
 public final void prepararBebida()
 {
 HervirAgua();
 PonerLeche();
 PonerAzucar();
 PonerCafe();
 PonerTe();
 Costo();
 System.out.println("Bebida lista");
 }

 public abstract void HervirAgua();

 public abstract void PonerLeche();

 public abstract void PonerAzucar();

 public abstract void PonerCafe();

 public abstract void PonerTe();

 public abstract void Costo();

}


