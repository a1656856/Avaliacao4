package utfpr.ct.dainf.if62c.avaliacao;

import java.util.Date;
import java.util.TimerTask;

/**
 * IF62C Fundamentos de Programação 2 Avaliação parcial.
 *
 * @author
 */

public class Aviso extends TimerTask {

    protected final Compromisso compromisso;

    public Aviso(Compromisso compromisso) {
        this.compromisso = compromisso;
    }

    @Override
    public void run() {
        Date data = compromisso.getData();
        Date dataAtual = new Date();
        long d2 = data.getTime();
        long d1 = dataAtual.getTime();
        System.out.println(compromisso.getDescricao() + " começa em " + (d2 - d1) / 1000 + "s.");
    }

    public Compromisso getCompromisso() {
        return compromisso;
    }
}
