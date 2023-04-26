public class Disciplina {
    private ICalcMedia _CalcMedia;
    private double _Media;
    private String _Nome;
    private double _P1;
    private double _P2;
    private String _Situacao;
    public String getNome()
    {
        return this._Nome;
    }
    public double getMedia()
    {
        return this._Media;
    }
    public String getSituacao()
    {
        return this._Situacao;
    }
    public Disciplina(){

    }

    public Disciplina(ICalcMedia calcMedia,String nome,double p1,double p2)
    {
        this._CalcMedia = calcMedia;
        this._Nome = nome;
        this._P1 = p1;
        this._P2 = p2;
    }
    public void CalculaMedia()
    {
        double resultado = _CalcMedia.CalculaMedia(_P1,_P2);
        this._Media = resultado;
        this._Situacao = _CalcMedia.Situacao(resultado);
    }
}
