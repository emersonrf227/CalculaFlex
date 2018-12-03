package br.com.emerson.calculaflex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.emerson.calculaflex.extentions.getDouble
import br.com.emerson.calculaflex.watchers.DecimalTextWatcher
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)


          etGasPrice.addTextChangedListener(DecimalTextWatcher(etGasPrice))
          etEthanolPrice.addTextChangedListener(DecimalTextWatcher(etEthanolPrice))
          etGasAverege.addTextChangedListener(DecimalTextWatcher(etGasAverege, 1))
          etEthanolAverege.addTextChangedListener(DecimalTextWatcher(etEthanolAverege, 1))





        btCalculate.setOnClickListener {
           val proximaTela = Intent(this, ResultActivity::class.java)
            proximaTela.putExtra ("GAS_PRICE", etGasPrice.getDouble())
            proximaTela.putExtra ("ETHANOL_PRICE", etEthanolPrice.getDouble())
            proximaTela.putExtra ("GAS_AVEREGE", etGasAverege.getDouble())
            proximaTela.putExtra ("ETHANOL_AVEREGE", etEthanolAverege.getDouble())
            startActivity(proximaTela)

        }
    }
}
