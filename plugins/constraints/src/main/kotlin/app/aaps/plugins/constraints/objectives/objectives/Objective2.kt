package app.aaps.plugins.constraints.objectives.objectives

import app.aaps.plugins.constraints.R
import dagger.android.HasAndroidInjector

@Suppress("SpellCheckingInspection")
class Objective2(injector: HasAndroidInjector) : Objective(injector, "exam", R.string.objectives_exam_objective, R.string.objectives_exam_gate) {

    init {
        tasks.add(
            ExamTask(this, R.string.prerequisites_label, R.string.prerequisites_what, "prerequisites")
                .option(Option(R.string.prerequisites_nightscout, false))
                .option(Option(R.string.prerequisites_computer, false))
                .option(Option(R.string.prerequisites_pump, false))
                .option(Option(R.string.prerequisites_beanandroiddeveloper, false))
                .hint(Hint(R.string.prerequisites_hint1))
                .learned(Learned(R.string.objectives_exam_learned_prerequisites))
        )
        tasks.add(
            ExamTask(this, R.string.prerequisites2_label, R.string.prerequisites2_what, "prerequisites2")
                .option(Option(R.string.prerequisites2_profile, false))
                .option(Option(R.string.prerequisites2_device, false))
                .option(Option(R.string.prerequisites2_internet, false))
                .option(Option(R.string.prerequisites2_supportedcgm, false))
                .hint(Hint(R.string.prerequisites2_hint1))
                .learned(Learned(R.string.objectives_exam_learned_prerequisites2))
        )
        tasks.add(
            ExamTask(this, R.string.basaltest_label, R.string.basaltest_when, "basaltest")
                .option(Option(R.string.basaltest_fixed, false))
                .option(Option(R.string.basaltest_havingregularhighlow, false))
                .option(Option(R.string.basaltest_weekly, false))
                .option(Option(R.string.basaltest_beforeloop, false))
                .hint(Hint(R.string.basaltest_hint1))
                .learned(Learned(R.string.objectives_exam_learned_basaltest))
        )
        tasks.add(
            ExamTask(this, R.string.dia_label_exam, R.string.dia_whatmeansdia, "dia")
                .option(Option(R.string.dia_profile, false))
                .option(Option(R.string.dia_minimumis5h, false))
                .option(Option(R.string.dia_meaningisequaltodiapump, false))
                .option(Option(R.string.dia_valuemustbedetermined, false))
                .hint(Hint(R.string.dia_hint1))
                .learned(Learned(R.string.objectives_exam_learned_dia))
        )
        tasks.add(
            ExamTask(this, R.string.isf_label_exam, R.string.blank, "isf")
                .option(Option(R.string.isf_decreasingvalue, false))
                .option(Option(R.string.isf_preferences, false))
                .option(Option(R.string.isf_increasingvalue, false))
                .option(Option(R.string.isf_noeffect, false))
                .hint(Hint(R.string.isf_hint1))
                .hint(Hint(R.string.isf_hint2))
                .learned(Learned(R.string.objectives_exam_learned_isf))
        )
        tasks.add(
            ExamTask(this, R.string.ic_label_exam, R.string.blank, "ic")
                .option(Option(R.string.ic_increasingvalue, false))
                .option(Option(R.string.ic_decreasingvalue, false))
                .option(Option(R.string.ic_multiple, false))
                .option(Option(R.string.ic_isf, false))
                .hint(Hint(R.string.ic_hint1))
                .learned(Learned(R.string.objectives_exam_learned_ic))
        )
        tasks.add(
            ExamTask(this, R.string.hypott_label, R.string.hypott_whenhypott, "hypott")
                .option(Option(R.string.hypott_preventoversmb, false))
                .option(Option(R.string.hypott_exercise, false))
                .option(Option(R.string.hypott_wrongbasal, false))
                .option(Option(R.string.hypott_0basal, false))
                .hint(Hint(R.string.hypott_hint1))
                .learned(Learned(R.string.objectives_exam_learned_hypott))
        )
        tasks.add(
            ExamTask(this, R.string.profileswitch_label, R.string.profileswitch_pctwillchange, "profileswitch")
                .option(Option(R.string.profileswitch_basallower, false))
                .option(Option(R.string.profileswitch_isfhigher, false))
                .option(Option(R.string.profileswitch_iclower, false))
                .option(Option(R.string.profileswitch_unchanged, false))
                .hint(Hint(R.string.profileswitch_hint1))
                .learned(Learned(R.string.objectives_exam_learned_profileswitch))
        )
        tasks.add(
            ExamTask(this, R.string.profileswitch2_label, R.string.profileswitch2_pctwillchange, "profileswitch2")
                .option(Option(R.string.profileswitch2_bghigher, false))
                .option(Option(R.string.profileswitch2_basalhigher, false))
                .option(Option(R.string.profileswitch2_bgunchanged, false))
                .option(Option(R.string.profileswitch2_isfhigher, false))
                .hint(Hint(R.string.profileswitch_hint1))
        )
        tasks.add(
            ExamTask(this, R.string.profileswitchtime_label, R.string.profileswitchtime_iwant, "profileswitchtime")
                .option(Option(R.string.profileswitchtime_2, false))
                .option(Option(R.string.profileswitchtime__2, false))
                .option(Option(R.string.profileswitchtime_tt, false))
                .option(Option(R.string.profileswitchtime_100, false))
                .hint(Hint(R.string.profileswitchtime_hint1))
                .learned(Learned(R.string.objectives_exam_learned_profileswitchtime))
        )
        tasks.add(
            ExamTask(this, R.string.profileswitch4_label, R.string.blank, "profileswitch4")
                .option(Option(R.string.profileswitch4_rates, false))
                .option(Option(R.string.profileswitch4_internet, false))
                .option(Option(R.string.profileswitch4_sufficient, false))
                .option(Option(R.string.profileswitch4_multi, false))
                .hint(Hint(R.string.profileswitch_hint1))
                .learned(Learned(R.string.objectives_exam_learned_profileswitch4))
        )
        tasks.add(
            ExamTask(this, R.string.exerciseprofile_label, R.string.exerciseprofile_whattodo, "exercise")
                .option(Option(R.string.exerciseprofile_switchprofileabove100, false))
                .option(Option(R.string.exerciseprofile_switchprofilebelow100, false))
                .option(Option(R.string.exerciseprofile_suspendloop, false))
                .option(Option(R.string.exerciseprofile_leaveat100, false))
                .hint(Hint(R.string.exerciseprofile_hint1))
                .learned(Learned(R.string.objectives_exam_learned_exercise))
        )
        tasks.add(
            ExamTask(this, R.string.exercise_label, R.string.exercise_whattodo, "exercise2")
                .option(Option(R.string.exercise_settt, false))
                .option(Option(R.string.exercise_setfinished, false))
                .option(Option(R.string.exercise_setunchanged, false))
                .option(Option(R.string.exercise_15g, false))
                .hint(Hint(R.string.exercise_hint1))
                .learned(Learned(R.string.objectives_exam_learned_exercise2))
        )
        tasks.add(
            ExamTask(this, R.string.noisycgm_label, R.string.noisycgm_whattodo, "noisycgm")
                .option(Option(R.string.noisycgm_nothing, false))
                .option(Option(R.string.noisycgm_pause, false))
                .option(Option(R.string.noisycgm_replacesensor, false))
                .option(Option(R.string.noisycgm_checksmoothing, false))
                .hint(Hint(R.string.noisycgm_hint1))
                .learned(Learned(R.string.objectives_exam_learned_noisycgm))
        )
        tasks.add(
            ExamTask(this, R.string.pumpdisconnect_label, R.string.blank, "pumpdisconnect")
                .option(Option(R.string.pumpdisconnect_unnecessary, false))
                .option(Option(R.string.pumpdisconnect_missinginsulin, false))
                .option(Option(R.string.pumpdisconnect_notstop, false))
                .option(Option(R.string.pumpdisconnect_openloop, false))
                .hint(Hint(R.string.pumpdisconnect_hint1))
                .learned(Learned(R.string.objectives_exam_learned_pumpdisconnect))
        )
        tasks.add(
            ExamTask(this, R.string.insulin_plugins, R.string.insulin_ultrarapid, "insulin")
                .option(Option(R.string.insulin_novorapid, false))
                .option(Option(R.string.insulin_humalog, false))
                .option(Option(R.string.insulin_actrapid, false))
                .option(Option(R.string.insulin_fiasp, false))
                .hint(Hint(R.string.insulin_hint1))
                .learned(Learned(R.string.objectives_exam_learned_insulin))
        )
        tasks.add(
            ExamTask(this, R.string.sensitivity_label, R.string.blank, "sensitivity")
                .option(Option(R.string.sensitivity_adjust, false))
                .option(Option(R.string.sensitivity_edit, false))
                .option(Option(R.string.sensitivity_cannula, false))
                .option(Option(R.string.sensitivity_time, false))
                .hint(Hint(R.string.sensitivity_hint1))
                .hint(Hint(R.string.sensitivity_hint2))
                .learned(Learned(R.string.objectives_exam_learned_sensitivity))
        )
        tasks.add(
            ExamTask(this, R.string.objectives_label, R.string.objectives_howtosave, "objectives")
                .option(Option(R.string.objectives_notesettings, false))
                .option(Option(R.string.objectives_afterobjective, false))
                .option(Option(R.string.objectives_afterchange, false))
                .option(Option(R.string.objectives_afterinitialsetup, false))
                .hint(Hint(R.string.objectives_hint1))
                .hint(Hint(R.string.objectives_hint2))
                .learned(Learned(R.string.objectives_exam_learned_objectives))
        )
        tasks.add(
            ExamTask(this, R.string.objectives2_label, R.string.objectives_howtosave, "objectives2")
                .option(Option(R.string.objectives2_maintenance, false))
                .option(Option(R.string.objectives2_internalstorage, false))
                .option(Option(R.string.objectives2_cloud, false))
                .option(Option(R.string.objectives2_easyrestore, false))
                .hint(Hint(R.string.objectives_hint1))
                .hint(Hint(R.string.objectives_hint2))
                .learned(Learned(R.string.objectives_exam_learned_objectives2))
        )
        tasks.add(
            ExamTask(this, R.string.update_label, R.string.blank, "update")
                .option(Option(R.string.update_git, false))
                .option(Option(R.string.update_askfriend, false))
                .option(Option(R.string.update_keys, false))
                .option(Option(R.string.update_asap, false))
                .hint(Hint(R.string.update_hint1))
        )
        tasks.add(
            ExamTask(this, R.string.troubleshooting_label, R.string.troubleshooting_wheretoask, "troubleshooting")
                .option(Option(R.string.troubleshooting_fb, false))
                .option(Option(R.string.troubleshooting_wiki, false))
                .option(Option(R.string.troubleshooting_gitter, false))
                .option(Option(R.string.troubleshooting_yourendo, false))
                .hint(Hint(R.string.troubleshooting_hint1))
                .hint(Hint(R.string.troubleshooting_hint2))
                .hint(Hint(R.string.troubleshooting_hint3))
        )
        tasks.add(
            ExamTask(this, R.string.wrongcarbs_label, R.string.wrongcarbs_whattodo, "wrongcarbs")
                .option(Option(R.string.wrongcarbs_addinsulin, false))
                .option(Option(R.string.wrongcarbs_treatmentstab, false))
                .option(Option(R.string.wrongcarbs_donothing, false))
                .option(Option(R.string.wrongcarbs_bolus, false))
                .learned(Learned(R.string.objectives_exam_learned_wrongcarbs))
        )
        tasks.add(
            ExamTask(this, R.string.wronginsulin_label, R.string.wronginsulin_whattodo, "wronginsulin")
                .option(Option(R.string.wronginsulin_careportal, false))
                .option(Option(R.string.wronginsulin_compare, false))
                .option(Option(R.string.wronginsulin_prime, false))
                .option(Option(R.string.wrongcarbs_donothing, false))
        )
        tasks.add(
            ExamTask(this, app.aaps.core.ui.R.string.iob_label, R.string.blank, "iob")
                .option(Option(R.string.iob_value, false))
                .option(Option(R.string.iob_hightemp, false))
                .option(Option(R.string.iob_negiob, false))
                .option(Option(R.string.iob_posiob, false))
                .learned(Learned(R.string.objectives_exam_learned_iob))
        )
        tasks.add(
            ExamTask(this, R.string.cob_label, R.string.cob_question, "cob1")
                .option(Option(R.string.cob_longer, false))
                .option(Option(R.string.cob_shorter, false))
                .option(Option(R.string.cob_no_effect, false))
                .hint(Hint(R.string.cob_hint1))
        )
        tasks.add(
            ExamTask(this, R.string.cob_label, R.string.cob2_question, "cob2")
                .option(Option(R.string.cob2_longer, false))
                .option(Option(R.string.cob2_shorter, false))
                .option(Option(R.string.cob2_no_effect, false))
                .hint(Hint(R.string.cob_hint1))
        )
        tasks.add(
            ExamTask(this, R.string.cob_label, R.string.cob3_question, "cob3")
                .option(Option(R.string.cob3_longer, false))
                .option(Option(R.string.cob3_shorter, false))
                .option(Option(R.string.cob3_no_effect, false))
                .hint(Hint(R.string.cob_hint1))
                .learned(Learned(R.string.objectives_exam_learned_cob))
        )
        tasks.add(
            ExamTask(this, R.string.breadgrams_label, R.string.blank, "breadgrams")
                .option(Option(R.string.breadgrams_grams, false))
                .option(Option(R.string.breadgrams_exchange, false))
                .option(Option(R.string.breadgrams_decay, false))
                .option(Option(R.string.breadgrams_calc, false))
                .hint(Hint(R.string.breadgrams_hint1))
                .learned(Learned(R.string.objectives_exam_learned_breadgrams))
        )
        tasks.add(
            ExamTask(this, R.string.extendedcarbs_label, R.string.extendedcarbs_handling, "extendedcarbs")
                .option(Option(R.string.extendedcarbs_future, false))
                .option(Option(R.string.extendedcarbs_free, false))
                .option(Option(R.string.extendedcarbs_fat, false))
                .option(Option(R.string.extendedcarbs_rescue, false))
                .hint(Hint(R.string.extendedcarbs_hint1))
                .learned(Learned(R.string.objectives_exam_learned_ecarbs))
        )
        tasks.add(
            ExamTask(this, R.string.nsclient_label, R.string.nsclient_howcanyou, "nsclient")
                .option(Option(R.string.nsclient_nightscout, false))
                .option(Option(R.string.nsclient_dexcomfollow, false))
                .option(Option(R.string.nsclient_data, false))
                .option(Option(R.string.nsclient_fullcontrol, false))
                .hint(Hint(R.string.nsclient_hint1))
                .learned(Learned(R.string.objectives_exam_learned_nsclient))
        )
        tasks.add(
            ExamTask(this, R.string.other_medication_label, R.string.other_medication_text, "otherMedicationWarning")
                .option(Option(app.aaps.core.ui.R.string.yes, false))
                .option(Option(app.aaps.core.ui.R.string.no, false))
        )
        for (task in tasks) (task as ExamTask).options.shuffle()

        for (task in tasks) {
            if (!task.isCompleted()) accomplishedOn = 0
        }
    }
}