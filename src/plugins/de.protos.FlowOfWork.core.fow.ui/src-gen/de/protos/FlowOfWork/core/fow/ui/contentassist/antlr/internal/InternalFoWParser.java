package de.protos.FlowOfWork.core.fow.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.protos.FlowOfWork.core.fow.services.FoWGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFoWParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Role'", "';'", "'WorkProductType'", "'WorkProduct'", "':'", "'GuidanceType'", "'Guidance'", "'State'", "'('", "')'", "'Activity'", "'responsible'", "'inputs'", "','", "'outputs'", "'subActivities'", "'guidances'", "'Behavior'", "'{'", "'}'", "'Decision'", "'Step'", "'Transition'", "'initial'", "'to'", "'final'", "'summary'", "'label'", "'description'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalFoWParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFoWParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFoWParser.tokenNames; }
    public String getGrammarFileName() { return "../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g"; }


     
     	private FoWGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FoWGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:61:1: ( ruleModel EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:69:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:73:2: ( ( ( rule__Model__Alternatives )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:74:1: ( ( rule__Model__Alternatives )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:74:1: ( ( rule__Model__Alternatives )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:75:1: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:76:1: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||(LA1_0>=16 && LA1_0<=18)||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:76:2: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRole"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:90:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:91:1: ( ruleRole EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:92:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole124);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole131); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:99:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:103:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:104:1: ( ( rule__Role__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:104:1: ( ( rule__Role__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:105:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:106:1: ( rule__Role__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:106:2: rule__Role__Group__0
            {
            pushFollow(FOLLOW_rule__Role__Group__0_in_ruleRole157);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleWorkProductType"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:118:1: entryRuleWorkProductType : ruleWorkProductType EOF ;
    public final void entryRuleWorkProductType() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:119:1: ( ruleWorkProductType EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:120:1: ruleWorkProductType EOF
            {
             before(grammarAccess.getWorkProductTypeRule()); 
            pushFollow(FOLLOW_ruleWorkProductType_in_entryRuleWorkProductType184);
            ruleWorkProductType();

            state._fsp--;

             after(grammarAccess.getWorkProductTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkProductType191); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkProductType"


    // $ANTLR start "ruleWorkProductType"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:127:1: ruleWorkProductType : ( ( rule__WorkProductType__Group__0 ) ) ;
    public final void ruleWorkProductType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:131:2: ( ( ( rule__WorkProductType__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:132:1: ( ( rule__WorkProductType__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:132:1: ( ( rule__WorkProductType__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:133:1: ( rule__WorkProductType__Group__0 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:134:1: ( rule__WorkProductType__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:134:2: rule__WorkProductType__Group__0
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__0_in_ruleWorkProductType217);
            rule__WorkProductType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkProductTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkProductType"


    // $ANTLR start "entryRuleWorkProduct"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:146:1: entryRuleWorkProduct : ruleWorkProduct EOF ;
    public final void entryRuleWorkProduct() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:147:1: ( ruleWorkProduct EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:148:1: ruleWorkProduct EOF
            {
             before(grammarAccess.getWorkProductRule()); 
            pushFollow(FOLLOW_ruleWorkProduct_in_entryRuleWorkProduct244);
            ruleWorkProduct();

            state._fsp--;

             after(grammarAccess.getWorkProductRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkProduct251); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkProduct"


    // $ANTLR start "ruleWorkProduct"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:155:1: ruleWorkProduct : ( ( rule__WorkProduct__Group__0 ) ) ;
    public final void ruleWorkProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:159:2: ( ( ( rule__WorkProduct__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:160:1: ( ( rule__WorkProduct__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:160:1: ( ( rule__WorkProduct__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:161:1: ( rule__WorkProduct__Group__0 )
            {
             before(grammarAccess.getWorkProductAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:162:1: ( rule__WorkProduct__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:162:2: rule__WorkProduct__Group__0
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__0_in_ruleWorkProduct277);
            rule__WorkProduct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkProductAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkProduct"


    // $ANTLR start "entryRuleGuidanceType"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:174:1: entryRuleGuidanceType : ruleGuidanceType EOF ;
    public final void entryRuleGuidanceType() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:175:1: ( ruleGuidanceType EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:176:1: ruleGuidanceType EOF
            {
             before(grammarAccess.getGuidanceTypeRule()); 
            pushFollow(FOLLOW_ruleGuidanceType_in_entryRuleGuidanceType304);
            ruleGuidanceType();

            state._fsp--;

             after(grammarAccess.getGuidanceTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidanceType311); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuidanceType"


    // $ANTLR start "ruleGuidanceType"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:183:1: ruleGuidanceType : ( ( rule__GuidanceType__Group__0 ) ) ;
    public final void ruleGuidanceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:187:2: ( ( ( rule__GuidanceType__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:188:1: ( ( rule__GuidanceType__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:188:1: ( ( rule__GuidanceType__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:189:1: ( rule__GuidanceType__Group__0 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:190:1: ( rule__GuidanceType__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:190:2: rule__GuidanceType__Group__0
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__0_in_ruleGuidanceType337);
            rule__GuidanceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidanceType"


    // $ANTLR start "entryRuleGuidance"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:202:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:203:1: ( ruleGuidance EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:204:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_ruleGuidance_in_entryRuleGuidance364);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidance371); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:211:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:215:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:216:1: ( ( rule__Guidance__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:216:1: ( ( rule__Guidance__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:217:1: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:218:1: ( rule__Guidance__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:218:2: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_rule__Guidance__Group__0_in_ruleGuidance397);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleState"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:230:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:231:1: ( ruleState EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:232:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState424);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState431); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:239:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:243:2: ( ( ( rule__State__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:244:1: ( ( rule__State__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:244:1: ( ( rule__State__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:245:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:246:1: ( rule__State__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:246:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState457);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRulePort"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:258:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:259:1: ( rulePort EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:260:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort484);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort491); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:267:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:271:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:272:1: ( ( rule__Port__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:272:1: ( ( rule__Port__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:273:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:274:1: ( rule__Port__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:274:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort517);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleActivity"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:286:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:287:1: ( ruleActivity EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:288:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity544);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity551); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:295:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:299:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:300:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:300:1: ( ( rule__Activity__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:301:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:302:1: ( rule__Activity__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:302:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity577);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleActivityRef"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:314:1: entryRuleActivityRef : ruleActivityRef EOF ;
    public final void entryRuleActivityRef() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:315:1: ( ruleActivityRef EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:316:1: ruleActivityRef EOF
            {
             before(grammarAccess.getActivityRefRule()); 
            pushFollow(FOLLOW_ruleActivityRef_in_entryRuleActivityRef604);
            ruleActivityRef();

            state._fsp--;

             after(grammarAccess.getActivityRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityRef611); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivityRef"


    // $ANTLR start "ruleActivityRef"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:323:1: ruleActivityRef : ( ( rule__ActivityRef__TypeAssignment ) ) ;
    public final void ruleActivityRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:327:2: ( ( ( rule__ActivityRef__TypeAssignment ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:328:1: ( ( rule__ActivityRef__TypeAssignment ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:328:1: ( ( rule__ActivityRef__TypeAssignment ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:329:1: ( rule__ActivityRef__TypeAssignment )
            {
             before(grammarAccess.getActivityRefAccess().getTypeAssignment()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:330:1: ( rule__ActivityRef__TypeAssignment )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:330:2: rule__ActivityRef__TypeAssignment
            {
            pushFollow(FOLLOW_rule__ActivityRef__TypeAssignment_in_ruleActivityRef637);
            rule__ActivityRef__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActivityRefAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityRef"


    // $ANTLR start "entryRuleDecision"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:344:1: entryRuleDecision : ruleDecision EOF ;
    public final void entryRuleDecision() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:345:1: ( ruleDecision EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:346:1: ruleDecision EOF
            {
             before(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_ruleDecision_in_entryRuleDecision666);
            ruleDecision();

            state._fsp--;

             after(grammarAccess.getDecisionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecision673); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecision"


    // $ANTLR start "ruleDecision"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:353:1: ruleDecision : ( ( rule__Decision__Group__0 ) ) ;
    public final void ruleDecision() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:357:2: ( ( ( rule__Decision__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:358:1: ( ( rule__Decision__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:358:1: ( ( rule__Decision__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:359:1: ( rule__Decision__Group__0 )
            {
             before(grammarAccess.getDecisionAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:360:1: ( rule__Decision__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:360:2: rule__Decision__Group__0
            {
            pushFollow(FOLLOW_rule__Decision__Group__0_in_ruleDecision699);
            rule__Decision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecision"


    // $ANTLR start "entryRuleStep"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:372:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:373:1: ( ruleStep EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:374:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep726);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep733); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:381:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:385:2: ( ( ( rule__Step__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:386:1: ( ( rule__Step__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:386:1: ( ( rule__Step__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:387:1: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:388:1: ( rule__Step__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:388:2: rule__Step__Group__0
            {
            pushFollow(FOLLOW_rule__Step__Group__0_in_ruleStep759);
            rule__Step__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:400:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:401:1: ( ruleTransition EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:402:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition786);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition793); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:409:1: ruleTransition : ( ( rule__Transition__Alternatives ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:413:2: ( ( ( rule__Transition__Alternatives ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:414:1: ( ( rule__Transition__Alternatives ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:414:1: ( ( rule__Transition__Alternatives ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:415:1: ( rule__Transition__Alternatives )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:416:1: ( rule__Transition__Alternatives )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:416:2: rule__Transition__Alternatives
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_in_ruleTransition819);
            rule__Transition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleInitialTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:428:1: entryRuleInitialTransition : ruleInitialTransition EOF ;
    public final void entryRuleInitialTransition() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:429:1: ( ruleInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:430:1: ruleInitialTransition EOF
            {
             before(grammarAccess.getInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition846);
            ruleInitialTransition();

            state._fsp--;

             after(grammarAccess.getInitialTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialTransition853); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialTransition"


    // $ANTLR start "ruleInitialTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:437:1: ruleInitialTransition : ( ( rule__InitialTransition__Group__0 ) ) ;
    public final void ruleInitialTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:441:2: ( ( ( rule__InitialTransition__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:442:1: ( ( rule__InitialTransition__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:442:1: ( ( rule__InitialTransition__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:443:1: ( rule__InitialTransition__Group__0 )
            {
             before(grammarAccess.getInitialTransitionAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:444:1: ( rule__InitialTransition__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:444:2: rule__InitialTransition__Group__0
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__0_in_ruleInitialTransition879);
            rule__InitialTransition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialTransition"


    // $ANTLR start "entryRuleFinalTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:456:1: entryRuleFinalTransition : ruleFinalTransition EOF ;
    public final void entryRuleFinalTransition() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:457:1: ( ruleFinalTransition EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:458:1: ruleFinalTransition EOF
            {
             before(grammarAccess.getFinalTransitionRule()); 
            pushFollow(FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition906);
            ruleFinalTransition();

            state._fsp--;

             after(grammarAccess.getFinalTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinalTransition913); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFinalTransition"


    // $ANTLR start "ruleFinalTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:465:1: ruleFinalTransition : ( ( rule__FinalTransition__Group__0 ) ) ;
    public final void ruleFinalTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:469:2: ( ( ( rule__FinalTransition__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:470:1: ( ( rule__FinalTransition__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:470:1: ( ( rule__FinalTransition__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:471:1: ( rule__FinalTransition__Group__0 )
            {
             before(grammarAccess.getFinalTransitionAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:472:1: ( rule__FinalTransition__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:472:2: rule__FinalTransition__Group__0
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__0_in_ruleFinalTransition939);
            rule__FinalTransition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinalTransition"


    // $ANTLR start "entryRuleDecisionTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:484:1: entryRuleDecisionTransition : ruleDecisionTransition EOF ;
    public final void entryRuleDecisionTransition() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:485:1: ( ruleDecisionTransition EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:486:1: ruleDecisionTransition EOF
            {
             before(grammarAccess.getDecisionTransitionRule()); 
            pushFollow(FOLLOW_ruleDecisionTransition_in_entryRuleDecisionTransition966);
            ruleDecisionTransition();

            state._fsp--;

             after(grammarAccess.getDecisionTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecisionTransition973); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecisionTransition"


    // $ANTLR start "ruleDecisionTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:493:1: ruleDecisionTransition : ( ( rule__DecisionTransition__Group__0 ) ) ;
    public final void ruleDecisionTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:497:2: ( ( ( rule__DecisionTransition__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:498:1: ( ( rule__DecisionTransition__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:498:1: ( ( rule__DecisionTransition__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:499:1: ( rule__DecisionTransition__Group__0 )
            {
             before(grammarAccess.getDecisionTransitionAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:500:1: ( rule__DecisionTransition__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:500:2: rule__DecisionTransition__Group__0
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__0_in_ruleDecisionTransition999);
            rule__DecisionTransition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecisionTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecisionTransition"


    // $ANTLR start "entryRuleNonInitialTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:512:1: entryRuleNonInitialTransition : ruleNonInitialTransition EOF ;
    public final void entryRuleNonInitialTransition() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:513:1: ( ruleNonInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:514:1: ruleNonInitialTransition EOF
            {
             before(grammarAccess.getNonInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition1026);
            ruleNonInitialTransition();

            state._fsp--;

             after(grammarAccess.getNonInitialTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonInitialTransition1033); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonInitialTransition"


    // $ANTLR start "ruleNonInitialTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:521:1: ruleNonInitialTransition : ( ( rule__NonInitialTransition__Group__0 ) ) ;
    public final void ruleNonInitialTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:525:2: ( ( ( rule__NonInitialTransition__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:526:1: ( ( rule__NonInitialTransition__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:526:1: ( ( rule__NonInitialTransition__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:527:1: ( rule__NonInitialTransition__Group__0 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:528:1: ( rule__NonInitialTransition__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:528:2: rule__NonInitialTransition__Group__0
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__0_in_ruleNonInitialTransition1059);
            rule__NonInitialTransition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonInitialTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonInitialTransition"


    // $ANTLR start "entryRuleTextfield"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:540:1: entryRuleTextfield : ruleTextfield EOF ;
    public final void entryRuleTextfield() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:541:1: ( ruleTextfield EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:542:1: ruleTextfield EOF
            {
             before(grammarAccess.getTextfieldRule()); 
            pushFollow(FOLLOW_ruleTextfield_in_entryRuleTextfield1086);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getTextfieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfield1093); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextfield"


    // $ANTLR start "ruleTextfield"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:549:1: ruleTextfield : ( ( rule__Textfield__Group__0 ) ) ;
    public final void ruleTextfield() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:553:2: ( ( ( rule__Textfield__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:554:1: ( ( rule__Textfield__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:554:1: ( ( rule__Textfield__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:555:1: ( rule__Textfield__Group__0 )
            {
             before(grammarAccess.getTextfieldAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:556:1: ( rule__Textfield__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:556:2: rule__Textfield__Group__0
            {
            pushFollow(FOLLOW_rule__Textfield__Group__0_in_ruleTextfield1119);
            rule__Textfield__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextfield"


    // $ANTLR start "rule__Model__Alternatives"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:568:1: rule__Model__Alternatives : ( ( ( rule__Model__ActivitiesAssignment_0 ) ) | ( ( rule__Model__RolesAssignment_1 ) ) | ( ( rule__Model__WorkProductsAssignment_2 ) ) | ( ( rule__Model__WorkProductTypesAssignment_3 ) ) | ( ( rule__Model__GuidancesAssignment_4 ) ) | ( ( rule__Model__GuidanceTypesAssignment_5 ) ) | ( ( rule__Model__StatesAssignment_6 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:572:1: ( ( ( rule__Model__ActivitiesAssignment_0 ) ) | ( ( rule__Model__RolesAssignment_1 ) ) | ( ( rule__Model__WorkProductsAssignment_2 ) ) | ( ( rule__Model__WorkProductTypesAssignment_3 ) ) | ( ( rule__Model__GuidancesAssignment_4 ) ) | ( ( rule__Model__GuidanceTypesAssignment_5 ) ) | ( ( rule__Model__StatesAssignment_6 ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:573:1: ( ( rule__Model__ActivitiesAssignment_0 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:573:1: ( ( rule__Model__ActivitiesAssignment_0 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:574:1: ( rule__Model__ActivitiesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getActivitiesAssignment_0()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:575:1: ( rule__Model__ActivitiesAssignment_0 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:575:2: rule__Model__ActivitiesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__ActivitiesAssignment_0_in_rule__Model__Alternatives1155);
                    rule__Model__ActivitiesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getActivitiesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:579:6: ( ( rule__Model__RolesAssignment_1 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:579:6: ( ( rule__Model__RolesAssignment_1 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:580:1: ( rule__Model__RolesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getRolesAssignment_1()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:581:1: ( rule__Model__RolesAssignment_1 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:581:2: rule__Model__RolesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__RolesAssignment_1_in_rule__Model__Alternatives1173);
                    rule__Model__RolesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getRolesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:585:6: ( ( rule__Model__WorkProductsAssignment_2 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:585:6: ( ( rule__Model__WorkProductsAssignment_2 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:586:1: ( rule__Model__WorkProductsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getWorkProductsAssignment_2()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:587:1: ( rule__Model__WorkProductsAssignment_2 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:587:2: rule__Model__WorkProductsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__WorkProductsAssignment_2_in_rule__Model__Alternatives1191);
                    rule__Model__WorkProductsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getWorkProductsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:591:6: ( ( rule__Model__WorkProductTypesAssignment_3 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:591:6: ( ( rule__Model__WorkProductTypesAssignment_3 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:592:1: ( rule__Model__WorkProductTypesAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getWorkProductTypesAssignment_3()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:593:1: ( rule__Model__WorkProductTypesAssignment_3 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:593:2: rule__Model__WorkProductTypesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__WorkProductTypesAssignment_3_in_rule__Model__Alternatives1209);
                    rule__Model__WorkProductTypesAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getWorkProductTypesAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:597:6: ( ( rule__Model__GuidancesAssignment_4 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:597:6: ( ( rule__Model__GuidancesAssignment_4 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:598:1: ( rule__Model__GuidancesAssignment_4 )
                    {
                     before(grammarAccess.getModelAccess().getGuidancesAssignment_4()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:599:1: ( rule__Model__GuidancesAssignment_4 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:599:2: rule__Model__GuidancesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__GuidancesAssignment_4_in_rule__Model__Alternatives1227);
                    rule__Model__GuidancesAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGuidancesAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:603:6: ( ( rule__Model__GuidanceTypesAssignment_5 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:603:6: ( ( rule__Model__GuidanceTypesAssignment_5 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:604:1: ( rule__Model__GuidanceTypesAssignment_5 )
                    {
                     before(grammarAccess.getModelAccess().getGuidanceTypesAssignment_5()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:605:1: ( rule__Model__GuidanceTypesAssignment_5 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:605:2: rule__Model__GuidanceTypesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Model__GuidanceTypesAssignment_5_in_rule__Model__Alternatives1245);
                    rule__Model__GuidanceTypesAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGuidanceTypesAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:609:6: ( ( rule__Model__StatesAssignment_6 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:609:6: ( ( rule__Model__StatesAssignment_6 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:610:1: ( rule__Model__StatesAssignment_6 )
                    {
                     before(grammarAccess.getModelAccess().getStatesAssignment_6()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:611:1: ( rule__Model__StatesAssignment_6 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:611:2: rule__Model__StatesAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Model__StatesAssignment_6_in_rule__Model__Alternatives1263);
                    rule__Model__StatesAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getStatesAssignment_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Activity__Alternatives_9_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:621:1: rule__Activity__Alternatives_9_2 : ( ( ( rule__Activity__StepsAssignment_9_2_0 ) ) | ( ( rule__Activity__DecisionsAssignment_9_2_1 ) ) | ( ( rule__Activity__TransitionsAssignment_9_2_2 ) ) );
    public final void rule__Activity__Alternatives_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:625:1: ( ( ( rule__Activity__StepsAssignment_9_2_0 ) ) | ( ( rule__Activity__DecisionsAssignment_9_2_1 ) ) | ( ( rule__Activity__TransitionsAssignment_9_2_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:626:1: ( ( rule__Activity__StepsAssignment_9_2_0 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:626:1: ( ( rule__Activity__StepsAssignment_9_2_0 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:627:1: ( rule__Activity__StepsAssignment_9_2_0 )
                    {
                     before(grammarAccess.getActivityAccess().getStepsAssignment_9_2_0()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:628:1: ( rule__Activity__StepsAssignment_9_2_0 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:628:2: rule__Activity__StepsAssignment_9_2_0
                    {
                    pushFollow(FOLLOW_rule__Activity__StepsAssignment_9_2_0_in_rule__Activity__Alternatives_9_21297);
                    rule__Activity__StepsAssignment_9_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getStepsAssignment_9_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:632:6: ( ( rule__Activity__DecisionsAssignment_9_2_1 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:632:6: ( ( rule__Activity__DecisionsAssignment_9_2_1 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:633:1: ( rule__Activity__DecisionsAssignment_9_2_1 )
                    {
                     before(grammarAccess.getActivityAccess().getDecisionsAssignment_9_2_1()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:634:1: ( rule__Activity__DecisionsAssignment_9_2_1 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:634:2: rule__Activity__DecisionsAssignment_9_2_1
                    {
                    pushFollow(FOLLOW_rule__Activity__DecisionsAssignment_9_2_1_in_rule__Activity__Alternatives_9_21315);
                    rule__Activity__DecisionsAssignment_9_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getDecisionsAssignment_9_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:638:6: ( ( rule__Activity__TransitionsAssignment_9_2_2 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:638:6: ( ( rule__Activity__TransitionsAssignment_9_2_2 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:639:1: ( rule__Activity__TransitionsAssignment_9_2_2 )
                    {
                     before(grammarAccess.getActivityAccess().getTransitionsAssignment_9_2_2()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:640:1: ( rule__Activity__TransitionsAssignment_9_2_2 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:640:2: rule__Activity__TransitionsAssignment_9_2_2
                    {
                    pushFollow(FOLLOW_rule__Activity__TransitionsAssignment_9_2_2_in_rule__Activity__Alternatives_9_21333);
                    rule__Activity__TransitionsAssignment_9_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getTransitionsAssignment_9_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Alternatives_9_2"


    // $ANTLR start "rule__Transition__Alternatives"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:650:1: rule__Transition__Alternatives : ( ( ruleInitialTransition ) | ( ruleFinalTransition ) | ( ruleNonInitialTransition ) | ( ruleDecisionTransition ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:654:1: ( ( ruleInitialTransition ) | ( ruleFinalTransition ) | ( ruleNonInitialTransition ) | ( ruleDecisionTransition ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==35) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==RULE_ID) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==EOF||(LA4_5>=30 && LA4_5<=33)) ) {
                                alt4=3;
                            }
                            else if ( (LA4_5==RULE_STRING) ) {
                                alt4=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA4_4==36) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==34) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:655:1: ( ruleInitialTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:655:1: ( ruleInitialTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:656:1: ruleInitialTransition
                    {
                     before(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInitialTransition_in_rule__Transition__Alternatives1367);
                    ruleInitialTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:661:6: ( ruleFinalTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:661:6: ( ruleFinalTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:662:1: ruleFinalTransition
                    {
                     before(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFinalTransition_in_rule__Transition__Alternatives1384);
                    ruleFinalTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:667:6: ( ruleNonInitialTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:667:6: ( ruleNonInitialTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:668:1: ruleNonInitialTransition
                    {
                     before(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNonInitialTransition_in_rule__Transition__Alternatives1401);
                    ruleNonInitialTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:673:6: ( ruleDecisionTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:673:6: ( ruleDecisionTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:674:1: ruleDecisionTransition
                    {
                     before(grammarAccess.getTransitionAccess().getDecisionTransitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDecisionTransition_in_rule__Transition__Alternatives1418);
                    ruleDecisionTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getDecisionTransitionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Alternatives"


    // $ANTLR start "rule__Role__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:686:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:690:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:691:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__01448);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__01451);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:698:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:702:1: ( ( 'Role' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:703:1: ( 'Role' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:703:1: ( 'Role' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:704:1: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Role__Group__0__Impl1479); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:717:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:721:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:722:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__11510);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__11513);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:729:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:733:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:734:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:734:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:735:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:736:1: ( rule__Role__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:736:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl1540);
            rule__Role__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:746:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:750:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:751:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__21570);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__21573);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:758:1: rule__Role__Group__2__Impl : ( ( rule__Role__TextfieldAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:762:1: ( ( ( rule__Role__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:763:1: ( ( rule__Role__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:763:1: ( ( rule__Role__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:764:1: ( rule__Role__TextfieldAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:765:1: ( rule__Role__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:765:2: rule__Role__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__Role__TextfieldAssignment_2_in_rule__Role__Group__2__Impl1600);
            rule__Role__TextfieldAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getTextfieldAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:775:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:779:1: ( rule__Role__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:780:2: rule__Role__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__31630);
            rule__Role__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:786:1: rule__Role__Group__3__Impl : ( ';' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:790:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:791:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:791:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:792:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Role__Group__3__Impl1658); 
             after(grammarAccess.getRoleAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__WorkProductType__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:813:1: rule__WorkProductType__Group__0 : rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1 ;
    public final void rule__WorkProductType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:817:1: ( rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:818:2: rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__0__Impl_in_rule__WorkProductType__Group__01697);
            rule__WorkProductType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__1_in_rule__WorkProductType__Group__01700);
            rule__WorkProductType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProductType__Group__0"


    // $ANTLR start "rule__WorkProductType__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:825:1: rule__WorkProductType__Group__0__Impl : ( 'WorkProductType' ) ;
    public final void rule__WorkProductType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:829:1: ( ( 'WorkProductType' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:830:1: ( 'WorkProductType' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:830:1: ( 'WorkProductType' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:831:1: 'WorkProductType'
            {
             before(grammarAccess.getWorkProductTypeAccess().getWorkProductTypeKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__WorkProductType__Group__0__Impl1728); 
             after(grammarAccess.getWorkProductTypeAccess().getWorkProductTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProductType__Group__0__Impl"


    // $ANTLR start "rule__WorkProductType__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:844:1: rule__WorkProductType__Group__1 : rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2 ;
    public final void rule__WorkProductType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:848:1: ( rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:849:2: rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__1__Impl_in_rule__WorkProductType__Group__11759);
            rule__WorkProductType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__2_in_rule__WorkProductType__Group__11762);
            rule__WorkProductType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProductType__Group__1"


    // $ANTLR start "rule__WorkProductType__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:856:1: rule__WorkProductType__Group__1__Impl : ( ( rule__WorkProductType__NameAssignment_1 ) ) ;
    public final void rule__WorkProductType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:860:1: ( ( ( rule__WorkProductType__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:861:1: ( ( rule__WorkProductType__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:861:1: ( ( rule__WorkProductType__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:862:1: ( rule__WorkProductType__NameAssignment_1 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:863:1: ( rule__WorkProductType__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:863:2: rule__WorkProductType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkProductType__NameAssignment_1_in_rule__WorkProductType__Group__1__Impl1789);
            rule__WorkProductType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkProductTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProductType__Group__1__Impl"


    // $ANTLR start "rule__WorkProductType__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:873:1: rule__WorkProductType__Group__2 : rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3 ;
    public final void rule__WorkProductType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:877:1: ( rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:878:2: rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__2__Impl_in_rule__WorkProductType__Group__21819);
            rule__WorkProductType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__3_in_rule__WorkProductType__Group__21822);
            rule__WorkProductType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProductType__Group__2"


    // $ANTLR start "rule__WorkProductType__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:885:1: rule__WorkProductType__Group__2__Impl : ( ( rule__WorkProductType__TextfieldAssignment_2 ) ) ;
    public final void rule__WorkProductType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:889:1: ( ( ( rule__WorkProductType__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:890:1: ( ( rule__WorkProductType__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:890:1: ( ( rule__WorkProductType__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:891:1: ( rule__WorkProductType__TextfieldAssignment_2 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:892:1: ( rule__WorkProductType__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:892:2: rule__WorkProductType__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__WorkProductType__TextfieldAssignment_2_in_rule__WorkProductType__Group__2__Impl1849);
            rule__WorkProductType__TextfieldAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkProductTypeAccess().getTextfieldAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProductType__Group__2__Impl"


    // $ANTLR start "rule__WorkProductType__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:902:1: rule__WorkProductType__Group__3 : rule__WorkProductType__Group__3__Impl ;
    public final void rule__WorkProductType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:906:1: ( rule__WorkProductType__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:907:2: rule__WorkProductType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__3__Impl_in_rule__WorkProductType__Group__31879);
            rule__WorkProductType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProductType__Group__3"


    // $ANTLR start "rule__WorkProductType__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:913:1: rule__WorkProductType__Group__3__Impl : ( ';' ) ;
    public final void rule__WorkProductType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:917:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:918:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:918:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:919:1: ';'
            {
             before(grammarAccess.getWorkProductTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__WorkProductType__Group__3__Impl1907); 
             after(grammarAccess.getWorkProductTypeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProductType__Group__3__Impl"


    // $ANTLR start "rule__WorkProduct__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:940:1: rule__WorkProduct__Group__0 : rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1 ;
    public final void rule__WorkProduct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:944:1: ( rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:945:2: rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__0__Impl_in_rule__WorkProduct__Group__01946);
            rule__WorkProduct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__1_in_rule__WorkProduct__Group__01949);
            rule__WorkProduct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__0"


    // $ANTLR start "rule__WorkProduct__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:952:1: rule__WorkProduct__Group__0__Impl : ( 'WorkProduct' ) ;
    public final void rule__WorkProduct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:956:1: ( ( 'WorkProduct' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:957:1: ( 'WorkProduct' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:957:1: ( 'WorkProduct' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:958:1: 'WorkProduct'
            {
             before(grammarAccess.getWorkProductAccess().getWorkProductKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__WorkProduct__Group__0__Impl1977); 
             after(grammarAccess.getWorkProductAccess().getWorkProductKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__0__Impl"


    // $ANTLR start "rule__WorkProduct__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:971:1: rule__WorkProduct__Group__1 : rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2 ;
    public final void rule__WorkProduct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:975:1: ( rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:976:2: rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__1__Impl_in_rule__WorkProduct__Group__12008);
            rule__WorkProduct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__2_in_rule__WorkProduct__Group__12011);
            rule__WorkProduct__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__1"


    // $ANTLR start "rule__WorkProduct__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:983:1: rule__WorkProduct__Group__1__Impl : ( ( rule__WorkProduct__NameAssignment_1 ) ) ;
    public final void rule__WorkProduct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:987:1: ( ( ( rule__WorkProduct__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:988:1: ( ( rule__WorkProduct__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:988:1: ( ( rule__WorkProduct__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:989:1: ( rule__WorkProduct__NameAssignment_1 )
            {
             before(grammarAccess.getWorkProductAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:990:1: ( rule__WorkProduct__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:990:2: rule__WorkProduct__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkProduct__NameAssignment_1_in_rule__WorkProduct__Group__1__Impl2038);
            rule__WorkProduct__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkProductAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__1__Impl"


    // $ANTLR start "rule__WorkProduct__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1000:1: rule__WorkProduct__Group__2 : rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3 ;
    public final void rule__WorkProduct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1004:1: ( rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1005:2: rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__2__Impl_in_rule__WorkProduct__Group__22068);
            rule__WorkProduct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__3_in_rule__WorkProduct__Group__22071);
            rule__WorkProduct__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__2"


    // $ANTLR start "rule__WorkProduct__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1012:1: rule__WorkProduct__Group__2__Impl : ( ':' ) ;
    public final void rule__WorkProduct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1016:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1017:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1017:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1018:1: ':'
            {
             before(grammarAccess.getWorkProductAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__WorkProduct__Group__2__Impl2099); 
             after(grammarAccess.getWorkProductAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__2__Impl"


    // $ANTLR start "rule__WorkProduct__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1031:1: rule__WorkProduct__Group__3 : rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4 ;
    public final void rule__WorkProduct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1035:1: ( rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1036:2: rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__3__Impl_in_rule__WorkProduct__Group__32130);
            rule__WorkProduct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__4_in_rule__WorkProduct__Group__32133);
            rule__WorkProduct__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__3"


    // $ANTLR start "rule__WorkProduct__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1043:1: rule__WorkProduct__Group__3__Impl : ( ( rule__WorkProduct__TypeAssignment_3 ) ) ;
    public final void rule__WorkProduct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1047:1: ( ( ( rule__WorkProduct__TypeAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1048:1: ( ( rule__WorkProduct__TypeAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1048:1: ( ( rule__WorkProduct__TypeAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1049:1: ( rule__WorkProduct__TypeAssignment_3 )
            {
             before(grammarAccess.getWorkProductAccess().getTypeAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1050:1: ( rule__WorkProduct__TypeAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1050:2: rule__WorkProduct__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__WorkProduct__TypeAssignment_3_in_rule__WorkProduct__Group__3__Impl2160);
            rule__WorkProduct__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkProductAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__3__Impl"


    // $ANTLR start "rule__WorkProduct__Group__4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1060:1: rule__WorkProduct__Group__4 : rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5 ;
    public final void rule__WorkProduct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1064:1: ( rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1065:2: rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__4__Impl_in_rule__WorkProduct__Group__42190);
            rule__WorkProduct__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__5_in_rule__WorkProduct__Group__42193);
            rule__WorkProduct__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__4"


    // $ANTLR start "rule__WorkProduct__Group__4__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1072:1: rule__WorkProduct__Group__4__Impl : ( ( rule__WorkProduct__TextfieldAssignment_4 ) ) ;
    public final void rule__WorkProduct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1076:1: ( ( ( rule__WorkProduct__TextfieldAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1077:1: ( ( rule__WorkProduct__TextfieldAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1077:1: ( ( rule__WorkProduct__TextfieldAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1078:1: ( rule__WorkProduct__TextfieldAssignment_4 )
            {
             before(grammarAccess.getWorkProductAccess().getTextfieldAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1079:1: ( rule__WorkProduct__TextfieldAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1079:2: rule__WorkProduct__TextfieldAssignment_4
            {
            pushFollow(FOLLOW_rule__WorkProduct__TextfieldAssignment_4_in_rule__WorkProduct__Group__4__Impl2220);
            rule__WorkProduct__TextfieldAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWorkProductAccess().getTextfieldAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__4__Impl"


    // $ANTLR start "rule__WorkProduct__Group__5"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1089:1: rule__WorkProduct__Group__5 : rule__WorkProduct__Group__5__Impl ;
    public final void rule__WorkProduct__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1093:1: ( rule__WorkProduct__Group__5__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1094:2: rule__WorkProduct__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__5__Impl_in_rule__WorkProduct__Group__52250);
            rule__WorkProduct__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__5"


    // $ANTLR start "rule__WorkProduct__Group__5__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1100:1: rule__WorkProduct__Group__5__Impl : ( ';' ) ;
    public final void rule__WorkProduct__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1104:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1105:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1105:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1106:1: ';'
            {
             before(grammarAccess.getWorkProductAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__WorkProduct__Group__5__Impl2278); 
             after(grammarAccess.getWorkProductAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__Group__5__Impl"


    // $ANTLR start "rule__GuidanceType__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1131:1: rule__GuidanceType__Group__0 : rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1 ;
    public final void rule__GuidanceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1135:1: ( rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1136:2: rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__0__Impl_in_rule__GuidanceType__Group__02321);
            rule__GuidanceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__1_in_rule__GuidanceType__Group__02324);
            rule__GuidanceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceType__Group__0"


    // $ANTLR start "rule__GuidanceType__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1143:1: rule__GuidanceType__Group__0__Impl : ( 'GuidanceType' ) ;
    public final void rule__GuidanceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1147:1: ( ( 'GuidanceType' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1148:1: ( 'GuidanceType' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1148:1: ( 'GuidanceType' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1149:1: 'GuidanceType'
            {
             before(grammarAccess.getGuidanceTypeAccess().getGuidanceTypeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__GuidanceType__Group__0__Impl2352); 
             after(grammarAccess.getGuidanceTypeAccess().getGuidanceTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceType__Group__0__Impl"


    // $ANTLR start "rule__GuidanceType__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1162:1: rule__GuidanceType__Group__1 : rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2 ;
    public final void rule__GuidanceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1166:1: ( rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1167:2: rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__1__Impl_in_rule__GuidanceType__Group__12383);
            rule__GuidanceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__2_in_rule__GuidanceType__Group__12386);
            rule__GuidanceType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceType__Group__1"


    // $ANTLR start "rule__GuidanceType__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1174:1: rule__GuidanceType__Group__1__Impl : ( ( rule__GuidanceType__NameAssignment_1 ) ) ;
    public final void rule__GuidanceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1178:1: ( ( ( rule__GuidanceType__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1179:1: ( ( rule__GuidanceType__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1179:1: ( ( rule__GuidanceType__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1180:1: ( rule__GuidanceType__NameAssignment_1 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1181:1: ( rule__GuidanceType__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1181:2: rule__GuidanceType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GuidanceType__NameAssignment_1_in_rule__GuidanceType__Group__1__Impl2413);
            rule__GuidanceType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceType__Group__1__Impl"


    // $ANTLR start "rule__GuidanceType__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1191:1: rule__GuidanceType__Group__2 : rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3 ;
    public final void rule__GuidanceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1195:1: ( rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1196:2: rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__2__Impl_in_rule__GuidanceType__Group__22443);
            rule__GuidanceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__3_in_rule__GuidanceType__Group__22446);
            rule__GuidanceType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceType__Group__2"


    // $ANTLR start "rule__GuidanceType__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1203:1: rule__GuidanceType__Group__2__Impl : ( ( rule__GuidanceType__TextfieldAssignment_2 ) ) ;
    public final void rule__GuidanceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1207:1: ( ( ( rule__GuidanceType__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1208:1: ( ( rule__GuidanceType__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1208:1: ( ( rule__GuidanceType__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1209:1: ( rule__GuidanceType__TextfieldAssignment_2 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1210:1: ( rule__GuidanceType__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1210:2: rule__GuidanceType__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__GuidanceType__TextfieldAssignment_2_in_rule__GuidanceType__Group__2__Impl2473);
            rule__GuidanceType__TextfieldAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceTypeAccess().getTextfieldAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceType__Group__2__Impl"


    // $ANTLR start "rule__GuidanceType__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1220:1: rule__GuidanceType__Group__3 : rule__GuidanceType__Group__3__Impl ;
    public final void rule__GuidanceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1224:1: ( rule__GuidanceType__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1225:2: rule__GuidanceType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__3__Impl_in_rule__GuidanceType__Group__32503);
            rule__GuidanceType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceType__Group__3"


    // $ANTLR start "rule__GuidanceType__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1231:1: rule__GuidanceType__Group__3__Impl : ( ';' ) ;
    public final void rule__GuidanceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1235:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1236:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1236:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1237:1: ';'
            {
             before(grammarAccess.getGuidanceTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__GuidanceType__Group__3__Impl2531); 
             after(grammarAccess.getGuidanceTypeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceType__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1258:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1262:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1263:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02570);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02573);
            rule__Guidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1270:1: rule__Guidance__Group__0__Impl : ( 'Guidance' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1274:1: ( ( 'Guidance' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1275:1: ( 'Guidance' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1275:1: ( 'Guidance' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1276:1: 'Guidance'
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Guidance__Group__0__Impl2601); 
             after(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1289:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1293:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1294:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__12632);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__12635);
            rule__Guidance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1301:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__NameAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1305:1: ( ( ( rule__Guidance__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1306:1: ( ( rule__Guidance__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1306:1: ( ( rule__Guidance__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1307:1: ( rule__Guidance__NameAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1308:1: ( rule__Guidance__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1308:2: rule__Guidance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Guidance__NameAssignment_1_in_rule__Guidance__Group__1__Impl2662);
            rule__Guidance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1318:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1322:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1323:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__22692);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__3_in_rule__Guidance__Group__22695);
            rule__Guidance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1330:1: rule__Guidance__Group__2__Impl : ( ':' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1334:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1335:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1335:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1336:1: ':'
            {
             before(grammarAccess.getGuidanceAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Guidance__Group__2__Impl2723); 
             after(grammarAccess.getGuidanceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1349:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1353:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1354:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_rule__Guidance__Group__3__Impl_in_rule__Guidance__Group__32754);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__4_in_rule__Guidance__Group__32757);
            rule__Guidance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3"


    // $ANTLR start "rule__Guidance__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1361:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__TypeAssignment_3 ) ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1365:1: ( ( ( rule__Guidance__TypeAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1366:1: ( ( rule__Guidance__TypeAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1366:1: ( ( rule__Guidance__TypeAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1367:1: ( rule__Guidance__TypeAssignment_3 )
            {
             before(grammarAccess.getGuidanceAccess().getTypeAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1368:1: ( rule__Guidance__TypeAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1368:2: rule__Guidance__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Guidance__TypeAssignment_3_in_rule__Guidance__Group__3__Impl2784);
            rule__Guidance__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1378:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl rule__Guidance__Group__5 ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1382:1: ( rule__Guidance__Group__4__Impl rule__Guidance__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1383:2: rule__Guidance__Group__4__Impl rule__Guidance__Group__5
            {
            pushFollow(FOLLOW_rule__Guidance__Group__4__Impl_in_rule__Guidance__Group__42814);
            rule__Guidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__5_in_rule__Guidance__Group__42817);
            rule__Guidance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4"


    // $ANTLR start "rule__Guidance__Group__4__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1390:1: rule__Guidance__Group__4__Impl : ( ( rule__Guidance__TextfieldAssignment_4 ) ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1394:1: ( ( ( rule__Guidance__TextfieldAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1395:1: ( ( rule__Guidance__TextfieldAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1395:1: ( ( rule__Guidance__TextfieldAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1396:1: ( rule__Guidance__TextfieldAssignment_4 )
            {
             before(grammarAccess.getGuidanceAccess().getTextfieldAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1397:1: ( rule__Guidance__TextfieldAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1397:2: rule__Guidance__TextfieldAssignment_4
            {
            pushFollow(FOLLOW_rule__Guidance__TextfieldAssignment_4_in_rule__Guidance__Group__4__Impl2844);
            rule__Guidance__TextfieldAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextfieldAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4__Impl"


    // $ANTLR start "rule__Guidance__Group__5"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1407:1: rule__Guidance__Group__5 : rule__Guidance__Group__5__Impl ;
    public final void rule__Guidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1411:1: ( rule__Guidance__Group__5__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1412:2: rule__Guidance__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Guidance__Group__5__Impl_in_rule__Guidance__Group__52874);
            rule__Guidance__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__5"


    // $ANTLR start "rule__Guidance__Group__5__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1418:1: rule__Guidance__Group__5__Impl : ( ';' ) ;
    public final void rule__Guidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1422:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1423:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1423:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1424:1: ';'
            {
             before(grammarAccess.getGuidanceAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__Guidance__Group__5__Impl2902); 
             after(grammarAccess.getGuidanceAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__5__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1449:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1453:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1454:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02945);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__02948);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1461:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1465:1: ( ( 'State' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1466:1: ( 'State' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1466:1: ( 'State' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1467:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__State__Group__0__Impl2976); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1480:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1484:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1485:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13007);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__13010);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1492:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1496:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1497:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1497:1: ( ( rule__State__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1498:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1499:1: ( rule__State__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1499:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl3037);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1509:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1513:1: ( rule__State__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1514:2: rule__State__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23067);
            rule__State__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1520:1: rule__State__Group__2__Impl : ( ';' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1524:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1525:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1525:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1526:1: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__State__Group__2__Impl3095); 
             after(grammarAccess.getStateAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1545:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1549:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1550:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03132);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03135);
            rule__Port__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1557:1: rule__Port__Group__0__Impl : ( ( rule__Port__TypeAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1561:1: ( ( ( rule__Port__TypeAssignment_0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1562:1: ( ( rule__Port__TypeAssignment_0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1562:1: ( ( rule__Port__TypeAssignment_0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1563:1: ( rule__Port__TypeAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1564:1: ( rule__Port__TypeAssignment_0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1564:2: rule__Port__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__TypeAssignment_0_in_rule__Port__Group__0__Impl3162);
            rule__Port__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1574:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1578:1: ( rule__Port__Group__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1579:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13192);
            rule__Port__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1585:1: rule__Port__Group__1__Impl : ( ( rule__Port__Group_1__0 )? ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1589:1: ( ( ( rule__Port__Group_1__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1590:1: ( ( rule__Port__Group_1__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1590:1: ( ( rule__Port__Group_1__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1591:1: ( rule__Port__Group_1__0 )?
            {
             before(grammarAccess.getPortAccess().getGroup_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1592:1: ( rule__Port__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1592:2: rule__Port__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Port__Group_1__0_in_rule__Port__Group__1__Impl3219);
                    rule__Port__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group_1__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1606:1: rule__Port__Group_1__0 : rule__Port__Group_1__0__Impl rule__Port__Group_1__1 ;
    public final void rule__Port__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1610:1: ( rule__Port__Group_1__0__Impl rule__Port__Group_1__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1611:2: rule__Port__Group_1__0__Impl rule__Port__Group_1__1
            {
            pushFollow(FOLLOW_rule__Port__Group_1__0__Impl_in_rule__Port__Group_1__03254);
            rule__Port__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group_1__1_in_rule__Port__Group_1__03257);
            rule__Port__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__0"


    // $ANTLR start "rule__Port__Group_1__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1618:1: rule__Port__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Port__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1622:1: ( ( '(' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1623:1: ( '(' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1623:1: ( '(' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1624:1: '('
            {
             before(grammarAccess.getPortAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Port__Group_1__0__Impl3285); 
             after(grammarAccess.getPortAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__0__Impl"


    // $ANTLR start "rule__Port__Group_1__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1637:1: rule__Port__Group_1__1 : rule__Port__Group_1__1__Impl rule__Port__Group_1__2 ;
    public final void rule__Port__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1641:1: ( rule__Port__Group_1__1__Impl rule__Port__Group_1__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1642:2: rule__Port__Group_1__1__Impl rule__Port__Group_1__2
            {
            pushFollow(FOLLOW_rule__Port__Group_1__1__Impl_in_rule__Port__Group_1__13316);
            rule__Port__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group_1__2_in_rule__Port__Group_1__13319);
            rule__Port__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__1"


    // $ANTLR start "rule__Port__Group_1__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1649:1: rule__Port__Group_1__1__Impl : ( ( rule__Port__StateAssignment_1_1 ) ) ;
    public final void rule__Port__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1653:1: ( ( ( rule__Port__StateAssignment_1_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1654:1: ( ( rule__Port__StateAssignment_1_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1654:1: ( ( rule__Port__StateAssignment_1_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1655:1: ( rule__Port__StateAssignment_1_1 )
            {
             before(grammarAccess.getPortAccess().getStateAssignment_1_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1656:1: ( rule__Port__StateAssignment_1_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1656:2: rule__Port__StateAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Port__StateAssignment_1_1_in_rule__Port__Group_1__1__Impl3346);
            rule__Port__StateAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getStateAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__1__Impl"


    // $ANTLR start "rule__Port__Group_1__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1666:1: rule__Port__Group_1__2 : rule__Port__Group_1__2__Impl ;
    public final void rule__Port__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1670:1: ( rule__Port__Group_1__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1671:2: rule__Port__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group_1__2__Impl_in_rule__Port__Group_1__23376);
            rule__Port__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__2"


    // $ANTLR start "rule__Port__Group_1__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1677:1: rule__Port__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Port__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1681:1: ( ( ')' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1682:1: ( ')' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1682:1: ( ')' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1683:1: ')'
            {
             before(grammarAccess.getPortAccess().getRightParenthesisKeyword_1_2()); 
            match(input,20,FOLLOW_20_in_rule__Port__Group_1__2__Impl3404); 
             after(grammarAccess.getPortAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__2__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1702:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1706:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1707:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03441);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03444);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1714:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1718:1: ( ( 'Activity' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1719:1: ( 'Activity' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1719:1: ( 'Activity' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1720:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group__0__Impl3472); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1733:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1737:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1738:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13503);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13506);
            rule__Activity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1745:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1749:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1750:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1750:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1751:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1752:1: ( rule__Activity__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1752:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl3533);
            rule__Activity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1762:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1766:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1767:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23563);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23566);
            rule__Activity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1774:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__TextfieldAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1778:1: ( ( ( rule__Activity__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1779:1: ( ( rule__Activity__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1779:1: ( ( rule__Activity__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1780:1: ( rule__Activity__TextfieldAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1781:1: ( rule__Activity__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1781:2: rule__Activity__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__TextfieldAssignment_2_in_rule__Activity__Group__2__Impl3593);
            rule__Activity__TextfieldAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getTextfieldAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1791:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1795:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1796:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33623);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33626);
            rule__Activity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1803:1: rule__Activity__Group__3__Impl : ( 'responsible' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1807:1: ( ( 'responsible' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1808:1: ( 'responsible' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1808:1: ( 'responsible' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1809:1: 'responsible'
            {
             before(grammarAccess.getActivityAccess().getResponsibleKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Activity__Group__3__Impl3654); 
             after(grammarAccess.getActivityAccess().getResponsibleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1822:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1826:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1827:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43685);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43688);
            rule__Activity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1834:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__RoleAssignment_4 ) ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1838:1: ( ( ( rule__Activity__RoleAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1839:1: ( ( rule__Activity__RoleAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1839:1: ( ( rule__Activity__RoleAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1840:1: ( rule__Activity__RoleAssignment_4 )
            {
             before(grammarAccess.getActivityAccess().getRoleAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1841:1: ( rule__Activity__RoleAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1841:2: rule__Activity__RoleAssignment_4
            {
            pushFollow(FOLLOW_rule__Activity__RoleAssignment_4_in_rule__Activity__Group__4__Impl3715);
            rule__Activity__RoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getRoleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1851:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1855:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1856:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__53745);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__53748);
            rule__Activity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1863:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1867:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1868:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1868:1: ( ( rule__Activity__Group_5__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1869:1: ( rule__Activity__Group_5__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_5()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1870:1: ( rule__Activity__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1870:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl3775);
                    rule__Activity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1880:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1884:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1885:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63806);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63809);
            rule__Activity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6"


    // $ANTLR start "rule__Activity__Group__6__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1892:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__Group_6__0 )? ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1896:1: ( ( ( rule__Activity__Group_6__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1897:1: ( ( rule__Activity__Group_6__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1897:1: ( ( rule__Activity__Group_6__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1898:1: ( rule__Activity__Group_6__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_6()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1899:1: ( rule__Activity__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1899:2: rule__Activity__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl3836);
                    rule__Activity__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group__7"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1909:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1913:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1914:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73867);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__73870);
            rule__Activity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7"


    // $ANTLR start "rule__Activity__Group__7__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1921:1: rule__Activity__Group__7__Impl : ( ( rule__Activity__Group_7__0 )? ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1925:1: ( ( ( rule__Activity__Group_7__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1926:1: ( ( rule__Activity__Group_7__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1926:1: ( ( rule__Activity__Group_7__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1927:1: ( rule__Activity__Group_7__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_7()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1928:1: ( rule__Activity__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1928:2: rule__Activity__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl3897);
                    rule__Activity__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group__8"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1938:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1942:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1943:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__83928);
            rule__Activity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__83931);
            rule__Activity__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8"


    // $ANTLR start "rule__Activity__Group__8__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1950:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__Group_8__0 )? ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1954:1: ( ( ( rule__Activity__Group_8__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1955:1: ( ( rule__Activity__Group_8__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1955:1: ( ( rule__Activity__Group_8__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1956:1: ( rule__Activity__Group_8__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_8()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1957:1: ( rule__Activity__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1957:2: rule__Activity__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl3958);
                    rule__Activity__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8__Impl"


    // $ANTLR start "rule__Activity__Group__9"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1967:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1971:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1972:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__93989);
            rule__Activity__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__93992);
            rule__Activity__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__9"


    // $ANTLR start "rule__Activity__Group__9__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1979:1: rule__Activity__Group__9__Impl : ( ( rule__Activity__Group_9__0 )? ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1983:1: ( ( ( rule__Activity__Group_9__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1984:1: ( ( rule__Activity__Group_9__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1984:1: ( ( rule__Activity__Group_9__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1985:1: ( rule__Activity__Group_9__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_9()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1986:1: ( rule__Activity__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1986:2: rule__Activity__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl4019);
                    rule__Activity__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__9__Impl"


    // $ANTLR start "rule__Activity__Group__10"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1996:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2000:1: ( rule__Activity__Group__10__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2001:2: rule__Activity__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__104050);
            rule__Activity__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__10"


    // $ANTLR start "rule__Activity__Group__10__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2007:1: rule__Activity__Group__10__Impl : ( ';' ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2011:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2012:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2012:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2013:1: ';'
            {
             before(grammarAccess.getActivityAccess().getSemicolonKeyword_10()); 
            match(input,12,FOLLOW_12_in_rule__Activity__Group__10__Impl4078); 
             after(grammarAccess.getActivityAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__10__Impl"


    // $ANTLR start "rule__Activity__Group_5__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2048:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2052:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2053:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__04131);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__04134);
            rule__Activity__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__0"


    // $ANTLR start "rule__Activity__Group_5__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2060:1: rule__Activity__Group_5__0__Impl : ( 'inputs' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2064:1: ( ( 'inputs' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2065:1: ( 'inputs' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2065:1: ( 'inputs' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2066:1: 'inputs'
            {
             before(grammarAccess.getActivityAccess().getInputsKeyword_5_0()); 
            match(input,23,FOLLOW_23_in_rule__Activity__Group_5__0__Impl4162); 
             after(grammarAccess.getActivityAccess().getInputsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__0__Impl"


    // $ANTLR start "rule__Activity__Group_5__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2079:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2083:1: ( rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2084:2: rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__14193);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__14196);
            rule__Activity__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__1"


    // $ANTLR start "rule__Activity__Group_5__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2091:1: rule__Activity__Group_5__1__Impl : ( ( rule__Activity__InPortsAssignment_5_1 ) ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2095:1: ( ( ( rule__Activity__InPortsAssignment_5_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2096:1: ( ( rule__Activity__InPortsAssignment_5_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2096:1: ( ( rule__Activity__InPortsAssignment_5_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2097:1: ( rule__Activity__InPortsAssignment_5_1 )
            {
             before(grammarAccess.getActivityAccess().getInPortsAssignment_5_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2098:1: ( rule__Activity__InPortsAssignment_5_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2098:2: rule__Activity__InPortsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Activity__InPortsAssignment_5_1_in_rule__Activity__Group_5__1__Impl4223);
            rule__Activity__InPortsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getInPortsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__1__Impl"


    // $ANTLR start "rule__Activity__Group_5__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2108:1: rule__Activity__Group_5__2 : rule__Activity__Group_5__2__Impl ;
    public final void rule__Activity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2112:1: ( rule__Activity__Group_5__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2113:2: rule__Activity__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__24253);
            rule__Activity__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__2"


    // $ANTLR start "rule__Activity__Group_5__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2119:1: rule__Activity__Group_5__2__Impl : ( ( rule__Activity__Group_5_2__0 )* ) ;
    public final void rule__Activity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2123:1: ( ( ( rule__Activity__Group_5_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2124:1: ( ( rule__Activity__Group_5_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2124:1: ( ( rule__Activity__Group_5_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2125:1: ( rule__Activity__Group_5_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_5_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2126:1: ( rule__Activity__Group_5_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2126:2: rule__Activity__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__Group_5__2__Impl4280);
            	    rule__Activity__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__2__Impl"


    // $ANTLR start "rule__Activity__Group_5_2__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2142:1: rule__Activity__Group_5_2__0 : rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 ;
    public final void rule__Activity__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2146:1: ( rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2147:2: rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__04317);
            rule__Activity__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__04320);
            rule__Activity__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_2__0"


    // $ANTLR start "rule__Activity__Group_5_2__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2154:1: rule__Activity__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2158:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2159:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2159:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2160:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_5_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Activity__Group_5_2__0__Impl4348); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_5_2__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2173:1: rule__Activity__Group_5_2__1 : rule__Activity__Group_5_2__1__Impl ;
    public final void rule__Activity__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2177:1: ( rule__Activity__Group_5_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2178:2: rule__Activity__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__14379);
            rule__Activity__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_2__1"


    // $ANTLR start "rule__Activity__Group_5_2__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2184:1: rule__Activity__Group_5_2__1__Impl : ( ( rule__Activity__InPortsAssignment_5_2_1 ) ) ;
    public final void rule__Activity__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2188:1: ( ( ( rule__Activity__InPortsAssignment_5_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2189:1: ( ( rule__Activity__InPortsAssignment_5_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2189:1: ( ( rule__Activity__InPortsAssignment_5_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2190:1: ( rule__Activity__InPortsAssignment_5_2_1 )
            {
             before(grammarAccess.getActivityAccess().getInPortsAssignment_5_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2191:1: ( rule__Activity__InPortsAssignment_5_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2191:2: rule__Activity__InPortsAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Activity__InPortsAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl4406);
            rule__Activity__InPortsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getInPortsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_6__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2205:1: rule__Activity__Group_6__0 : rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 ;
    public final void rule__Activity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2209:1: ( rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2210:2: rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__04440);
            rule__Activity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__04443);
            rule__Activity__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__0"


    // $ANTLR start "rule__Activity__Group_6__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2217:1: rule__Activity__Group_6__0__Impl : ( 'outputs' ) ;
    public final void rule__Activity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2221:1: ( ( 'outputs' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2222:1: ( 'outputs' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2222:1: ( 'outputs' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2223:1: 'outputs'
            {
             before(grammarAccess.getActivityAccess().getOutputsKeyword_6_0()); 
            match(input,25,FOLLOW_25_in_rule__Activity__Group_6__0__Impl4471); 
             after(grammarAccess.getActivityAccess().getOutputsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__0__Impl"


    // $ANTLR start "rule__Activity__Group_6__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2236:1: rule__Activity__Group_6__1 : rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 ;
    public final void rule__Activity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2240:1: ( rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2241:2: rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__14502);
            rule__Activity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__14505);
            rule__Activity__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__1"


    // $ANTLR start "rule__Activity__Group_6__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2248:1: rule__Activity__Group_6__1__Impl : ( ( rule__Activity__OutPortsAssignment_6_1 ) ) ;
    public final void rule__Activity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2252:1: ( ( ( rule__Activity__OutPortsAssignment_6_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2253:1: ( ( rule__Activity__OutPortsAssignment_6_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2253:1: ( ( rule__Activity__OutPortsAssignment_6_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2254:1: ( rule__Activity__OutPortsAssignment_6_1 )
            {
             before(grammarAccess.getActivityAccess().getOutPortsAssignment_6_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2255:1: ( rule__Activity__OutPortsAssignment_6_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2255:2: rule__Activity__OutPortsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Activity__OutPortsAssignment_6_1_in_rule__Activity__Group_6__1__Impl4532);
            rule__Activity__OutPortsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getOutPortsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__1__Impl"


    // $ANTLR start "rule__Activity__Group_6__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2265:1: rule__Activity__Group_6__2 : rule__Activity__Group_6__2__Impl ;
    public final void rule__Activity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2269:1: ( rule__Activity__Group_6__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2270:2: rule__Activity__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__24562);
            rule__Activity__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__2"


    // $ANTLR start "rule__Activity__Group_6__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2276:1: rule__Activity__Group_6__2__Impl : ( ( rule__Activity__Group_6_2__0 )* ) ;
    public final void rule__Activity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2280:1: ( ( ( rule__Activity__Group_6_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2281:1: ( ( rule__Activity__Group_6_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2281:1: ( ( rule__Activity__Group_6_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2282:1: ( rule__Activity__Group_6_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_6_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2283:1: ( rule__Activity__Group_6_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2283:2: rule__Activity__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__Group_6__2__Impl4589);
            	    rule__Activity__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_2__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2299:1: rule__Activity__Group_6_2__0 : rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 ;
    public final void rule__Activity__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2303:1: ( rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2304:2: rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__04626);
            rule__Activity__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__04629);
            rule__Activity__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_2__0"


    // $ANTLR start "rule__Activity__Group_6_2__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2311:1: rule__Activity__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2315:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2316:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2316:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2317:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_6_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Activity__Group_6_2__0__Impl4657); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_2__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2330:1: rule__Activity__Group_6_2__1 : rule__Activity__Group_6_2__1__Impl ;
    public final void rule__Activity__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2334:1: ( rule__Activity__Group_6_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2335:2: rule__Activity__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__14688);
            rule__Activity__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_2__1"


    // $ANTLR start "rule__Activity__Group_6_2__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2341:1: rule__Activity__Group_6_2__1__Impl : ( ( rule__Activity__OutPortsAssignment_6_2_1 ) ) ;
    public final void rule__Activity__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2345:1: ( ( ( rule__Activity__OutPortsAssignment_6_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2346:1: ( ( rule__Activity__OutPortsAssignment_6_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2346:1: ( ( rule__Activity__OutPortsAssignment_6_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2347:1: ( rule__Activity__OutPortsAssignment_6_2_1 )
            {
             before(grammarAccess.getActivityAccess().getOutPortsAssignment_6_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2348:1: ( rule__Activity__OutPortsAssignment_6_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2348:2: rule__Activity__OutPortsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Activity__OutPortsAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl4715);
            rule__Activity__OutPortsAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getOutPortsAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_7__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2362:1: rule__Activity__Group_7__0 : rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 ;
    public final void rule__Activity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2366:1: ( rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2367:2: rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__04749);
            rule__Activity__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__04752);
            rule__Activity__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_7__0"


    // $ANTLR start "rule__Activity__Group_7__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2374:1: rule__Activity__Group_7__0__Impl : ( 'subActivities' ) ;
    public final void rule__Activity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2378:1: ( ( 'subActivities' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2379:1: ( 'subActivities' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2379:1: ( 'subActivities' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2380:1: 'subActivities'
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Activity__Group_7__0__Impl4780); 
             after(grammarAccess.getActivityAccess().getSubActivitiesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_7__0__Impl"


    // $ANTLR start "rule__Activity__Group_7__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2393:1: rule__Activity__Group_7__1 : rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2 ;
    public final void rule__Activity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2397:1: ( rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2398:2: rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__14811);
            rule__Activity__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7__2_in_rule__Activity__Group_7__14814);
            rule__Activity__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_7__1"


    // $ANTLR start "rule__Activity__Group_7__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2405:1: rule__Activity__Group_7__1__Impl : ( ( rule__Activity__SubActivitiesAssignment_7_1 ) ) ;
    public final void rule__Activity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2409:1: ( ( ( rule__Activity__SubActivitiesAssignment_7_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2410:1: ( ( rule__Activity__SubActivitiesAssignment_7_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2410:1: ( ( rule__Activity__SubActivitiesAssignment_7_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2411:1: ( rule__Activity__SubActivitiesAssignment_7_1 )
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2412:1: ( rule__Activity__SubActivitiesAssignment_7_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2412:2: rule__Activity__SubActivitiesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Activity__SubActivitiesAssignment_7_1_in_rule__Activity__Group_7__1__Impl4841);
            rule__Activity__SubActivitiesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_7__1__Impl"


    // $ANTLR start "rule__Activity__Group_7__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2422:1: rule__Activity__Group_7__2 : rule__Activity__Group_7__2__Impl ;
    public final void rule__Activity__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2426:1: ( rule__Activity__Group_7__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2427:2: rule__Activity__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__2__Impl_in_rule__Activity__Group_7__24871);
            rule__Activity__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_7__2"


    // $ANTLR start "rule__Activity__Group_7__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2433:1: rule__Activity__Group_7__2__Impl : ( ( rule__Activity__Group_7_2__0 )* ) ;
    public final void rule__Activity__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2437:1: ( ( ( rule__Activity__Group_7_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2438:1: ( ( rule__Activity__Group_7_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2438:1: ( ( rule__Activity__Group_7_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2439:1: ( rule__Activity__Group_7_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_7_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2440:1: ( rule__Activity__Group_7_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2440:2: rule__Activity__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__Group_7__2__Impl4898);
            	    rule__Activity__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_7__2__Impl"


    // $ANTLR start "rule__Activity__Group_7_2__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2456:1: rule__Activity__Group_7_2__0 : rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 ;
    public final void rule__Activity__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2460:1: ( rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2461:2: rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__04935);
            rule__Activity__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__04938);
            rule__Activity__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_7_2__0"


    // $ANTLR start "rule__Activity__Group_7_2__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2468:1: rule__Activity__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2472:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2473:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2473:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2474:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_7_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Activity__Group_7_2__0__Impl4966); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_7_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_7_2__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2487:1: rule__Activity__Group_7_2__1 : rule__Activity__Group_7_2__1__Impl ;
    public final void rule__Activity__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2491:1: ( rule__Activity__Group_7_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2492:2: rule__Activity__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__14997);
            rule__Activity__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_7_2__1"


    // $ANTLR start "rule__Activity__Group_7_2__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2498:1: rule__Activity__Group_7_2__1__Impl : ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) ) ;
    public final void rule__Activity__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2502:1: ( ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2503:1: ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2503:1: ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2504:1: ( rule__Activity__SubActivitiesAssignment_7_2_1 )
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2505:1: ( rule__Activity__SubActivitiesAssignment_7_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2505:2: rule__Activity__SubActivitiesAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Activity__SubActivitiesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl5024);
            rule__Activity__SubActivitiesAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_7_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_8__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2519:1: rule__Activity__Group_8__0 : rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 ;
    public final void rule__Activity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2523:1: ( rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2524:2: rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__05058);
            rule__Activity__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__05061);
            rule__Activity__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__0"


    // $ANTLR start "rule__Activity__Group_8__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2531:1: rule__Activity__Group_8__0__Impl : ( 'guidances' ) ;
    public final void rule__Activity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2535:1: ( ( 'guidances' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2536:1: ( 'guidances' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2536:1: ( 'guidances' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2537:1: 'guidances'
            {
             before(grammarAccess.getActivityAccess().getGuidancesKeyword_8_0()); 
            match(input,27,FOLLOW_27_in_rule__Activity__Group_8__0__Impl5089); 
             after(grammarAccess.getActivityAccess().getGuidancesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__0__Impl"


    // $ANTLR start "rule__Activity__Group_8__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2550:1: rule__Activity__Group_8__1 : rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 ;
    public final void rule__Activity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2554:1: ( rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2555:2: rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__15120);
            rule__Activity__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__15123);
            rule__Activity__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__1"


    // $ANTLR start "rule__Activity__Group_8__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2562:1: rule__Activity__Group_8__1__Impl : ( ( rule__Activity__GuidancesAssignment_8_1 ) ) ;
    public final void rule__Activity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2566:1: ( ( ( rule__Activity__GuidancesAssignment_8_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2567:1: ( ( rule__Activity__GuidancesAssignment_8_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2567:1: ( ( rule__Activity__GuidancesAssignment_8_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2568:1: ( rule__Activity__GuidancesAssignment_8_1 )
            {
             before(grammarAccess.getActivityAccess().getGuidancesAssignment_8_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2569:1: ( rule__Activity__GuidancesAssignment_8_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2569:2: rule__Activity__GuidancesAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Activity__GuidancesAssignment_8_1_in_rule__Activity__Group_8__1__Impl5150);
            rule__Activity__GuidancesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGuidancesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__1__Impl"


    // $ANTLR start "rule__Activity__Group_8__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2579:1: rule__Activity__Group_8__2 : rule__Activity__Group_8__2__Impl ;
    public final void rule__Activity__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2583:1: ( rule__Activity__Group_8__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2584:2: rule__Activity__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__25180);
            rule__Activity__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__2"


    // $ANTLR start "rule__Activity__Group_8__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2590:1: rule__Activity__Group_8__2__Impl : ( ( rule__Activity__Group_8_2__0 )* ) ;
    public final void rule__Activity__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2594:1: ( ( ( rule__Activity__Group_8_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2595:1: ( ( rule__Activity__Group_8_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2595:1: ( ( rule__Activity__Group_8_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2596:1: ( rule__Activity__Group_8_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_8_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2597:1: ( rule__Activity__Group_8_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2597:2: rule__Activity__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_8_2__0_in_rule__Activity__Group_8__2__Impl5207);
            	    rule__Activity__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8__2__Impl"


    // $ANTLR start "rule__Activity__Group_8_2__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2613:1: rule__Activity__Group_8_2__0 : rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1 ;
    public final void rule__Activity__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2617:1: ( rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2618:2: rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8_2__0__Impl_in_rule__Activity__Group_8_2__05244);
            rule__Activity__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8_2__1_in_rule__Activity__Group_8_2__05247);
            rule__Activity__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8_2__0"


    // $ANTLR start "rule__Activity__Group_8_2__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2625:1: rule__Activity__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2629:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2630:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2630:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2631:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_8_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Activity__Group_8_2__0__Impl5275); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_8_2__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2644:1: rule__Activity__Group_8_2__1 : rule__Activity__Group_8_2__1__Impl ;
    public final void rule__Activity__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2648:1: ( rule__Activity__Group_8_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2649:2: rule__Activity__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8_2__1__Impl_in_rule__Activity__Group_8_2__15306);
            rule__Activity__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8_2__1"


    // $ANTLR start "rule__Activity__Group_8_2__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2655:1: rule__Activity__Group_8_2__1__Impl : ( ( rule__Activity__GuidancesAssignment_8_2_1 ) ) ;
    public final void rule__Activity__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2659:1: ( ( ( rule__Activity__GuidancesAssignment_8_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2660:1: ( ( rule__Activity__GuidancesAssignment_8_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2660:1: ( ( rule__Activity__GuidancesAssignment_8_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2661:1: ( rule__Activity__GuidancesAssignment_8_2_1 )
            {
             before(grammarAccess.getActivityAccess().getGuidancesAssignment_8_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2662:1: ( rule__Activity__GuidancesAssignment_8_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2662:2: rule__Activity__GuidancesAssignment_8_2_1
            {
            pushFollow(FOLLOW_rule__Activity__GuidancesAssignment_8_2_1_in_rule__Activity__Group_8_2__1__Impl5333);
            rule__Activity__GuidancesAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGuidancesAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_8_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_9__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2676:1: rule__Activity__Group_9__0 : rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 ;
    public final void rule__Activity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2680:1: ( rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2681:2: rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__05367);
            rule__Activity__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__05370);
            rule__Activity__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__0"


    // $ANTLR start "rule__Activity__Group_9__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2688:1: rule__Activity__Group_9__0__Impl : ( 'Behavior' ) ;
    public final void rule__Activity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2692:1: ( ( 'Behavior' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2693:1: ( 'Behavior' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2693:1: ( 'Behavior' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2694:1: 'Behavior'
            {
             before(grammarAccess.getActivityAccess().getBehaviorKeyword_9_0()); 
            match(input,28,FOLLOW_28_in_rule__Activity__Group_9__0__Impl5398); 
             after(grammarAccess.getActivityAccess().getBehaviorKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__0__Impl"


    // $ANTLR start "rule__Activity__Group_9__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2707:1: rule__Activity__Group_9__1 : rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 ;
    public final void rule__Activity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2711:1: ( rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2712:2: rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__15429);
            rule__Activity__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__15432);
            rule__Activity__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__1"


    // $ANTLR start "rule__Activity__Group_9__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2719:1: rule__Activity__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2723:1: ( ( '{' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2724:1: ( '{' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2724:1: ( '{' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2725:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,29,FOLLOW_29_in_rule__Activity__Group_9__1__Impl5460); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__1__Impl"


    // $ANTLR start "rule__Activity__Group_9__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2738:1: rule__Activity__Group_9__2 : rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3 ;
    public final void rule__Activity__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2742:1: ( rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2743:2: rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__25491);
            rule__Activity__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__3_in_rule__Activity__Group_9__25494);
            rule__Activity__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__2"


    // $ANTLR start "rule__Activity__Group_9__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2750:1: rule__Activity__Group_9__2__Impl : ( ( rule__Activity__Alternatives_9_2 )* ) ;
    public final void rule__Activity__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2754:1: ( ( ( rule__Activity__Alternatives_9_2 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2755:1: ( ( rule__Activity__Alternatives_9_2 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2755:1: ( ( rule__Activity__Alternatives_9_2 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2756:1: ( rule__Activity__Alternatives_9_2 )*
            {
             before(grammarAccess.getActivityAccess().getAlternatives_9_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2757:1: ( rule__Activity__Alternatives_9_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=33)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2757:2: rule__Activity__Alternatives_9_2
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Alternatives_9_2_in_rule__Activity__Group_9__2__Impl5521);
            	    rule__Activity__Alternatives_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getAlternatives_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__2__Impl"


    // $ANTLR start "rule__Activity__Group_9__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2767:1: rule__Activity__Group_9__3 : rule__Activity__Group_9__3__Impl ;
    public final void rule__Activity__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2771:1: ( rule__Activity__Group_9__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2772:2: rule__Activity__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__3__Impl_in_rule__Activity__Group_9__35552);
            rule__Activity__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__3"


    // $ANTLR start "rule__Activity__Group_9__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2778:1: rule__Activity__Group_9__3__Impl : ( '}' ) ;
    public final void rule__Activity__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2782:1: ( ( '}' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2783:1: ( '}' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2783:1: ( '}' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2784:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,30,FOLLOW_30_in_rule__Activity__Group_9__3__Impl5580); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_9__3__Impl"


    // $ANTLR start "rule__Decision__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2805:1: rule__Decision__Group__0 : rule__Decision__Group__0__Impl rule__Decision__Group__1 ;
    public final void rule__Decision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2809:1: ( rule__Decision__Group__0__Impl rule__Decision__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2810:2: rule__Decision__Group__0__Impl rule__Decision__Group__1
            {
            pushFollow(FOLLOW_rule__Decision__Group__0__Impl_in_rule__Decision__Group__05619);
            rule__Decision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decision__Group__1_in_rule__Decision__Group__05622);
            rule__Decision__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Group__0"


    // $ANTLR start "rule__Decision__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2817:1: rule__Decision__Group__0__Impl : ( 'Decision' ) ;
    public final void rule__Decision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2821:1: ( ( 'Decision' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2822:1: ( 'Decision' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2822:1: ( 'Decision' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2823:1: 'Decision'
            {
             before(grammarAccess.getDecisionAccess().getDecisionKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Decision__Group__0__Impl5650); 
             after(grammarAccess.getDecisionAccess().getDecisionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Group__0__Impl"


    // $ANTLR start "rule__Decision__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2836:1: rule__Decision__Group__1 : rule__Decision__Group__1__Impl rule__Decision__Group__2 ;
    public final void rule__Decision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2840:1: ( rule__Decision__Group__1__Impl rule__Decision__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2841:2: rule__Decision__Group__1__Impl rule__Decision__Group__2
            {
            pushFollow(FOLLOW_rule__Decision__Group__1__Impl_in_rule__Decision__Group__15681);
            rule__Decision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decision__Group__2_in_rule__Decision__Group__15684);
            rule__Decision__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Group__1"


    // $ANTLR start "rule__Decision__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2848:1: rule__Decision__Group__1__Impl : ( ( rule__Decision__NameAssignment_1 ) ) ;
    public final void rule__Decision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2852:1: ( ( ( rule__Decision__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2853:1: ( ( rule__Decision__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2853:1: ( ( rule__Decision__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2854:1: ( rule__Decision__NameAssignment_1 )
            {
             before(grammarAccess.getDecisionAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2855:1: ( rule__Decision__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2855:2: rule__Decision__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Decision__NameAssignment_1_in_rule__Decision__Group__1__Impl5711);
            rule__Decision__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDecisionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Group__1__Impl"


    // $ANTLR start "rule__Decision__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2865:1: rule__Decision__Group__2 : rule__Decision__Group__2__Impl ;
    public final void rule__Decision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2869:1: ( rule__Decision__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2870:2: rule__Decision__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Decision__Group__2__Impl_in_rule__Decision__Group__25741);
            rule__Decision__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Group__2"


    // $ANTLR start "rule__Decision__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2876:1: rule__Decision__Group__2__Impl : ( ( rule__Decision__LabelAssignment_2 )? ) ;
    public final void rule__Decision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2880:1: ( ( ( rule__Decision__LabelAssignment_2 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2881:1: ( ( rule__Decision__LabelAssignment_2 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2881:1: ( ( rule__Decision__LabelAssignment_2 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2882:1: ( rule__Decision__LabelAssignment_2 )?
            {
             before(grammarAccess.getDecisionAccess().getLabelAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2883:1: ( rule__Decision__LabelAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2883:2: rule__Decision__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Decision__LabelAssignment_2_in_rule__Decision__Group__2__Impl5768);
                    rule__Decision__LabelAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecisionAccess().getLabelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2899:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2903:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2904:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__05805);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__1_in_rule__Step__Group__05808);
            rule__Step__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2911:1: rule__Step__Group__0__Impl : ( 'Step' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2915:1: ( ( 'Step' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2916:1: ( 'Step' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2916:1: ( 'Step' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2917:1: 'Step'
            {
             before(grammarAccess.getStepAccess().getStepKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Step__Group__0__Impl5836); 
             after(grammarAccess.getStepAccess().getStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2930:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2934:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2935:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__15867);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__2_in_rule__Step__Group__15870);
            rule__Step__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2942:1: rule__Step__Group__1__Impl : ( ( rule__Step__NameAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2946:1: ( ( ( rule__Step__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2947:1: ( ( rule__Step__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2947:1: ( ( rule__Step__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2948:1: ( rule__Step__NameAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2949:1: ( rule__Step__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2949:2: rule__Step__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Step__NameAssignment_1_in_rule__Step__Group__1__Impl5897);
            rule__Step__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2959:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2963:1: ( rule__Step__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2964:2: rule__Step__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__25927);
            rule__Step__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2970:1: rule__Step__Group__2__Impl : ( ( rule__Step__LabelAssignment_2 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2974:1: ( ( ( rule__Step__LabelAssignment_2 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2975:1: ( ( rule__Step__LabelAssignment_2 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2975:1: ( ( rule__Step__LabelAssignment_2 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2976:1: ( rule__Step__LabelAssignment_2 )?
            {
             before(grammarAccess.getStepAccess().getLabelAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2977:1: ( rule__Step__LabelAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2977:2: rule__Step__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Step__LabelAssignment_2_in_rule__Step__Group__2__Impl5954);
                    rule__Step__LabelAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getLabelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__InitialTransition__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2993:1: rule__InitialTransition__Group__0 : rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1 ;
    public final void rule__InitialTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2997:1: ( rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2998:2: rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__0__Impl_in_rule__InitialTransition__Group__05991);
            rule__InitialTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__1_in_rule__InitialTransition__Group__05994);
            rule__InitialTransition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__Group__0"


    // $ANTLR start "rule__InitialTransition__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3005:1: rule__InitialTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__InitialTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3009:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3010:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3010:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3011:1: 'Transition'
            {
             before(grammarAccess.getInitialTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__InitialTransition__Group__0__Impl6022); 
             after(grammarAccess.getInitialTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__Group__0__Impl"


    // $ANTLR start "rule__InitialTransition__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3024:1: rule__InitialTransition__Group__1 : rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2 ;
    public final void rule__InitialTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3028:1: ( rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3029:2: rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__1__Impl_in_rule__InitialTransition__Group__16053);
            rule__InitialTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__2_in_rule__InitialTransition__Group__16056);
            rule__InitialTransition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__Group__1"


    // $ANTLR start "rule__InitialTransition__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3036:1: rule__InitialTransition__Group__1__Impl : ( 'initial' ) ;
    public final void rule__InitialTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3040:1: ( ( 'initial' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3041:1: ( 'initial' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3041:1: ( 'initial' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3042:1: 'initial'
            {
             before(grammarAccess.getInitialTransitionAccess().getInitialKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__InitialTransition__Group__1__Impl6084); 
             after(grammarAccess.getInitialTransitionAccess().getInitialKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__Group__1__Impl"


    // $ANTLR start "rule__InitialTransition__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3055:1: rule__InitialTransition__Group__2 : rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3 ;
    public final void rule__InitialTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3059:1: ( rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3060:2: rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__2__Impl_in_rule__InitialTransition__Group__26115);
            rule__InitialTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__3_in_rule__InitialTransition__Group__26118);
            rule__InitialTransition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__Group__2"


    // $ANTLR start "rule__InitialTransition__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3067:1: rule__InitialTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__InitialTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3071:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3072:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3072:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3073:1: 'to'
            {
             before(grammarAccess.getInitialTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__InitialTransition__Group__2__Impl6146); 
             after(grammarAccess.getInitialTransitionAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__Group__2__Impl"


    // $ANTLR start "rule__InitialTransition__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3086:1: rule__InitialTransition__Group__3 : rule__InitialTransition__Group__3__Impl ;
    public final void rule__InitialTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3090:1: ( rule__InitialTransition__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3091:2: rule__InitialTransition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__3__Impl_in_rule__InitialTransition__Group__36177);
            rule__InitialTransition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__Group__3"


    // $ANTLR start "rule__InitialTransition__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3097:1: rule__InitialTransition__Group__3__Impl : ( ( rule__InitialTransition__ToAssignment_3 ) ) ;
    public final void rule__InitialTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3101:1: ( ( ( rule__InitialTransition__ToAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3102:1: ( ( rule__InitialTransition__ToAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3102:1: ( ( rule__InitialTransition__ToAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3103:1: ( rule__InitialTransition__ToAssignment_3 )
            {
             before(grammarAccess.getInitialTransitionAccess().getToAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3104:1: ( rule__InitialTransition__ToAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3104:2: rule__InitialTransition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__InitialTransition__ToAssignment_3_in_rule__InitialTransition__Group__3__Impl6204);
            rule__InitialTransition__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialTransitionAccess().getToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__Group__3__Impl"


    // $ANTLR start "rule__FinalTransition__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3122:1: rule__FinalTransition__Group__0 : rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1 ;
    public final void rule__FinalTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3126:1: ( rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3127:2: rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__0__Impl_in_rule__FinalTransition__Group__06242);
            rule__FinalTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__1_in_rule__FinalTransition__Group__06245);
            rule__FinalTransition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__Group__0"


    // $ANTLR start "rule__FinalTransition__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3134:1: rule__FinalTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__FinalTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3138:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3139:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3139:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3140:1: 'Transition'
            {
             before(grammarAccess.getFinalTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__FinalTransition__Group__0__Impl6273); 
             after(grammarAccess.getFinalTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__Group__0__Impl"


    // $ANTLR start "rule__FinalTransition__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3153:1: rule__FinalTransition__Group__1 : rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2 ;
    public final void rule__FinalTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3157:1: ( rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3158:2: rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__1__Impl_in_rule__FinalTransition__Group__16304);
            rule__FinalTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__2_in_rule__FinalTransition__Group__16307);
            rule__FinalTransition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__Group__1"


    // $ANTLR start "rule__FinalTransition__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3165:1: rule__FinalTransition__Group__1__Impl : ( ( rule__FinalTransition__FromAssignment_1 ) ) ;
    public final void rule__FinalTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3169:1: ( ( ( rule__FinalTransition__FromAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3170:1: ( ( rule__FinalTransition__FromAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3170:1: ( ( rule__FinalTransition__FromAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3171:1: ( rule__FinalTransition__FromAssignment_1 )
            {
             before(grammarAccess.getFinalTransitionAccess().getFromAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3172:1: ( rule__FinalTransition__FromAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3172:2: rule__FinalTransition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__FinalTransition__FromAssignment_1_in_rule__FinalTransition__Group__1__Impl6334);
            rule__FinalTransition__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalTransitionAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__Group__1__Impl"


    // $ANTLR start "rule__FinalTransition__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3182:1: rule__FinalTransition__Group__2 : rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3 ;
    public final void rule__FinalTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3186:1: ( rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3187:2: rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__2__Impl_in_rule__FinalTransition__Group__26364);
            rule__FinalTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__3_in_rule__FinalTransition__Group__26367);
            rule__FinalTransition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__Group__2"


    // $ANTLR start "rule__FinalTransition__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3194:1: rule__FinalTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__FinalTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3198:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3199:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3199:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3200:1: 'to'
            {
             before(grammarAccess.getFinalTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__FinalTransition__Group__2__Impl6395); 
             after(grammarAccess.getFinalTransitionAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__Group__2__Impl"


    // $ANTLR start "rule__FinalTransition__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3213:1: rule__FinalTransition__Group__3 : rule__FinalTransition__Group__3__Impl ;
    public final void rule__FinalTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3217:1: ( rule__FinalTransition__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3218:2: rule__FinalTransition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__3__Impl_in_rule__FinalTransition__Group__36426);
            rule__FinalTransition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__Group__3"


    // $ANTLR start "rule__FinalTransition__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3224:1: rule__FinalTransition__Group__3__Impl : ( 'final' ) ;
    public final void rule__FinalTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3228:1: ( ( 'final' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3229:1: ( 'final' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3229:1: ( 'final' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3230:1: 'final'
            {
             before(grammarAccess.getFinalTransitionAccess().getFinalKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__FinalTransition__Group__3__Impl6454); 
             after(grammarAccess.getFinalTransitionAccess().getFinalKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__Group__3__Impl"


    // $ANTLR start "rule__DecisionTransition__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3251:1: rule__DecisionTransition__Group__0 : rule__DecisionTransition__Group__0__Impl rule__DecisionTransition__Group__1 ;
    public final void rule__DecisionTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3255:1: ( rule__DecisionTransition__Group__0__Impl rule__DecisionTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3256:2: rule__DecisionTransition__Group__0__Impl rule__DecisionTransition__Group__1
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__0__Impl_in_rule__DecisionTransition__Group__06493);
            rule__DecisionTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__1_in_rule__DecisionTransition__Group__06496);
            rule__DecisionTransition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__Group__0"


    // $ANTLR start "rule__DecisionTransition__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3263:1: rule__DecisionTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__DecisionTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3267:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3268:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3268:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3269:1: 'Transition'
            {
             before(grammarAccess.getDecisionTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__DecisionTransition__Group__0__Impl6524); 
             after(grammarAccess.getDecisionTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__Group__0__Impl"


    // $ANTLR start "rule__DecisionTransition__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3282:1: rule__DecisionTransition__Group__1 : rule__DecisionTransition__Group__1__Impl rule__DecisionTransition__Group__2 ;
    public final void rule__DecisionTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3286:1: ( rule__DecisionTransition__Group__1__Impl rule__DecisionTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3287:2: rule__DecisionTransition__Group__1__Impl rule__DecisionTransition__Group__2
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__1__Impl_in_rule__DecisionTransition__Group__16555);
            rule__DecisionTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__2_in_rule__DecisionTransition__Group__16558);
            rule__DecisionTransition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__Group__1"


    // $ANTLR start "rule__DecisionTransition__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3294:1: rule__DecisionTransition__Group__1__Impl : ( ( rule__DecisionTransition__FromAssignment_1 ) ) ;
    public final void rule__DecisionTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3298:1: ( ( ( rule__DecisionTransition__FromAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3299:1: ( ( rule__DecisionTransition__FromAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3299:1: ( ( rule__DecisionTransition__FromAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3300:1: ( rule__DecisionTransition__FromAssignment_1 )
            {
             before(grammarAccess.getDecisionTransitionAccess().getFromAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3301:1: ( rule__DecisionTransition__FromAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3301:2: rule__DecisionTransition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__DecisionTransition__FromAssignment_1_in_rule__DecisionTransition__Group__1__Impl6585);
            rule__DecisionTransition__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDecisionTransitionAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__Group__1__Impl"


    // $ANTLR start "rule__DecisionTransition__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3311:1: rule__DecisionTransition__Group__2 : rule__DecisionTransition__Group__2__Impl rule__DecisionTransition__Group__3 ;
    public final void rule__DecisionTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3315:1: ( rule__DecisionTransition__Group__2__Impl rule__DecisionTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3316:2: rule__DecisionTransition__Group__2__Impl rule__DecisionTransition__Group__3
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__2__Impl_in_rule__DecisionTransition__Group__26615);
            rule__DecisionTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__3_in_rule__DecisionTransition__Group__26618);
            rule__DecisionTransition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__Group__2"


    // $ANTLR start "rule__DecisionTransition__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3323:1: rule__DecisionTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__DecisionTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3327:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3328:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3328:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3329:1: 'to'
            {
             before(grammarAccess.getDecisionTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__DecisionTransition__Group__2__Impl6646); 
             after(grammarAccess.getDecisionTransitionAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__Group__2__Impl"


    // $ANTLR start "rule__DecisionTransition__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3342:1: rule__DecisionTransition__Group__3 : rule__DecisionTransition__Group__3__Impl rule__DecisionTransition__Group__4 ;
    public final void rule__DecisionTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3346:1: ( rule__DecisionTransition__Group__3__Impl rule__DecisionTransition__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3347:2: rule__DecisionTransition__Group__3__Impl rule__DecisionTransition__Group__4
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__3__Impl_in_rule__DecisionTransition__Group__36677);
            rule__DecisionTransition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__4_in_rule__DecisionTransition__Group__36680);
            rule__DecisionTransition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__Group__3"


    // $ANTLR start "rule__DecisionTransition__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3354:1: rule__DecisionTransition__Group__3__Impl : ( ( rule__DecisionTransition__ToAssignment_3 ) ) ;
    public final void rule__DecisionTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3358:1: ( ( ( rule__DecisionTransition__ToAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3359:1: ( ( rule__DecisionTransition__ToAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3359:1: ( ( rule__DecisionTransition__ToAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3360:1: ( rule__DecisionTransition__ToAssignment_3 )
            {
             before(grammarAccess.getDecisionTransitionAccess().getToAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3361:1: ( rule__DecisionTransition__ToAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3361:2: rule__DecisionTransition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__DecisionTransition__ToAssignment_3_in_rule__DecisionTransition__Group__3__Impl6707);
            rule__DecisionTransition__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDecisionTransitionAccess().getToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__Group__3__Impl"


    // $ANTLR start "rule__DecisionTransition__Group__4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3371:1: rule__DecisionTransition__Group__4 : rule__DecisionTransition__Group__4__Impl ;
    public final void rule__DecisionTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3375:1: ( rule__DecisionTransition__Group__4__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3376:2: rule__DecisionTransition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__4__Impl_in_rule__DecisionTransition__Group__46737);
            rule__DecisionTransition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__Group__4"


    // $ANTLR start "rule__DecisionTransition__Group__4__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3382:1: rule__DecisionTransition__Group__4__Impl : ( ( rule__DecisionTransition__GuardAssignment_4 ) ) ;
    public final void rule__DecisionTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3386:1: ( ( ( rule__DecisionTransition__GuardAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3387:1: ( ( rule__DecisionTransition__GuardAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3387:1: ( ( rule__DecisionTransition__GuardAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3388:1: ( rule__DecisionTransition__GuardAssignment_4 )
            {
             before(grammarAccess.getDecisionTransitionAccess().getGuardAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3389:1: ( rule__DecisionTransition__GuardAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3389:2: rule__DecisionTransition__GuardAssignment_4
            {
            pushFollow(FOLLOW_rule__DecisionTransition__GuardAssignment_4_in_rule__DecisionTransition__Group__4__Impl6764);
            rule__DecisionTransition__GuardAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDecisionTransitionAccess().getGuardAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__Group__4__Impl"


    // $ANTLR start "rule__NonInitialTransition__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3409:1: rule__NonInitialTransition__Group__0 : rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1 ;
    public final void rule__NonInitialTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3413:1: ( rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3414:2: rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__0__Impl_in_rule__NonInitialTransition__Group__06804);
            rule__NonInitialTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__1_in_rule__NonInitialTransition__Group__06807);
            rule__NonInitialTransition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__Group__0"


    // $ANTLR start "rule__NonInitialTransition__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3421:1: rule__NonInitialTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__NonInitialTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3425:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3426:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3426:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3427:1: 'Transition'
            {
             before(grammarAccess.getNonInitialTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__NonInitialTransition__Group__0__Impl6835); 
             after(grammarAccess.getNonInitialTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__Group__0__Impl"


    // $ANTLR start "rule__NonInitialTransition__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3440:1: rule__NonInitialTransition__Group__1 : rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2 ;
    public final void rule__NonInitialTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3444:1: ( rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3445:2: rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__1__Impl_in_rule__NonInitialTransition__Group__16866);
            rule__NonInitialTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__2_in_rule__NonInitialTransition__Group__16869);
            rule__NonInitialTransition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__Group__1"


    // $ANTLR start "rule__NonInitialTransition__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3452:1: rule__NonInitialTransition__Group__1__Impl : ( ( rule__NonInitialTransition__FromAssignment_1 ) ) ;
    public final void rule__NonInitialTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3456:1: ( ( ( rule__NonInitialTransition__FromAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3457:1: ( ( rule__NonInitialTransition__FromAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3457:1: ( ( rule__NonInitialTransition__FromAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3458:1: ( rule__NonInitialTransition__FromAssignment_1 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3459:1: ( rule__NonInitialTransition__FromAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3459:2: rule__NonInitialTransition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__FromAssignment_1_in_rule__NonInitialTransition__Group__1__Impl6896);
            rule__NonInitialTransition__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonInitialTransitionAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__Group__1__Impl"


    // $ANTLR start "rule__NonInitialTransition__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3469:1: rule__NonInitialTransition__Group__2 : rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3 ;
    public final void rule__NonInitialTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3473:1: ( rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3474:2: rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__2__Impl_in_rule__NonInitialTransition__Group__26926);
            rule__NonInitialTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__3_in_rule__NonInitialTransition__Group__26929);
            rule__NonInitialTransition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__Group__2"


    // $ANTLR start "rule__NonInitialTransition__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3481:1: rule__NonInitialTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__NonInitialTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3485:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3486:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3486:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3487:1: 'to'
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__NonInitialTransition__Group__2__Impl6957); 
             after(grammarAccess.getNonInitialTransitionAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__Group__2__Impl"


    // $ANTLR start "rule__NonInitialTransition__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3500:1: rule__NonInitialTransition__Group__3 : rule__NonInitialTransition__Group__3__Impl ;
    public final void rule__NonInitialTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3504:1: ( rule__NonInitialTransition__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3505:2: rule__NonInitialTransition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__3__Impl_in_rule__NonInitialTransition__Group__36988);
            rule__NonInitialTransition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__Group__3"


    // $ANTLR start "rule__NonInitialTransition__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3511:1: rule__NonInitialTransition__Group__3__Impl : ( ( rule__NonInitialTransition__ToAssignment_3 ) ) ;
    public final void rule__NonInitialTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3515:1: ( ( ( rule__NonInitialTransition__ToAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3516:1: ( ( rule__NonInitialTransition__ToAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3516:1: ( ( rule__NonInitialTransition__ToAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3517:1: ( rule__NonInitialTransition__ToAssignment_3 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3518:1: ( rule__NonInitialTransition__ToAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3518:2: rule__NonInitialTransition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__ToAssignment_3_in_rule__NonInitialTransition__Group__3__Impl7015);
            rule__NonInitialTransition__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNonInitialTransitionAccess().getToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__Group__3__Impl"


    // $ANTLR start "rule__Textfield__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3536:1: rule__Textfield__Group__0 : rule__Textfield__Group__0__Impl rule__Textfield__Group__1 ;
    public final void rule__Textfield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3540:1: ( rule__Textfield__Group__0__Impl rule__Textfield__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3541:2: rule__Textfield__Group__0__Impl rule__Textfield__Group__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group__0__Impl_in_rule__Textfield__Group__07053);
            rule__Textfield__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__1_in_rule__Textfield__Group__07056);
            rule__Textfield__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__0"


    // $ANTLR start "rule__Textfield__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3548:1: rule__Textfield__Group__0__Impl : ( ( rule__Textfield__Group_0__0 )? ) ;
    public final void rule__Textfield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3552:1: ( ( ( rule__Textfield__Group_0__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3553:1: ( ( rule__Textfield__Group_0__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3553:1: ( ( rule__Textfield__Group_0__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3554:1: ( rule__Textfield__Group_0__0 )?
            {
             before(grammarAccess.getTextfieldAccess().getGroup_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3555:1: ( rule__Textfield__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3555:2: rule__Textfield__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Textfield__Group_0__0_in_rule__Textfield__Group__0__Impl7083);
                    rule__Textfield__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextfieldAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__0__Impl"


    // $ANTLR start "rule__Textfield__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3565:1: rule__Textfield__Group__1 : rule__Textfield__Group__1__Impl rule__Textfield__Group__2 ;
    public final void rule__Textfield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3569:1: ( rule__Textfield__Group__1__Impl rule__Textfield__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3570:2: rule__Textfield__Group__1__Impl rule__Textfield__Group__2
            {
            pushFollow(FOLLOW_rule__Textfield__Group__1__Impl_in_rule__Textfield__Group__17114);
            rule__Textfield__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__2_in_rule__Textfield__Group__17117);
            rule__Textfield__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__1"


    // $ANTLR start "rule__Textfield__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3577:1: rule__Textfield__Group__1__Impl : ( 'summary' ) ;
    public final void rule__Textfield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3581:1: ( ( 'summary' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3582:1: ( 'summary' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3582:1: ( 'summary' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3583:1: 'summary'
            {
             before(grammarAccess.getTextfieldAccess().getSummaryKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__Textfield__Group__1__Impl7145); 
             after(grammarAccess.getTextfieldAccess().getSummaryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__1__Impl"


    // $ANTLR start "rule__Textfield__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3596:1: rule__Textfield__Group__2 : rule__Textfield__Group__2__Impl rule__Textfield__Group__3 ;
    public final void rule__Textfield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3600:1: ( rule__Textfield__Group__2__Impl rule__Textfield__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3601:2: rule__Textfield__Group__2__Impl rule__Textfield__Group__3
            {
            pushFollow(FOLLOW_rule__Textfield__Group__2__Impl_in_rule__Textfield__Group__27176);
            rule__Textfield__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__3_in_rule__Textfield__Group__27179);
            rule__Textfield__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__2"


    // $ANTLR start "rule__Textfield__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3608:1: rule__Textfield__Group__2__Impl : ( ( rule__Textfield__SummaryAssignment_2 ) ) ;
    public final void rule__Textfield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3612:1: ( ( ( rule__Textfield__SummaryAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3613:1: ( ( rule__Textfield__SummaryAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3613:1: ( ( rule__Textfield__SummaryAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3614:1: ( rule__Textfield__SummaryAssignment_2 )
            {
             before(grammarAccess.getTextfieldAccess().getSummaryAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3615:1: ( rule__Textfield__SummaryAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3615:2: rule__Textfield__SummaryAssignment_2
            {
            pushFollow(FOLLOW_rule__Textfield__SummaryAssignment_2_in_rule__Textfield__Group__2__Impl7206);
            rule__Textfield__SummaryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldAccess().getSummaryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__2__Impl"


    // $ANTLR start "rule__Textfield__Group__3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3625:1: rule__Textfield__Group__3 : rule__Textfield__Group__3__Impl ;
    public final void rule__Textfield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3629:1: ( rule__Textfield__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3630:2: rule__Textfield__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group__3__Impl_in_rule__Textfield__Group__37236);
            rule__Textfield__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__3"


    // $ANTLR start "rule__Textfield__Group__3__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3636:1: rule__Textfield__Group__3__Impl : ( ( rule__Textfield__Group_3__0 )? ) ;
    public final void rule__Textfield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3640:1: ( ( ( rule__Textfield__Group_3__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3641:1: ( ( rule__Textfield__Group_3__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3641:1: ( ( rule__Textfield__Group_3__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3642:1: ( rule__Textfield__Group_3__0 )?
            {
             before(grammarAccess.getTextfieldAccess().getGroup_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3643:1: ( rule__Textfield__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3643:2: rule__Textfield__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Textfield__Group_3__0_in_rule__Textfield__Group__3__Impl7263);
                    rule__Textfield__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextfieldAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__3__Impl"


    // $ANTLR start "rule__Textfield__Group_0__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3661:1: rule__Textfield__Group_0__0 : rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1 ;
    public final void rule__Textfield__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3665:1: ( rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3666:2: rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group_0__0__Impl_in_rule__Textfield__Group_0__07302);
            rule__Textfield__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group_0__1_in_rule__Textfield__Group_0__07305);
            rule__Textfield__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group_0__0"


    // $ANTLR start "rule__Textfield__Group_0__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3673:1: rule__Textfield__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__Textfield__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3677:1: ( ( 'label' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3678:1: ( 'label' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3678:1: ( 'label' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3679:1: 'label'
            {
             before(grammarAccess.getTextfieldAccess().getLabelKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Textfield__Group_0__0__Impl7333); 
             after(grammarAccess.getTextfieldAccess().getLabelKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group_0__0__Impl"


    // $ANTLR start "rule__Textfield__Group_0__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3692:1: rule__Textfield__Group_0__1 : rule__Textfield__Group_0__1__Impl ;
    public final void rule__Textfield__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3696:1: ( rule__Textfield__Group_0__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3697:2: rule__Textfield__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group_0__1__Impl_in_rule__Textfield__Group_0__17364);
            rule__Textfield__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group_0__1"


    // $ANTLR start "rule__Textfield__Group_0__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3703:1: rule__Textfield__Group_0__1__Impl : ( ( rule__Textfield__LabelAssignment_0_1 ) ) ;
    public final void rule__Textfield__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3707:1: ( ( ( rule__Textfield__LabelAssignment_0_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3708:1: ( ( rule__Textfield__LabelAssignment_0_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3708:1: ( ( rule__Textfield__LabelAssignment_0_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3709:1: ( rule__Textfield__LabelAssignment_0_1 )
            {
             before(grammarAccess.getTextfieldAccess().getLabelAssignment_0_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3710:1: ( rule__Textfield__LabelAssignment_0_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3710:2: rule__Textfield__LabelAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Textfield__LabelAssignment_0_1_in_rule__Textfield__Group_0__1__Impl7391);
            rule__Textfield__LabelAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldAccess().getLabelAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group_0__1__Impl"


    // $ANTLR start "rule__Textfield__Group_3__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3724:1: rule__Textfield__Group_3__0 : rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1 ;
    public final void rule__Textfield__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3728:1: ( rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3729:2: rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group_3__0__Impl_in_rule__Textfield__Group_3__07425);
            rule__Textfield__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group_3__1_in_rule__Textfield__Group_3__07428);
            rule__Textfield__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group_3__0"


    // $ANTLR start "rule__Textfield__Group_3__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3736:1: rule__Textfield__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Textfield__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3740:1: ( ( 'description' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3741:1: ( 'description' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3741:1: ( 'description' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3742:1: 'description'
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionKeyword_3_0()); 
            match(input,39,FOLLOW_39_in_rule__Textfield__Group_3__0__Impl7456); 
             after(grammarAccess.getTextfieldAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group_3__0__Impl"


    // $ANTLR start "rule__Textfield__Group_3__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3755:1: rule__Textfield__Group_3__1 : rule__Textfield__Group_3__1__Impl ;
    public final void rule__Textfield__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3759:1: ( rule__Textfield__Group_3__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3760:2: rule__Textfield__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group_3__1__Impl_in_rule__Textfield__Group_3__17487);
            rule__Textfield__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group_3__1"


    // $ANTLR start "rule__Textfield__Group_3__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3766:1: rule__Textfield__Group_3__1__Impl : ( ( rule__Textfield__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Textfield__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3770:1: ( ( ( rule__Textfield__DescriptionAssignment_3_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3771:1: ( ( rule__Textfield__DescriptionAssignment_3_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3771:1: ( ( rule__Textfield__DescriptionAssignment_3_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3772:1: ( rule__Textfield__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionAssignment_3_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3773:1: ( rule__Textfield__DescriptionAssignment_3_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3773:2: rule__Textfield__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Textfield__DescriptionAssignment_3_1_in_rule__Textfield__Group_3__1__Impl7514);
            rule__Textfield__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group_3__1__Impl"


    // $ANTLR start "rule__Model__ActivitiesAssignment_0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3788:1: rule__Model__ActivitiesAssignment_0 : ( ruleActivity ) ;
    public final void rule__Model__ActivitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3792:1: ( ( ruleActivity ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3793:1: ( ruleActivity )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3793:1: ( ruleActivity )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3794:1: ruleActivity
            {
             before(grammarAccess.getModelAccess().getActivitiesActivityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleActivity_in_rule__Model__ActivitiesAssignment_07553);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getActivitiesActivityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ActivitiesAssignment_0"


    // $ANTLR start "rule__Model__RolesAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3803:1: rule__Model__RolesAssignment_1 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3807:1: ( ( ruleRole ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3808:1: ( ruleRole )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3808:1: ( ruleRole )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3809:1: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Model__RolesAssignment_17584);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RolesAssignment_1"


    // $ANTLR start "rule__Model__WorkProductsAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3818:1: rule__Model__WorkProductsAssignment_2 : ( ruleWorkProduct ) ;
    public final void rule__Model__WorkProductsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3822:1: ( ( ruleWorkProduct ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3823:1: ( ruleWorkProduct )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3823:1: ( ruleWorkProduct )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3824:1: ruleWorkProduct
            {
             before(grammarAccess.getModelAccess().getWorkProductsWorkProductParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWorkProduct_in_rule__Model__WorkProductsAssignment_27615);
            ruleWorkProduct();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWorkProductsWorkProductParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__WorkProductsAssignment_2"


    // $ANTLR start "rule__Model__WorkProductTypesAssignment_3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3833:1: rule__Model__WorkProductTypesAssignment_3 : ( ruleWorkProductType ) ;
    public final void rule__Model__WorkProductTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3837:1: ( ( ruleWorkProductType ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3838:1: ( ruleWorkProductType )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3838:1: ( ruleWorkProductType )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3839:1: ruleWorkProductType
            {
             before(grammarAccess.getModelAccess().getWorkProductTypesWorkProductTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWorkProductType_in_rule__Model__WorkProductTypesAssignment_37646);
            ruleWorkProductType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWorkProductTypesWorkProductTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__WorkProductTypesAssignment_3"


    // $ANTLR start "rule__Model__GuidancesAssignment_4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3848:1: rule__Model__GuidancesAssignment_4 : ( ruleGuidance ) ;
    public final void rule__Model__GuidancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3852:1: ( ( ruleGuidance ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3853:1: ( ruleGuidance )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3853:1: ( ruleGuidance )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3854:1: ruleGuidance
            {
             before(grammarAccess.getModelAccess().getGuidancesGuidanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleGuidance_in_rule__Model__GuidancesAssignment_47677);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGuidancesGuidanceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GuidancesAssignment_4"


    // $ANTLR start "rule__Model__GuidanceTypesAssignment_5"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3863:1: rule__Model__GuidanceTypesAssignment_5 : ( ruleGuidanceType ) ;
    public final void rule__Model__GuidanceTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3867:1: ( ( ruleGuidanceType ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3868:1: ( ruleGuidanceType )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3868:1: ( ruleGuidanceType )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3869:1: ruleGuidanceType
            {
             before(grammarAccess.getModelAccess().getGuidanceTypesGuidanceTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleGuidanceType_in_rule__Model__GuidanceTypesAssignment_57708);
            ruleGuidanceType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGuidanceTypesGuidanceTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GuidanceTypesAssignment_5"


    // $ANTLR start "rule__Model__StatesAssignment_6"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3878:1: rule__Model__StatesAssignment_6 : ( ruleState ) ;
    public final void rule__Model__StatesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3882:1: ( ( ruleState ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3883:1: ( ruleState )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3883:1: ( ruleState )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3884:1: ruleState
            {
             before(grammarAccess.getModelAccess().getStatesStateParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Model__StatesAssignment_67739);
            ruleState();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatesStateParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatesAssignment_6"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3893:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3897:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3898:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3898:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3899:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17770); 
             after(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_1"


    // $ANTLR start "rule__Role__TextfieldAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3908:1: rule__Role__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__Role__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3912:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3913:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3913:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3914:1: ruleTextfield
            {
             before(grammarAccess.getRoleAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Role__TextfieldAssignment_27801);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getTextfieldTextfieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__TextfieldAssignment_2"


    // $ANTLR start "rule__WorkProductType__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3923:1: rule__WorkProductType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkProductType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3927:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3928:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3928:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3929:1: RULE_ID
            {
             before(grammarAccess.getWorkProductTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProductType__NameAssignment_17832); 
             after(grammarAccess.getWorkProductTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProductType__NameAssignment_1"


    // $ANTLR start "rule__WorkProductType__TextfieldAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3938:1: rule__WorkProductType__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__WorkProductType__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3942:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3943:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3943:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3944:1: ruleTextfield
            {
             before(grammarAccess.getWorkProductTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__WorkProductType__TextfieldAssignment_27863);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getWorkProductTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProductType__TextfieldAssignment_2"


    // $ANTLR start "rule__WorkProduct__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3953:1: rule__WorkProduct__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkProduct__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3957:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3958:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3958:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3959:1: RULE_ID
            {
             before(grammarAccess.getWorkProductAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProduct__NameAssignment_17894); 
             after(grammarAccess.getWorkProductAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__NameAssignment_1"


    // $ANTLR start "rule__WorkProduct__TypeAssignment_3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3968:1: rule__WorkProduct__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkProduct__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3972:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3973:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3973:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3974:1: ( RULE_ID )
            {
             before(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3975:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3976:1: RULE_ID
            {
             before(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProduct__TypeAssignment_37929); 
             after(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__TypeAssignment_3"


    // $ANTLR start "rule__WorkProduct__TextfieldAssignment_4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3987:1: rule__WorkProduct__TextfieldAssignment_4 : ( ruleTextfield ) ;
    public final void rule__WorkProduct__TextfieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3991:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3992:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3992:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3993:1: ruleTextfield
            {
             before(grammarAccess.getWorkProductAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__WorkProduct__TextfieldAssignment_47964);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getWorkProductAccess().getTextfieldTextfieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkProduct__TextfieldAssignment_4"


    // $ANTLR start "rule__GuidanceType__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4002:1: rule__GuidanceType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GuidanceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4006:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4007:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4007:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4008:1: RULE_ID
            {
             before(grammarAccess.getGuidanceTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GuidanceType__NameAssignment_17995); 
             after(grammarAccess.getGuidanceTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceType__NameAssignment_1"


    // $ANTLR start "rule__GuidanceType__TextfieldAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4017:1: rule__GuidanceType__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__GuidanceType__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4021:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4022:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4022:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4023:1: ruleTextfield
            {
             before(grammarAccess.getGuidanceTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__GuidanceType__TextfieldAssignment_28026);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getGuidanceTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuidanceType__TextfieldAssignment_2"


    // $ANTLR start "rule__Guidance__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4032:1: rule__Guidance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Guidance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4036:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4037:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4037:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4038:1: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guidance__NameAssignment_18057); 
             after(grammarAccess.getGuidanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__NameAssignment_1"


    // $ANTLR start "rule__Guidance__TypeAssignment_3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4047:1: rule__Guidance__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4051:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4052:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4052:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4053:1: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4054:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4055:1: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guidance__TypeAssignment_38092); 
             after(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TypeAssignment_3"


    // $ANTLR start "rule__Guidance__TextfieldAssignment_4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4066:1: rule__Guidance__TextfieldAssignment_4 : ( ruleTextfield ) ;
    public final void rule__Guidance__TextfieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4070:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4071:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4071:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4072:1: ruleTextfield
            {
             before(grammarAccess.getGuidanceAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Guidance__TextfieldAssignment_48127);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getTextfieldTextfieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TextfieldAssignment_4"


    // $ANTLR start "rule__State__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4081:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4085:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4086:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4086:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4087:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_18158); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__Port__TypeAssignment_0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4096:1: rule__Port__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Port__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4100:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4101:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4101:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4102:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getTypeWorkProductCrossReference_0_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4103:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4104:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getTypeWorkProductIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__TypeAssignment_08193); 
             after(grammarAccess.getPortAccess().getTypeWorkProductIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPortAccess().getTypeWorkProductCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__TypeAssignment_0"


    // $ANTLR start "rule__Port__StateAssignment_1_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4115:1: rule__Port__StateAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Port__StateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4119:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4120:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4120:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4121:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getStateStateCrossReference_1_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4122:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4123:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getStateStateIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__StateAssignment_1_18232); 
             after(grammarAccess.getPortAccess().getStateStateIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getPortAccess().getStateStateCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__StateAssignment_1_1"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4134:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4138:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4139:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4139:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4140:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_18267); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Activity__TextfieldAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4149:1: rule__Activity__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__Activity__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4153:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4154:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4154:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4155:1: ruleTextfield
            {
             before(grammarAccess.getActivityAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Activity__TextfieldAssignment_28298);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getTextfieldTextfieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__TextfieldAssignment_2"


    // $ANTLR start "rule__Activity__RoleAssignment_4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4164:1: rule__Activity__RoleAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__RoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4168:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4169:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4169:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4170:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getRoleRoleCrossReference_4_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4171:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4172:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getRoleRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__RoleAssignment_48333); 
             after(grammarAccess.getActivityAccess().getRoleRoleIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getRoleRoleCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__RoleAssignment_4"


    // $ANTLR start "rule__Activity__InPortsAssignment_5_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4183:1: rule__Activity__InPortsAssignment_5_1 : ( rulePort ) ;
    public final void rule__Activity__InPortsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4187:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4188:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4188:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4189:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_18368);
            rulePort();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__InPortsAssignment_5_1"


    // $ANTLR start "rule__Activity__InPortsAssignment_5_2_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4198:1: rule__Activity__InPortsAssignment_5_2_1 : ( rulePort ) ;
    public final void rule__Activity__InPortsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4202:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4203:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4203:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4204:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_2_18399);
            rulePort();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__InPortsAssignment_5_2_1"


    // $ANTLR start "rule__Activity__OutPortsAssignment_6_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4213:1: rule__Activity__OutPortsAssignment_6_1 : ( rulePort ) ;
    public final void rule__Activity__OutPortsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4217:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4218:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4218:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4219:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_18430);
            rulePort();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__OutPortsAssignment_6_1"


    // $ANTLR start "rule__Activity__OutPortsAssignment_6_2_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4228:1: rule__Activity__OutPortsAssignment_6_2_1 : ( rulePort ) ;
    public final void rule__Activity__OutPortsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4232:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4233:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4233:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4234:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_2_18461);
            rulePort();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__OutPortsAssignment_6_2_1"


    // $ANTLR start "rule__Activity__SubActivitiesAssignment_7_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4243:1: rule__Activity__SubActivitiesAssignment_7_1 : ( ruleActivityRef ) ;
    public final void rule__Activity__SubActivitiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4247:1: ( ( ruleActivityRef ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4248:1: ( ruleActivityRef )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4248:1: ( ruleActivityRef )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4249:1: ruleActivityRef
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_18492);
            ruleActivityRef();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__SubActivitiesAssignment_7_1"


    // $ANTLR start "rule__Activity__SubActivitiesAssignment_7_2_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4258:1: rule__Activity__SubActivitiesAssignment_7_2_1 : ( ruleActivityRef ) ;
    public final void rule__Activity__SubActivitiesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4262:1: ( ( ruleActivityRef ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4263:1: ( ruleActivityRef )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4263:1: ( ruleActivityRef )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4264:1: ruleActivityRef
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_2_18523);
            ruleActivityRef();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__SubActivitiesAssignment_7_2_1"


    // $ANTLR start "rule__Activity__GuidancesAssignment_8_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4273:1: rule__Activity__GuidancesAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__GuidancesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4277:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4278:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4278:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4279:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4280:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4281:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_18558); 
             after(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__GuidancesAssignment_8_1"


    // $ANTLR start "rule__Activity__GuidancesAssignment_8_2_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4292:1: rule__Activity__GuidancesAssignment_8_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__GuidancesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4296:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4297:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4297:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4298:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_2_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4299:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4300:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_2_18597); 
             after(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_2_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__GuidancesAssignment_8_2_1"


    // $ANTLR start "rule__Activity__StepsAssignment_9_2_0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4311:1: rule__Activity__StepsAssignment_9_2_0 : ( ruleStep ) ;
    public final void rule__Activity__StepsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4315:1: ( ( ruleStep ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4316:1: ( ruleStep )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4316:1: ( ruleStep )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4317:1: ruleStep
            {
             before(grammarAccess.getActivityAccess().getStepsStepParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Activity__StepsAssignment_9_2_08632);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getStepsStepParserRuleCall_9_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__StepsAssignment_9_2_0"


    // $ANTLR start "rule__Activity__DecisionsAssignment_9_2_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4326:1: rule__Activity__DecisionsAssignment_9_2_1 : ( ruleDecision ) ;
    public final void rule__Activity__DecisionsAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4330:1: ( ( ruleDecision ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4331:1: ( ruleDecision )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4331:1: ( ruleDecision )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4332:1: ruleDecision
            {
             before(grammarAccess.getActivityAccess().getDecisionsDecisionParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_ruleDecision_in_rule__Activity__DecisionsAssignment_9_2_18663);
            ruleDecision();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getDecisionsDecisionParserRuleCall_9_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__DecisionsAssignment_9_2_1"


    // $ANTLR start "rule__Activity__TransitionsAssignment_9_2_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4341:1: rule__Activity__TransitionsAssignment_9_2_2 : ( ruleTransition ) ;
    public final void rule__Activity__TransitionsAssignment_9_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4345:1: ( ( ruleTransition ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4346:1: ( ruleTransition )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4346:1: ( ruleTransition )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4347:1: ruleTransition
            {
             before(grammarAccess.getActivityAccess().getTransitionsTransitionParserRuleCall_9_2_2_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__Activity__TransitionsAssignment_9_2_28694);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getTransitionsTransitionParserRuleCall_9_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__TransitionsAssignment_9_2_2"


    // $ANTLR start "rule__ActivityRef__TypeAssignment"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4356:1: rule__ActivityRef__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ActivityRef__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4360:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4361:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4361:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4362:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityRefAccess().getTypeActivityCrossReference_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4363:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4364:1: RULE_ID
            {
             before(grammarAccess.getActivityRefAccess().getTypeActivityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityRef__TypeAssignment8729); 
             after(grammarAccess.getActivityRefAccess().getTypeActivityIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getActivityRefAccess().getTypeActivityCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityRef__TypeAssignment"


    // $ANTLR start "rule__Decision__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4375:1: rule__Decision__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decision__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4379:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4380:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4380:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4381:1: RULE_ID
            {
             before(grammarAccess.getDecisionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decision__NameAssignment_18764); 
             after(grammarAccess.getDecisionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__NameAssignment_1"


    // $ANTLR start "rule__Decision__LabelAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4390:1: rule__Decision__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Decision__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4394:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4395:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4395:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4396:1: RULE_STRING
            {
             before(grammarAccess.getDecisionAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Decision__LabelAssignment_28795); 
             after(grammarAccess.getDecisionAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__LabelAssignment_2"


    // $ANTLR start "rule__Step__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4405:1: rule__Step__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Step__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4409:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4410:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4410:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4411:1: RULE_ID
            {
             before(grammarAccess.getStepAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Step__NameAssignment_18826); 
             after(grammarAccess.getStepAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__NameAssignment_1"


    // $ANTLR start "rule__Step__LabelAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4420:1: rule__Step__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Step__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4424:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4425:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4425:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4426:1: RULE_STRING
            {
             before(grammarAccess.getStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Step__LabelAssignment_28857); 
             after(grammarAccess.getStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__LabelAssignment_2"


    // $ANTLR start "rule__InitialTransition__ToAssignment_3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4435:1: rule__InitialTransition__ToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InitialTransition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4439:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4440:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4440:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4441:1: ( RULE_ID )
            {
             before(grammarAccess.getInitialTransitionAccess().getToNodeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4442:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4443:1: RULE_ID
            {
             before(grammarAccess.getInitialTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InitialTransition__ToAssignment_38892); 
             after(grammarAccess.getInitialTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInitialTransitionAccess().getToNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__ToAssignment_3"


    // $ANTLR start "rule__FinalTransition__FromAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4454:1: rule__FinalTransition__FromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FinalTransition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4458:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4459:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4459:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4460:1: ( RULE_ID )
            {
             before(grammarAccess.getFinalTransitionAccess().getFromNodeCrossReference_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4461:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4462:1: RULE_ID
            {
             before(grammarAccess.getFinalTransitionAccess().getFromNodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FinalTransition__FromAssignment_18931); 
             after(grammarAccess.getFinalTransitionAccess().getFromNodeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFinalTransitionAccess().getFromNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__FromAssignment_1"


    // $ANTLR start "rule__DecisionTransition__FromAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4473:1: rule__DecisionTransition__FromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DecisionTransition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4477:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4478:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4478:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4479:1: ( RULE_ID )
            {
             before(grammarAccess.getDecisionTransitionAccess().getFromDecisionCrossReference_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4480:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4481:1: RULE_ID
            {
             before(grammarAccess.getDecisionTransitionAccess().getFromDecisionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DecisionTransition__FromAssignment_18970); 
             after(grammarAccess.getDecisionTransitionAccess().getFromDecisionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDecisionTransitionAccess().getFromDecisionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__FromAssignment_1"


    // $ANTLR start "rule__DecisionTransition__ToAssignment_3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4492:1: rule__DecisionTransition__ToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DecisionTransition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4496:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4497:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4497:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4498:1: ( RULE_ID )
            {
             before(grammarAccess.getDecisionTransitionAccess().getToNodeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4499:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4500:1: RULE_ID
            {
             before(grammarAccess.getDecisionTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DecisionTransition__ToAssignment_39009); 
             after(grammarAccess.getDecisionTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDecisionTransitionAccess().getToNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__ToAssignment_3"


    // $ANTLR start "rule__DecisionTransition__GuardAssignment_4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4511:1: rule__DecisionTransition__GuardAssignment_4 : ( RULE_STRING ) ;
    public final void rule__DecisionTransition__GuardAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4515:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4516:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4516:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4517:1: RULE_STRING
            {
             before(grammarAccess.getDecisionTransitionAccess().getGuardSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecisionTransition__GuardAssignment_49044); 
             after(grammarAccess.getDecisionTransitionAccess().getGuardSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTransition__GuardAssignment_4"


    // $ANTLR start "rule__NonInitialTransition__FromAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4526:1: rule__NonInitialTransition__FromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NonInitialTransition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4530:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4531:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4531:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4532:1: ( RULE_ID )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromNodeCrossReference_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4533:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4534:1: RULE_ID
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromNodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonInitialTransition__FromAssignment_19079); 
             after(grammarAccess.getNonInitialTransitionAccess().getFromNodeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNonInitialTransitionAccess().getFromNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__FromAssignment_1"


    // $ANTLR start "rule__NonInitialTransition__ToAssignment_3"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4545:1: rule__NonInitialTransition__ToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__NonInitialTransition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4549:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4550:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4550:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4551:1: ( RULE_ID )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToNodeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4552:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4553:1: RULE_ID
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonInitialTransition__ToAssignment_39118); 
             after(grammarAccess.getNonInitialTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNonInitialTransitionAccess().getToNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__ToAssignment_3"


    // $ANTLR start "rule__Textfield__LabelAssignment_0_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4564:1: rule__Textfield__LabelAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Textfield__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4568:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4569:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4569:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4570:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getLabelSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__LabelAssignment_0_19153); 
             after(grammarAccess.getTextfieldAccess().getLabelSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__LabelAssignment_0_1"


    // $ANTLR start "rule__Textfield__SummaryAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4579:1: rule__Textfield__SummaryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Textfield__SummaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4583:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4584:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4584:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4585:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getSummarySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__SummaryAssignment_29184); 
             after(grammarAccess.getTextfieldAccess().getSummarySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__SummaryAssignment_2"


    // $ANTLR start "rule__Textfield__DescriptionAssignment_3_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4594:1: rule__Textfield__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Textfield__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4598:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4599:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4599:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4600:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__DescriptionAssignment_3_19215); 
             after(grammarAccess.getTextfieldAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__DescriptionAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000276802L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_entryRuleWorkProductType184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkProductType191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__0_in_ruleWorkProductType217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_entryRuleWorkProduct244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkProduct251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__0_in_ruleWorkProduct277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_entryRuleGuidanceType304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidanceType311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__0_in_ruleGuidanceType337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidance371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__0_in_ruleGuidance397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_entryRuleActivityRef604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityRef611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__TypeAssignment_in_ruleActivityRef637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecision_in_entryRuleDecision666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecision673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__0_in_ruleDecision699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0_in_ruleStep759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_in_ruleTransition819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialTransition853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__0_in_ruleInitialTransition879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinalTransition913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__0_in_ruleFinalTransition939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecisionTransition_in_entryRuleDecisionTransition966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecisionTransition973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__0_in_ruleDecisionTransition999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonInitialTransition1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__0_in_ruleNonInitialTransition1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_entryRuleTextfield1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfield1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__0_in_ruleTextfield1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ActivitiesAssignment_0_in_rule__Model__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RolesAssignment_1_in_rule__Model__Alternatives1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorkProductsAssignment_2_in_rule__Model__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorkProductTypesAssignment_3_in_rule__Model__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GuidancesAssignment_4_in_rule__Model__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GuidanceTypesAssignment_5_in_rule__Model__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatesAssignment_6_in_rule__Model__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__StepsAssignment_9_2_0_in_rule__Activity__Alternatives_9_21297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DecisionsAssignment_9_2_1_in_rule__Activity__Alternatives_9_21315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__TransitionsAssignment_9_2_2_in_rule__Activity__Alternatives_9_21333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_rule__Transition__Alternatives1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_rule__Transition__Alternatives1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_rule__Transition__Alternatives1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecisionTransition_in_rule__Transition__Alternatives1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__01448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__01451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Role__Group__0__Impl1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__11510 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__11513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__21570 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__21573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__TextfieldAssignment_2_in_rule__Role__Group__2__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__31630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Role__Group__3__Impl1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__0__Impl_in_rule__WorkProductType__Group__01697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__1_in_rule__WorkProductType__Group__01700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WorkProductType__Group__0__Impl1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__1__Impl_in_rule__WorkProductType__Group__11759 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__2_in_rule__WorkProductType__Group__11762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__NameAssignment_1_in_rule__WorkProductType__Group__1__Impl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__2__Impl_in_rule__WorkProductType__Group__21819 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__3_in_rule__WorkProductType__Group__21822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__TextfieldAssignment_2_in_rule__WorkProductType__Group__2__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__3__Impl_in_rule__WorkProductType__Group__31879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkProductType__Group__3__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__0__Impl_in_rule__WorkProduct__Group__01946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__1_in_rule__WorkProduct__Group__01949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WorkProduct__Group__0__Impl1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__1__Impl_in_rule__WorkProduct__Group__12008 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__2_in_rule__WorkProduct__Group__12011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__NameAssignment_1_in_rule__WorkProduct__Group__1__Impl2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__2__Impl_in_rule__WorkProduct__Group__22068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__3_in_rule__WorkProduct__Group__22071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WorkProduct__Group__2__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__3__Impl_in_rule__WorkProduct__Group__32130 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__4_in_rule__WorkProduct__Group__32133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__TypeAssignment_3_in_rule__WorkProduct__Group__3__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__4__Impl_in_rule__WorkProduct__Group__42190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__5_in_rule__WorkProduct__Group__42193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__TextfieldAssignment_4_in_rule__WorkProduct__Group__4__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__5__Impl_in_rule__WorkProduct__Group__52250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkProduct__Group__5__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__0__Impl_in_rule__GuidanceType__Group__02321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__1_in_rule__GuidanceType__Group__02324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GuidanceType__Group__0__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__1__Impl_in_rule__GuidanceType__Group__12383 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__2_in_rule__GuidanceType__Group__12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__NameAssignment_1_in_rule__GuidanceType__Group__1__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__2__Impl_in_rule__GuidanceType__Group__22443 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__3_in_rule__GuidanceType__Group__22446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__TextfieldAssignment_2_in_rule__GuidanceType__Group__2__Impl2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__3__Impl_in_rule__GuidanceType__Group__32503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GuidanceType__Group__3__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Guidance__Group__0__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__12632 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__12635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__NameAssignment_1_in_rule__Guidance__Group__1__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__22692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guidance__Group__3_in_rule__Guidance__Group__22695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Guidance__Group__2__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__3__Impl_in_rule__Guidance__Group__32754 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__4_in_rule__Guidance__Group__32757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TypeAssignment_3_in_rule__Guidance__Group__3__Impl2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__4__Impl_in_rule__Guidance__Group__42814 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__5_in_rule__Guidance__Group__42817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TextfieldAssignment_4_in_rule__Guidance__Group__4__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__5__Impl_in_rule__Guidance__Group__52874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Guidance__Group__5__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__02948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__Group__0__Impl2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13007 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__State__Group__2__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03132 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__TypeAssignment_0_in_rule__Port__Group__0__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__0_in_rule__Port__Group__1__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__0__Impl_in_rule__Port__Group_1__03254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group_1__1_in_rule__Port__Group_1__03257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Port__Group_1__0__Impl3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__1__Impl_in_rule__Port__Group_1__13316 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Port__Group_1__2_in_rule__Port__Group_1__13319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__StateAssignment_1_1_in_rule__Port__Group_1__1__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__2__Impl_in_rule__Port__Group_1__23376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Port__Group_1__2__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group__0__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13503 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23563 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__TextfieldAssignment_2_in_rule__Activity__Group__2__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Activity__Group__3__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43685 = new BitSet(new long[]{0x000000001E801000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__RoleAssignment_4_in_rule__Activity__Group__4__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__53745 = new BitSet(new long[]{0x000000001E801000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__53748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63806 = new BitSet(new long[]{0x000000001E801000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73867 = new BitSet(new long[]{0x000000001E801000L});
    public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__73870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__83928 = new BitSet(new long[]{0x000000001E801000L});
    public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__83931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__93989 = new BitSet(new long[]{0x000000001E801000L});
    public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__93992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__104050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Activity__Group__10__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__04131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__04134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Activity__Group_5__0__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__14193 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__14196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InPortsAssignment_5_1_in_rule__Activity__Group_5__1__Impl4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__24253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__Group_5__2__Impl4280 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__04317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__04320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group_5_2__0__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InPortsAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__04440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__04443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Activity__Group_6__0__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__14502 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__14505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OutPortsAssignment_6_1_in_rule__Activity__Group_6__1__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__24562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__Group_6__2__Impl4589 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__04626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__04629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group_6_2__0__Impl4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__14688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OutPortsAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__04749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__04752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group_7__0__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__14811 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__2_in_rule__Activity__Group_7__14814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SubActivitiesAssignment_7_1_in_rule__Activity__Group_7__1__Impl4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__2__Impl_in_rule__Activity__Group_7__24871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__Group_7__2__Impl4898 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__04935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__04938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group_7_2__0__Impl4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__14997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SubActivitiesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__05058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__05061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group_8__0__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__15120 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__15123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__GuidancesAssignment_8_1_in_rule__Activity__Group_8__1__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__25180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__0_in_rule__Activity__Group_8__2__Impl5207 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__0__Impl_in_rule__Activity__Group_8_2__05244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__1_in_rule__Activity__Group_8_2__05247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group_8_2__0__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__1__Impl_in_rule__Activity__Group_8_2__15306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__GuidancesAssignment_8_2_1_in_rule__Activity__Group_8_2__1__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__05367 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__05370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Activity__Group_9__0__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__15429 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__15432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Activity__Group_9__1__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__25491 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__3_in_rule__Activity__Group_9__25494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_9_2_in_rule__Activity__Group_9__2__Impl5521 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__3__Impl_in_rule__Activity__Group_9__35552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Activity__Group_9__3__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__0__Impl_in_rule__Decision__Group__05619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decision__Group__1_in_rule__Decision__Group__05622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Decision__Group__0__Impl5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__1__Impl_in_rule__Decision__Group__15681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Decision__Group__2_in_rule__Decision__Group__15684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__NameAssignment_1_in_rule__Decision__Group__1__Impl5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__2__Impl_in_rule__Decision__Group__25741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__LabelAssignment_2_in_rule__Decision__Group__2__Impl5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__05805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Step__Group__1_in_rule__Step__Group__05808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Step__Group__0__Impl5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__15867 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Step__Group__2_in_rule__Step__Group__15870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__NameAssignment_1_in_rule__Step__Group__1__Impl5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__25927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__LabelAssignment_2_in_rule__Step__Group__2__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__0__Impl_in_rule__InitialTransition__Group__05991 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__1_in_rule__InitialTransition__Group__05994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InitialTransition__Group__0__Impl6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__1__Impl_in_rule__InitialTransition__Group__16053 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__2_in_rule__InitialTransition__Group__16056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InitialTransition__Group__1__Impl6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__2__Impl_in_rule__InitialTransition__Group__26115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__3_in_rule__InitialTransition__Group__26118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InitialTransition__Group__2__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__3__Impl_in_rule__InitialTransition__Group__36177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__ToAssignment_3_in_rule__InitialTransition__Group__3__Impl6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__0__Impl_in_rule__FinalTransition__Group__06242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__1_in_rule__FinalTransition__Group__06245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FinalTransition__Group__0__Impl6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__1__Impl_in_rule__FinalTransition__Group__16304 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__2_in_rule__FinalTransition__Group__16307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__FromAssignment_1_in_rule__FinalTransition__Group__1__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__2__Impl_in_rule__FinalTransition__Group__26364 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__3_in_rule__FinalTransition__Group__26367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FinalTransition__Group__2__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__3__Impl_in_rule__FinalTransition__Group__36426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FinalTransition__Group__3__Impl6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__0__Impl_in_rule__DecisionTransition__Group__06493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__1_in_rule__DecisionTransition__Group__06496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DecisionTransition__Group__0__Impl6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__1__Impl_in_rule__DecisionTransition__Group__16555 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__2_in_rule__DecisionTransition__Group__16558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__FromAssignment_1_in_rule__DecisionTransition__Group__1__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__2__Impl_in_rule__DecisionTransition__Group__26615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__3_in_rule__DecisionTransition__Group__26618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DecisionTransition__Group__2__Impl6646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__3__Impl_in_rule__DecisionTransition__Group__36677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__4_in_rule__DecisionTransition__Group__36680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__ToAssignment_3_in_rule__DecisionTransition__Group__3__Impl6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__4__Impl_in_rule__DecisionTransition__Group__46737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__GuardAssignment_4_in_rule__DecisionTransition__Group__4__Impl6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__0__Impl_in_rule__NonInitialTransition__Group__06804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__1_in_rule__NonInitialTransition__Group__06807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NonInitialTransition__Group__0__Impl6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__1__Impl_in_rule__NonInitialTransition__Group__16866 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__2_in_rule__NonInitialTransition__Group__16869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__FromAssignment_1_in_rule__NonInitialTransition__Group__1__Impl6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__2__Impl_in_rule__NonInitialTransition__Group__26926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__3_in_rule__NonInitialTransition__Group__26929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NonInitialTransition__Group__2__Impl6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__3__Impl_in_rule__NonInitialTransition__Group__36988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__ToAssignment_3_in_rule__NonInitialTransition__Group__3__Impl7015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__0__Impl_in_rule__Textfield__Group__07053 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Textfield__Group__1_in_rule__Textfield__Group__07056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__0_in_rule__Textfield__Group__0__Impl7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__1__Impl_in_rule__Textfield__Group__17114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group__2_in_rule__Textfield__Group__17117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Textfield__Group__1__Impl7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__2__Impl_in_rule__Textfield__Group__27176 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Textfield__Group__3_in_rule__Textfield__Group__27179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__SummaryAssignment_2_in_rule__Textfield__Group__2__Impl7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__3__Impl_in_rule__Textfield__Group__37236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__0_in_rule__Textfield__Group__3__Impl7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__0__Impl_in_rule__Textfield__Group_0__07302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__1_in_rule__Textfield__Group_0__07305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Textfield__Group_0__0__Impl7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__1__Impl_in_rule__Textfield__Group_0__17364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__LabelAssignment_0_1_in_rule__Textfield__Group_0__1__Impl7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__0__Impl_in_rule__Textfield__Group_3__07425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__1_in_rule__Textfield__Group_3__07428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Textfield__Group_3__0__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__1__Impl_in_rule__Textfield__Group_3__17487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__DescriptionAssignment_3_1_in_rule__Textfield__Group_3__1__Impl7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Model__ActivitiesAssignment_07553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Model__RolesAssignment_17584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_rule__Model__WorkProductsAssignment_27615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_rule__Model__WorkProductTypesAssignment_37646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_rule__Model__GuidancesAssignment_47677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_rule__Model__GuidanceTypesAssignment_57708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Model__StatesAssignment_67739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Role__TextfieldAssignment_27801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProductType__NameAssignment_17832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__WorkProductType__TextfieldAssignment_27863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProduct__NameAssignment_17894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProduct__TypeAssignment_37929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__WorkProduct__TextfieldAssignment_47964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GuidanceType__NameAssignment_17995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__GuidanceType__TextfieldAssignment_28026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guidance__NameAssignment_18057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guidance__TypeAssignment_38092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Guidance__TextfieldAssignment_48127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_18158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__TypeAssignment_08193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__StateAssignment_1_18232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_18267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Activity__TextfieldAssignment_28298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__RoleAssignment_48333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_18368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_2_18399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_18430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_2_18461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_18492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_2_18523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_18558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_2_18597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Activity__StepsAssignment_9_2_08632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecision_in_rule__Activity__DecisionsAssignment_9_2_18663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Activity__TransitionsAssignment_9_2_28694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityRef__TypeAssignment8729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decision__NameAssignment_18764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Decision__LabelAssignment_28795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Step__NameAssignment_18826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Step__LabelAssignment_28857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InitialTransition__ToAssignment_38892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FinalTransition__FromAssignment_18931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DecisionTransition__FromAssignment_18970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DecisionTransition__ToAssignment_39009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecisionTransition__GuardAssignment_49044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonInitialTransition__FromAssignment_19079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonInitialTransition__ToAssignment_39118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__LabelAssignment_0_19153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__SummaryAssignment_29184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__DescriptionAssignment_3_19215 = new BitSet(new long[]{0x0000000000000002L});

}