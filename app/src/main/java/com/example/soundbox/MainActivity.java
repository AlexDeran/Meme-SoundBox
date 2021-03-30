package com.example.soundbox;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;

    ArrayList<SoundObject> soundList = new ArrayList<>();

    RecyclerView mSoundView;

    SoundboxRecyclerAdapter mSoundAdapter = new SoundboxRecyclerAdapter(soundList);

    RecyclerView.LayoutManager mSoundLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.soundbox_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        List<String> nameList = Arrays.asList(getResources().getStringArray(R.array.soundsNames));

        SoundObject[] soundItems = {
                new SoundObject(nameList.get(0), R.raw.a_lot_of_damage),
                new SoundObject(nameList.get(1), R.raw.accelere_accelere),
                new SoundObject(nameList.get(2), R.raw.accordeon_court),
                new SoundObject(nameList.get(3), R.raw.ah),
                new SoundObject(nameList.get(4), R.raw.ah_sa_mere),
                new SoundObject(nameList.get(5), R.raw.ah_sa_mere_taper_peage),
                new SoundObject(nameList.get(6), R.raw.ahhhhhhhh),
                new SoundObject(nameList.get(7), R.raw.aie_aie_aie),
                new SoundObject(nameList.get(8), R.raw.air_horn),
                new SoundObject(nameList.get(9), R.raw.allez_mega_fiesta),
                new SoundObject(nameList.get(10), R.raw.another_one),
                new SoundObject(nameList.get(11), R.raw.aux_ordres),
                new SoundObject(nameList.get(12), R.raw.avec_du_savon),
                new SoundObject(nameList.get(13), R.raw.be_gone_thot),
                new SoundObject(nameList.get(14), R.raw.bitconnect_wow),
                new SoundObject(nameList.get(15), R.raw.bruh),
                new SoundObject(nameList.get(16), R.raw.bruma),
                new SoundObject(nameList.get(17), R.raw.buena_sera_norman),
                new SoundObject(nameList.get(18), R.raw.but_somptueux),
                new SoundObject(nameList.get(19), R.raw.ca_va_peter),
                new SoundObject(nameList.get(20), R.raw.ca_va_peter_full),
                new SoundObject(nameList.get(21), R.raw.ca_cetait_gratuit),
                new SoundObject(nameList.get(22), R.raw.cest_des_saucisses),
                new SoundObject(nameList.get(23), R.raw.cest_honteux),
                new SoundObject(nameList.get(24), R.raw.cest_non),
                new SoundObject(nameList.get(25), R.raw.cest_parti),
                new SoundObject(nameList.get(26), R.raw.cest_pas_toi_qui_decide),
                new SoundObject(nameList.get(27), R.raw.cest_quoi_ce_monde),
                new SoundObject(nameList.get(28), R.raw.cetait_sur),
                new SoundObject(nameList.get(29), R.raw.checker_moi_ca),
                new SoundObject(nameList.get(30), R.raw.coffin_dance_meme),
                new SoundObject(nameList.get(31), R.raw.colere_noire),
                new SoundObject(nameList.get(32), R.raw.combien),
                new SoundObject(nameList.get(33), R.raw.comme_une_balle),
                new SoundObject(nameList.get(34), R.raw.couhizinne),
                new SoundObject(nameList.get(35), R.raw.coup_de_clim),
                new SoundObject(nameList.get(36), R.raw.coup_du_foulard),
                new SoundObject(nameList.get(37), R.raw.cr_suuu),
                new SoundObject(nameList.get(38), R.raw.curb_your_enthusiasm),
                new SoundObject(nameList.get(39), R.raw.deja_vu),
                new SoundObject(nameList.get(40), R.raw.dis_les_termes),
                new SoundObject(nameList.get(41), R.raw.dollar),
                new SoundObject(nameList.get(42), R.raw.ecole_veto_maisons_alfort),
                new SoundObject(nameList.get(43), R.raw.encore),
                new SoundObject(nameList.get(44), R.raw.enorme),
                new SoundObject(nameList.get(45), R.raw.et_peng),
                new SoundObject(nameList.get(46), R.raw.everybody_is_here),
                new SoundObject(nameList.get(47), R.raw.fanfare),
                new SoundObject(nameList.get(48), R.raw.fbi_open_up),
                new SoundObject(nameList.get(49), R.raw.gamecube_intro),
                new SoundObject(nameList.get(50), R.raw.gofast_camion),
                new SoundObject(nameList.get(51), R.raw.hello_there),
                new SoundObject(nameList.get(52), R.raw.here_we_go_again),
                new SoundObject(nameList.get(53), R.raw.histoire_background),
                new SoundObject(nameList.get(54), R.raw.hmm_hmm_no_no_no),
                new SoundObject(nameList.get(55), R.raw.homme_colere),
                new SoundObject(nameList.get(56), R.raw.il_est_de_retour),
                new SoundObject(nameList.get(57), R.raw.inceptionbutton),
                new SoundObject(nameList.get(58), R.raw.indetectable),
                new SoundObject(nameList.get(59), R.raw.its_time_to_stop),
                new SoundObject(nameList.get(60), R.raw.jadore_les_saucisses),
                new SoundObject(nameList.get(61), R.raw.jai_beau_etre_matinal),
                new SoundObject(nameList.get(62), R.raw.jai_pas_toucher),
                new SoundObject(nameList.get(63), R.raw.kf_vous_m_emmerder),
                new SoundObject(nameList.get(64), R.raw.l_etat_paiera),
                new SoundObject(nameList.get(65), R.raw.la_boule_magique),
                new SoundObject(nameList.get(66), R.raw.la_chatte_quil_a),
                new SoundObject(nameList.get(67), R.raw.la_ligne_4),
                new SoundObject(nameList.get(68), R.raw.la_rafale),
                new SoundObject(nameList.get(69), R.raw.ladies_n_gentlemen),
                new SoundObject(nameList.get(70), R.raw.le_gravier),
                new SoundObject(nameList.get(71), R.raw.le_ranch),
                new SoundObject(nameList.get(72), R.raw.le_saxophone),
                new SoundObject(nameList.get(73), R.raw.les_gens_qui_parlent_fr),
                new SoundObject(nameList.get(74), R.raw.ma_lubullule),
                new SoundObject(nameList.get(75), R.raw.ma_lubullule_8_6),
                new SoundObject(nameList.get(76), R.raw.mlg_horns),
                new SoundObject(nameList.get(77), R.raw.mv_instru_coldplay),
                new SoundObject(nameList.get(78), R.raw.my_man),
                new SoundObject(nameList.get(79), R.raw.nani),
                new SoundObject(nameList.get(80), R.raw.ne_te_laisse_pas_aspirer),
                new SoundObject(nameList.get(81), R.raw.nerf_tendu),
                new SoundObject(nameList.get(82), R.raw.no_god_plz_no),
                new SoundObject(nameList.get(83), R.raw.notre_projet),
                new SoundObject(nameList.get(84), R.raw.nous_sommes_en_guerre),
                new SoundObject(nameList.get(85), R.raw.oh_puree_de_pdt),
                new SoundObject(nameList.get(86), R.raw.oh_yeah_yeah_yes),
                new SoundObject(nameList.get(87), R.raw.ohla_mamacitas),
                new SoundObject(nameList.get(88), R.raw.ok),
                new SoundObject(nameList.get(89), R.raw.ok_let_s_go),
                new SoundObject(nameList.get(90), R.raw.omg_wow_omg),
                new SoundObject(nameList.get(91), R.raw.oof),
                new SoundObject(nameList.get(92), R.raw.ortolan),
                new SoundObject(nameList.get(93), R.raw.oskur),
                new SoundObject(nameList.get(94), R.raw.oui_et_alors),
                new SoundObject(nameList.get(95), R.raw.oui_ma_gatee),
                new SoundObject(nameList.get(96), R.raw.oulala_lenchainement),
                new SoundObject(nameList.get(97), R.raw.pas_ca_zinedine),
                new SoundObject(nameList.get(98), R.raw.promo_sur_coraya),
                new SoundObject(nameList.get(99), R.raw.qi_de_143),
                new SoundObject(nameList.get(100), R.raw.quel_gout),
                new SoundObject(nameList.get(101), R.raw.quelle_indignite),
                new SoundObject(nameList.get(102), R.raw.qui_fume_ici),
                new SoundObject(nameList.get(103), R.raw.qui_fume_ici_long),
                new SoundObject(nameList.get(104), R.raw.quickmaths),
                new SoundObject(nameList.get(105), R.raw.rire_de_droite),
                new SoundObject(nameList.get(106), R.raw.salut_mon_pote),
                new SoundObject(nameList.get(107), R.raw.second_poteau_pavard),
                new SoundObject(nameList.get(108), R.raw.si_ton_cote_feu_eteint),
                new SoundObject(nameList.get(109), R.raw.sitcom_laughing),
                new SoundObject(nameList.get(110), R.raw.stonks),
                new SoundObject(nameList.get(111), R.raw.stop_it_get_some_help),
                new SoundObject(nameList.get(112), R.raw.tg_fanta),
                new SoundObject(nameList.get(113), R.raw.they_ask_you_how_you_are),
                new SoundObject(nameList.get(114), R.raw.to_be_continued),
                new SoundObject(nameList.get(115), R.raw.trump_bing_bing),
                new SoundObject(nameList.get(116), R.raw.vous_etes_fatigue),
                new SoundObject(nameList.get(117), R.raw.wat_wtf),
                new SoundObject(nameList.get(118), R.raw.we_ll_be_right_back),
                new SoundObject(nameList.get(119), R.raw.why_are_we_still_here),
                new SoundObject(nameList.get(120), R.raw.why_are_you_running),
                new SoundObject(nameList.get(121), R.raw.wider_walk),
                new SoundObject(nameList.get(122), R.raw.wii_spoofrts),
                new SoundObject(nameList.get(123), R.raw.wow),
                new SoundObject(nameList.get(124), R.raw.ya_pas_de_panneaux),
                new SoundObject(nameList.get(125), R.raw.youre_breathtaking),
                new SoundObject(nameList.get(126), R.raw.za_warudo)
        };

        soundList.addAll(Arrays.asList(soundItems));

        mSoundView = findViewById(R.id.soundbox_recycler);

        mSoundLayoutManager = new GridLayoutManager(this, 3);

        mSoundView.setLayoutManager(mSoundLayoutManager);

        mSoundView.setAdapter(mSoundAdapter);


    }


    public void stopSound(View v) {
        EventHandlerClass.stopSound();
    }

    @Override
    protected void onPause() {
        super.onPause();
        EventHandlerClass.stopSound();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        EventHandlerClass.releaseSound();
    }


}