/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.eagravos.mobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import br.com.eagravos.mobile.interfaces.Transaction;
import br.com.eagravos.mobile.modelos.Contatos;
import br.com.eagravos.mobile.tools.TransactionTask;
import br.com.eagravos.mobile.webservices.ContatosWebService;

/**
 *
 * @author barbosa
 */
public class DadosBasicos2 extends Activity implements Transaction{
    private EditText email;
    private EditText senha;
    private Button btnContinuar;
    private Button btnCancelar;
    private Contatos contato;
    
    
    
    /**
     * Called when the activity is first created.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dadosbasicos02);
 
        // Criação a mapeamento do botão
        btnContinuar= (Button) findViewById(R.id.db2continuar);
        btnCancelar=(Button) findViewById(R.id.db2cancelar);

        // Listener que irá ouvir os eventos do botão
        btnContinuar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                // Cria a chamada para a página 2
                //Intent myIntent = new Intent(v.getContext(), Principal.class);
                // startActivity(myIntent);
                new TransactionTask(DadosBasicos2.this,DadosBasicos2.this,R.string.aguarde).execute(new Void[0]);
                 
            }
        });

        
        btnCancelar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                // Cria a chamada para a página 2
                Intent myIntent = new Intent(v.getContext(), Principal.class);

                startActivity(myIntent);
            }
        });        
        
        
        
        // fim oncreate
    }

    public void execute() throws Exception {
        contato=new Contatos();
        contato.setEmail(this.email.getText().toString());
        contato.setSenha("9f7754843b48ad8cbe35e82ffdf40e12");
        
        ContatosWebService contatoService=new ContatosWebService();
        
        contato=contatoService.login(contato);
        
        
        
    }
    
    public void atualizarView() {
        if(contato!=null){
            Toast.makeText(this, "Usuario logado", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Usuario não logado", Toast.LENGTH_LONG).show();
        }
        
    }

    
    
}
