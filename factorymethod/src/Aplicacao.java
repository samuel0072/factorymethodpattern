import java.util.ArrayList;

public abstract class Aplicacao{
    private ArrayList<Documento> docs = new ArrayList <Documento> (  );

    public abstract Documento criarDoc();

    public void abrirDoc(Documento doc) {
        doc.abrir();
    }

    public void novoDoc() {
        Documento novo = criarDoc ();
        docs.add ( novo );
        novo.abrir();
    }
}
