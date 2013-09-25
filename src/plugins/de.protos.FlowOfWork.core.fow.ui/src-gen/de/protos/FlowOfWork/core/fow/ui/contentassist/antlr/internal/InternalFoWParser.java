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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Role'", "';'", "'WorkProductType'", "'WorkProduct'", "':'", "'states'", "','", "'GuidanceType'", "'Guidance'", "'('", "')'", "'Activity'", "'responsible'", "'inputs'", "'outputs'", "'subActivities'", "'guidances'", "'Behavior'", "'{'", "'}'", "'Decision'", "'Step'", "'Transition'", "'initial'", "'to'", "'final'", "'summary'", "'label'", "'description'"
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

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||(LA1_0>=18 && LA1_0<=19)||LA1_0==22) ) {
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:239:1: ruleState : ( ( rule__State__NameAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:243:2: ( ( ( rule__State__NameAssignment ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:244:1: ( ( rule__State__NameAssignment ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:244:1: ( ( rule__State__NameAssignment ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:245:1: ( rule__State__NameAssignment )
            {
             before(grammarAccess.getStateAccess().getNameAssignment()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:246:1: ( rule__State__NameAssignment )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:246:2: rule__State__NameAssignment
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_in_ruleState457);
            rule__State__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment()); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:568:1: rule__Model__Alternatives : ( ( ( rule__Model__ActivitiesAssignment_0 ) ) | ( ( rule__Model__RolesAssignment_1 ) ) | ( ( rule__Model__WorkProductsAssignment_2 ) ) | ( ( rule__Model__WorkProductTypesAssignment_3 ) ) | ( ( rule__Model__GuidancesAssignment_4 ) ) | ( ( rule__Model__GuidanceTypesAssignment_5 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:572:1: ( ( ( rule__Model__ActivitiesAssignment_0 ) ) | ( ( rule__Model__RolesAssignment_1 ) ) | ( ( rule__Model__WorkProductsAssignment_2 ) ) | ( ( rule__Model__WorkProductTypesAssignment_3 ) ) | ( ( rule__Model__GuidancesAssignment_4 ) ) | ( ( rule__Model__GuidanceTypesAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 22:
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
            case 19:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
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

            }
        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:615:1: rule__Activity__Alternatives_9_2 : ( ( ( rule__Activity__StepsAssignment_9_2_0 ) ) | ( ( rule__Activity__DecisionsAssignment_9_2_1 ) ) | ( ( rule__Activity__TransitionsAssignment_9_2_2 ) ) );
    public final void rule__Activity__Alternatives_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:619:1: ( ( ( rule__Activity__StepsAssignment_9_2_0 ) ) | ( ( rule__Activity__DecisionsAssignment_9_2_1 ) ) | ( ( rule__Activity__TransitionsAssignment_9_2_2 ) ) )
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
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:620:1: ( ( rule__Activity__StepsAssignment_9_2_0 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:620:1: ( ( rule__Activity__StepsAssignment_9_2_0 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:621:1: ( rule__Activity__StepsAssignment_9_2_0 )
                    {
                     before(grammarAccess.getActivityAccess().getStepsAssignment_9_2_0()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:622:1: ( rule__Activity__StepsAssignment_9_2_0 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:622:2: rule__Activity__StepsAssignment_9_2_0
                    {
                    pushFollow(FOLLOW_rule__Activity__StepsAssignment_9_2_0_in_rule__Activity__Alternatives_9_21279);
                    rule__Activity__StepsAssignment_9_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getStepsAssignment_9_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:626:6: ( ( rule__Activity__DecisionsAssignment_9_2_1 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:626:6: ( ( rule__Activity__DecisionsAssignment_9_2_1 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:627:1: ( rule__Activity__DecisionsAssignment_9_2_1 )
                    {
                     before(grammarAccess.getActivityAccess().getDecisionsAssignment_9_2_1()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:628:1: ( rule__Activity__DecisionsAssignment_9_2_1 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:628:2: rule__Activity__DecisionsAssignment_9_2_1
                    {
                    pushFollow(FOLLOW_rule__Activity__DecisionsAssignment_9_2_1_in_rule__Activity__Alternatives_9_21297);
                    rule__Activity__DecisionsAssignment_9_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getDecisionsAssignment_9_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:632:6: ( ( rule__Activity__TransitionsAssignment_9_2_2 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:632:6: ( ( rule__Activity__TransitionsAssignment_9_2_2 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:633:1: ( rule__Activity__TransitionsAssignment_9_2_2 )
                    {
                     before(grammarAccess.getActivityAccess().getTransitionsAssignment_9_2_2()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:634:1: ( rule__Activity__TransitionsAssignment_9_2_2 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:634:2: rule__Activity__TransitionsAssignment_9_2_2
                    {
                    pushFollow(FOLLOW_rule__Activity__TransitionsAssignment_9_2_2_in_rule__Activity__Alternatives_9_21315);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:644:1: rule__Transition__Alternatives : ( ( ruleInitialTransition ) | ( ruleFinalTransition ) | ( ruleNonInitialTransition ) | ( ruleDecisionTransition ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:648:1: ( ( ruleInitialTransition ) | ( ruleFinalTransition ) | ( ruleNonInitialTransition ) | ( ruleDecisionTransition ) )
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

                            if ( (LA4_5==RULE_STRING) ) {
                                alt4=4;
                            }
                            else if ( (LA4_5==EOF||(LA4_5>=30 && LA4_5<=33)) ) {
                                alt4=3;
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
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:649:1: ( ruleInitialTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:649:1: ( ruleInitialTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:650:1: ruleInitialTransition
                    {
                     before(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInitialTransition_in_rule__Transition__Alternatives1349);
                    ruleInitialTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:655:6: ( ruleFinalTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:655:6: ( ruleFinalTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:656:1: ruleFinalTransition
                    {
                     before(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFinalTransition_in_rule__Transition__Alternatives1366);
                    ruleFinalTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:661:6: ( ruleNonInitialTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:661:6: ( ruleNonInitialTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:662:1: ruleNonInitialTransition
                    {
                     before(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNonInitialTransition_in_rule__Transition__Alternatives1383);
                    ruleNonInitialTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:667:6: ( ruleDecisionTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:667:6: ( ruleDecisionTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:668:1: ruleDecisionTransition
                    {
                     before(grammarAccess.getTransitionAccess().getDecisionTransitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDecisionTransition_in_rule__Transition__Alternatives1400);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:680:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:684:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:685:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__01430);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__01433);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:692:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:696:1: ( ( 'Role' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:697:1: ( 'Role' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:697:1: ( 'Role' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:698:1: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Role__Group__0__Impl1461); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:711:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:715:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:716:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__11492);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__11495);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:723:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:727:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:728:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:728:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:729:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:730:1: ( rule__Role__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:730:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl1522);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:740:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:744:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:745:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__21552);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__21555);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:752:1: rule__Role__Group__2__Impl : ( ( rule__Role__TextfieldAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:756:1: ( ( ( rule__Role__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:757:1: ( ( rule__Role__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:757:1: ( ( rule__Role__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:758:1: ( rule__Role__TextfieldAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:759:1: ( rule__Role__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:759:2: rule__Role__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__Role__TextfieldAssignment_2_in_rule__Role__Group__2__Impl1582);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:769:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:773:1: ( rule__Role__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:774:2: rule__Role__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__31612);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:780:1: rule__Role__Group__3__Impl : ( ';' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:784:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:785:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:785:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:786:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Role__Group__3__Impl1640); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:807:1: rule__WorkProductType__Group__0 : rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1 ;
    public final void rule__WorkProductType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:811:1: ( rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:812:2: rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__0__Impl_in_rule__WorkProductType__Group__01679);
            rule__WorkProductType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__1_in_rule__WorkProductType__Group__01682);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:819:1: rule__WorkProductType__Group__0__Impl : ( 'WorkProductType' ) ;
    public final void rule__WorkProductType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:823:1: ( ( 'WorkProductType' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:824:1: ( 'WorkProductType' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:824:1: ( 'WorkProductType' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:825:1: 'WorkProductType'
            {
             before(grammarAccess.getWorkProductTypeAccess().getWorkProductTypeKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__WorkProductType__Group__0__Impl1710); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:838:1: rule__WorkProductType__Group__1 : rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2 ;
    public final void rule__WorkProductType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:842:1: ( rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:843:2: rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__1__Impl_in_rule__WorkProductType__Group__11741);
            rule__WorkProductType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__2_in_rule__WorkProductType__Group__11744);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:850:1: rule__WorkProductType__Group__1__Impl : ( ( rule__WorkProductType__NameAssignment_1 ) ) ;
    public final void rule__WorkProductType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:854:1: ( ( ( rule__WorkProductType__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:855:1: ( ( rule__WorkProductType__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:855:1: ( ( rule__WorkProductType__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:856:1: ( rule__WorkProductType__NameAssignment_1 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:857:1: ( rule__WorkProductType__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:857:2: rule__WorkProductType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkProductType__NameAssignment_1_in_rule__WorkProductType__Group__1__Impl1771);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:867:1: rule__WorkProductType__Group__2 : rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3 ;
    public final void rule__WorkProductType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:871:1: ( rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:872:2: rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__2__Impl_in_rule__WorkProductType__Group__21801);
            rule__WorkProductType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__3_in_rule__WorkProductType__Group__21804);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:879:1: rule__WorkProductType__Group__2__Impl : ( ( rule__WorkProductType__TextfieldAssignment_2 ) ) ;
    public final void rule__WorkProductType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:883:1: ( ( ( rule__WorkProductType__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:884:1: ( ( rule__WorkProductType__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:884:1: ( ( rule__WorkProductType__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:885:1: ( rule__WorkProductType__TextfieldAssignment_2 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:886:1: ( rule__WorkProductType__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:886:2: rule__WorkProductType__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__WorkProductType__TextfieldAssignment_2_in_rule__WorkProductType__Group__2__Impl1831);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:896:1: rule__WorkProductType__Group__3 : rule__WorkProductType__Group__3__Impl ;
    public final void rule__WorkProductType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:900:1: ( rule__WorkProductType__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:901:2: rule__WorkProductType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__3__Impl_in_rule__WorkProductType__Group__31861);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:907:1: rule__WorkProductType__Group__3__Impl : ( ';' ) ;
    public final void rule__WorkProductType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:911:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:912:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:912:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:913:1: ';'
            {
             before(grammarAccess.getWorkProductTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__WorkProductType__Group__3__Impl1889); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:934:1: rule__WorkProduct__Group__0 : rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1 ;
    public final void rule__WorkProduct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:938:1: ( rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:939:2: rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__0__Impl_in_rule__WorkProduct__Group__01928);
            rule__WorkProduct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__1_in_rule__WorkProduct__Group__01931);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:946:1: rule__WorkProduct__Group__0__Impl : ( 'WorkProduct' ) ;
    public final void rule__WorkProduct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:950:1: ( ( 'WorkProduct' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:951:1: ( 'WorkProduct' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:951:1: ( 'WorkProduct' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:952:1: 'WorkProduct'
            {
             before(grammarAccess.getWorkProductAccess().getWorkProductKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__WorkProduct__Group__0__Impl1959); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:965:1: rule__WorkProduct__Group__1 : rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2 ;
    public final void rule__WorkProduct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:969:1: ( rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:970:2: rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__1__Impl_in_rule__WorkProduct__Group__11990);
            rule__WorkProduct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__2_in_rule__WorkProduct__Group__11993);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:977:1: rule__WorkProduct__Group__1__Impl : ( ( rule__WorkProduct__NameAssignment_1 ) ) ;
    public final void rule__WorkProduct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:981:1: ( ( ( rule__WorkProduct__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:982:1: ( ( rule__WorkProduct__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:982:1: ( ( rule__WorkProduct__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:983:1: ( rule__WorkProduct__NameAssignment_1 )
            {
             before(grammarAccess.getWorkProductAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:984:1: ( rule__WorkProduct__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:984:2: rule__WorkProduct__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkProduct__NameAssignment_1_in_rule__WorkProduct__Group__1__Impl2020);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:994:1: rule__WorkProduct__Group__2 : rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3 ;
    public final void rule__WorkProduct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:998:1: ( rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:999:2: rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__2__Impl_in_rule__WorkProduct__Group__22050);
            rule__WorkProduct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__3_in_rule__WorkProduct__Group__22053);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1006:1: rule__WorkProduct__Group__2__Impl : ( ':' ) ;
    public final void rule__WorkProduct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1010:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1011:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1011:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1012:1: ':'
            {
             before(grammarAccess.getWorkProductAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__WorkProduct__Group__2__Impl2081); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1025:1: rule__WorkProduct__Group__3 : rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4 ;
    public final void rule__WorkProduct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1029:1: ( rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1030:2: rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__3__Impl_in_rule__WorkProduct__Group__32112);
            rule__WorkProduct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__4_in_rule__WorkProduct__Group__32115);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1037:1: rule__WorkProduct__Group__3__Impl : ( ( rule__WorkProduct__TypeAssignment_3 ) ) ;
    public final void rule__WorkProduct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1041:1: ( ( ( rule__WorkProduct__TypeAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1042:1: ( ( rule__WorkProduct__TypeAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1042:1: ( ( rule__WorkProduct__TypeAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1043:1: ( rule__WorkProduct__TypeAssignment_3 )
            {
             before(grammarAccess.getWorkProductAccess().getTypeAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1044:1: ( rule__WorkProduct__TypeAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1044:2: rule__WorkProduct__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__WorkProduct__TypeAssignment_3_in_rule__WorkProduct__Group__3__Impl2142);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1054:1: rule__WorkProduct__Group__4 : rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5 ;
    public final void rule__WorkProduct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1058:1: ( rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1059:2: rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__4__Impl_in_rule__WorkProduct__Group__42172);
            rule__WorkProduct__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__5_in_rule__WorkProduct__Group__42175);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1066:1: rule__WorkProduct__Group__4__Impl : ( ( rule__WorkProduct__TextfieldAssignment_4 ) ) ;
    public final void rule__WorkProduct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1070:1: ( ( ( rule__WorkProduct__TextfieldAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1071:1: ( ( rule__WorkProduct__TextfieldAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1071:1: ( ( rule__WorkProduct__TextfieldAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1072:1: ( rule__WorkProduct__TextfieldAssignment_4 )
            {
             before(grammarAccess.getWorkProductAccess().getTextfieldAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1073:1: ( rule__WorkProduct__TextfieldAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1073:2: rule__WorkProduct__TextfieldAssignment_4
            {
            pushFollow(FOLLOW_rule__WorkProduct__TextfieldAssignment_4_in_rule__WorkProduct__Group__4__Impl2202);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1083:1: rule__WorkProduct__Group__5 : rule__WorkProduct__Group__5__Impl rule__WorkProduct__Group__6 ;
    public final void rule__WorkProduct__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1087:1: ( rule__WorkProduct__Group__5__Impl rule__WorkProduct__Group__6 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1088:2: rule__WorkProduct__Group__5__Impl rule__WorkProduct__Group__6
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__5__Impl_in_rule__WorkProduct__Group__52232);
            rule__WorkProduct__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__6_in_rule__WorkProduct__Group__52235);
            rule__WorkProduct__Group__6();

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1095:1: rule__WorkProduct__Group__5__Impl : ( ( rule__WorkProduct__Group_5__0 )? ) ;
    public final void rule__WorkProduct__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1099:1: ( ( ( rule__WorkProduct__Group_5__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1100:1: ( ( rule__WorkProduct__Group_5__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1100:1: ( ( rule__WorkProduct__Group_5__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1101:1: ( rule__WorkProduct__Group_5__0 )?
            {
             before(grammarAccess.getWorkProductAccess().getGroup_5()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1102:1: ( rule__WorkProduct__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1102:2: rule__WorkProduct__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__WorkProduct__Group_5__0_in_rule__WorkProduct__Group__5__Impl2262);
                    rule__WorkProduct__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkProductAccess().getGroup_5()); 

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


    // $ANTLR start "rule__WorkProduct__Group__6"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1112:1: rule__WorkProduct__Group__6 : rule__WorkProduct__Group__6__Impl ;
    public final void rule__WorkProduct__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1116:1: ( rule__WorkProduct__Group__6__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1117:2: rule__WorkProduct__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__6__Impl_in_rule__WorkProduct__Group__62293);
            rule__WorkProduct__Group__6__Impl();

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
    // $ANTLR end "rule__WorkProduct__Group__6"


    // $ANTLR start "rule__WorkProduct__Group__6__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1123:1: rule__WorkProduct__Group__6__Impl : ( ';' ) ;
    public final void rule__WorkProduct__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1127:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1128:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1128:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1129:1: ';'
            {
             before(grammarAccess.getWorkProductAccess().getSemicolonKeyword_6()); 
            match(input,12,FOLLOW_12_in_rule__WorkProduct__Group__6__Impl2321); 
             after(grammarAccess.getWorkProductAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__WorkProduct__Group__6__Impl"


    // $ANTLR start "rule__WorkProduct__Group_5__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1156:1: rule__WorkProduct__Group_5__0 : rule__WorkProduct__Group_5__0__Impl rule__WorkProduct__Group_5__1 ;
    public final void rule__WorkProduct__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1160:1: ( rule__WorkProduct__Group_5__0__Impl rule__WorkProduct__Group_5__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1161:2: rule__WorkProduct__Group_5__0__Impl rule__WorkProduct__Group_5__1
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group_5__0__Impl_in_rule__WorkProduct__Group_5__02366);
            rule__WorkProduct__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group_5__1_in_rule__WorkProduct__Group_5__02369);
            rule__WorkProduct__Group_5__1();

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
    // $ANTLR end "rule__WorkProduct__Group_5__0"


    // $ANTLR start "rule__WorkProduct__Group_5__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1168:1: rule__WorkProduct__Group_5__0__Impl : ( 'states' ) ;
    public final void rule__WorkProduct__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1172:1: ( ( 'states' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1173:1: ( 'states' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1173:1: ( 'states' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1174:1: 'states'
            {
             before(grammarAccess.getWorkProductAccess().getStatesKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__WorkProduct__Group_5__0__Impl2397); 
             after(grammarAccess.getWorkProductAccess().getStatesKeyword_5_0()); 

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
    // $ANTLR end "rule__WorkProduct__Group_5__0__Impl"


    // $ANTLR start "rule__WorkProduct__Group_5__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1187:1: rule__WorkProduct__Group_5__1 : rule__WorkProduct__Group_5__1__Impl rule__WorkProduct__Group_5__2 ;
    public final void rule__WorkProduct__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1191:1: ( rule__WorkProduct__Group_5__1__Impl rule__WorkProduct__Group_5__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1192:2: rule__WorkProduct__Group_5__1__Impl rule__WorkProduct__Group_5__2
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group_5__1__Impl_in_rule__WorkProduct__Group_5__12428);
            rule__WorkProduct__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group_5__2_in_rule__WorkProduct__Group_5__12431);
            rule__WorkProduct__Group_5__2();

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
    // $ANTLR end "rule__WorkProduct__Group_5__1"


    // $ANTLR start "rule__WorkProduct__Group_5__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1199:1: rule__WorkProduct__Group_5__1__Impl : ( ( rule__WorkProduct__StatesAssignment_5_1 ) ) ;
    public final void rule__WorkProduct__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1203:1: ( ( ( rule__WorkProduct__StatesAssignment_5_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1204:1: ( ( rule__WorkProduct__StatesAssignment_5_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1204:1: ( ( rule__WorkProduct__StatesAssignment_5_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1205:1: ( rule__WorkProduct__StatesAssignment_5_1 )
            {
             before(grammarAccess.getWorkProductAccess().getStatesAssignment_5_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1206:1: ( rule__WorkProduct__StatesAssignment_5_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1206:2: rule__WorkProduct__StatesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__WorkProduct__StatesAssignment_5_1_in_rule__WorkProduct__Group_5__1__Impl2458);
            rule__WorkProduct__StatesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkProductAccess().getStatesAssignment_5_1()); 

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
    // $ANTLR end "rule__WorkProduct__Group_5__1__Impl"


    // $ANTLR start "rule__WorkProduct__Group_5__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1216:1: rule__WorkProduct__Group_5__2 : rule__WorkProduct__Group_5__2__Impl ;
    public final void rule__WorkProduct__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1220:1: ( rule__WorkProduct__Group_5__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1221:2: rule__WorkProduct__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group_5__2__Impl_in_rule__WorkProduct__Group_5__22488);
            rule__WorkProduct__Group_5__2__Impl();

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
    // $ANTLR end "rule__WorkProduct__Group_5__2"


    // $ANTLR start "rule__WorkProduct__Group_5__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1227:1: rule__WorkProduct__Group_5__2__Impl : ( ( rule__WorkProduct__Group_5_2__0 )* ) ;
    public final void rule__WorkProduct__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1231:1: ( ( ( rule__WorkProduct__Group_5_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1232:1: ( ( rule__WorkProduct__Group_5_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1232:1: ( ( rule__WorkProduct__Group_5_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1233:1: ( rule__WorkProduct__Group_5_2__0 )*
            {
             before(grammarAccess.getWorkProductAccess().getGroup_5_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1234:1: ( rule__WorkProduct__Group_5_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1234:2: rule__WorkProduct__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__WorkProduct__Group_5_2__0_in_rule__WorkProduct__Group_5__2__Impl2515);
            	    rule__WorkProduct__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getWorkProductAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__WorkProduct__Group_5__2__Impl"


    // $ANTLR start "rule__WorkProduct__Group_5_2__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1250:1: rule__WorkProduct__Group_5_2__0 : rule__WorkProduct__Group_5_2__0__Impl rule__WorkProduct__Group_5_2__1 ;
    public final void rule__WorkProduct__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1254:1: ( rule__WorkProduct__Group_5_2__0__Impl rule__WorkProduct__Group_5_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1255:2: rule__WorkProduct__Group_5_2__0__Impl rule__WorkProduct__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group_5_2__0__Impl_in_rule__WorkProduct__Group_5_2__02552);
            rule__WorkProduct__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group_5_2__1_in_rule__WorkProduct__Group_5_2__02555);
            rule__WorkProduct__Group_5_2__1();

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
    // $ANTLR end "rule__WorkProduct__Group_5_2__0"


    // $ANTLR start "rule__WorkProduct__Group_5_2__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1262:1: rule__WorkProduct__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__WorkProduct__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1266:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1267:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1267:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1268:1: ','
            {
             before(grammarAccess.getWorkProductAccess().getCommaKeyword_5_2_0()); 
            match(input,17,FOLLOW_17_in_rule__WorkProduct__Group_5_2__0__Impl2583); 
             after(grammarAccess.getWorkProductAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__WorkProduct__Group_5_2__0__Impl"


    // $ANTLR start "rule__WorkProduct__Group_5_2__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1281:1: rule__WorkProduct__Group_5_2__1 : rule__WorkProduct__Group_5_2__1__Impl ;
    public final void rule__WorkProduct__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1285:1: ( rule__WorkProduct__Group_5_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1286:2: rule__WorkProduct__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group_5_2__1__Impl_in_rule__WorkProduct__Group_5_2__12614);
            rule__WorkProduct__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__WorkProduct__Group_5_2__1"


    // $ANTLR start "rule__WorkProduct__Group_5_2__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1292:1: rule__WorkProduct__Group_5_2__1__Impl : ( ( rule__WorkProduct__StatesAssignment_5_2_1 ) ) ;
    public final void rule__WorkProduct__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1296:1: ( ( ( rule__WorkProduct__StatesAssignment_5_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1297:1: ( ( rule__WorkProduct__StatesAssignment_5_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1297:1: ( ( rule__WorkProduct__StatesAssignment_5_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1298:1: ( rule__WorkProduct__StatesAssignment_5_2_1 )
            {
             before(grammarAccess.getWorkProductAccess().getStatesAssignment_5_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1299:1: ( rule__WorkProduct__StatesAssignment_5_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1299:2: rule__WorkProduct__StatesAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__WorkProduct__StatesAssignment_5_2_1_in_rule__WorkProduct__Group_5_2__1__Impl2641);
            rule__WorkProduct__StatesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkProductAccess().getStatesAssignment_5_2_1()); 

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
    // $ANTLR end "rule__WorkProduct__Group_5_2__1__Impl"


    // $ANTLR start "rule__GuidanceType__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1313:1: rule__GuidanceType__Group__0 : rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1 ;
    public final void rule__GuidanceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1317:1: ( rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1318:2: rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__0__Impl_in_rule__GuidanceType__Group__02675);
            rule__GuidanceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__1_in_rule__GuidanceType__Group__02678);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1325:1: rule__GuidanceType__Group__0__Impl : ( 'GuidanceType' ) ;
    public final void rule__GuidanceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1329:1: ( ( 'GuidanceType' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1330:1: ( 'GuidanceType' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1330:1: ( 'GuidanceType' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1331:1: 'GuidanceType'
            {
             before(grammarAccess.getGuidanceTypeAccess().getGuidanceTypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__GuidanceType__Group__0__Impl2706); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1344:1: rule__GuidanceType__Group__1 : rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2 ;
    public final void rule__GuidanceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1348:1: ( rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1349:2: rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__1__Impl_in_rule__GuidanceType__Group__12737);
            rule__GuidanceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__2_in_rule__GuidanceType__Group__12740);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1356:1: rule__GuidanceType__Group__1__Impl : ( ( rule__GuidanceType__NameAssignment_1 ) ) ;
    public final void rule__GuidanceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1360:1: ( ( ( rule__GuidanceType__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1361:1: ( ( rule__GuidanceType__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1361:1: ( ( rule__GuidanceType__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1362:1: ( rule__GuidanceType__NameAssignment_1 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1363:1: ( rule__GuidanceType__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1363:2: rule__GuidanceType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GuidanceType__NameAssignment_1_in_rule__GuidanceType__Group__1__Impl2767);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1373:1: rule__GuidanceType__Group__2 : rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3 ;
    public final void rule__GuidanceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1377:1: ( rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1378:2: rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__2__Impl_in_rule__GuidanceType__Group__22797);
            rule__GuidanceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__3_in_rule__GuidanceType__Group__22800);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1385:1: rule__GuidanceType__Group__2__Impl : ( ( rule__GuidanceType__TextfieldAssignment_2 ) ) ;
    public final void rule__GuidanceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1389:1: ( ( ( rule__GuidanceType__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1390:1: ( ( rule__GuidanceType__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1390:1: ( ( rule__GuidanceType__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1391:1: ( rule__GuidanceType__TextfieldAssignment_2 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1392:1: ( rule__GuidanceType__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1392:2: rule__GuidanceType__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__GuidanceType__TextfieldAssignment_2_in_rule__GuidanceType__Group__2__Impl2827);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1402:1: rule__GuidanceType__Group__3 : rule__GuidanceType__Group__3__Impl ;
    public final void rule__GuidanceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1406:1: ( rule__GuidanceType__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1407:2: rule__GuidanceType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__3__Impl_in_rule__GuidanceType__Group__32857);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1413:1: rule__GuidanceType__Group__3__Impl : ( ';' ) ;
    public final void rule__GuidanceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1417:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1418:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1418:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1419:1: ';'
            {
             before(grammarAccess.getGuidanceTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__GuidanceType__Group__3__Impl2885); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1440:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1444:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1445:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02924);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02927);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1452:1: rule__Guidance__Group__0__Impl : ( 'Guidance' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1456:1: ( ( 'Guidance' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1457:1: ( 'Guidance' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1457:1: ( 'Guidance' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1458:1: 'Guidance'
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Guidance__Group__0__Impl2955); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1471:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1475:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1476:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__12986);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__12989);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1483:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__NameAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1487:1: ( ( ( rule__Guidance__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1488:1: ( ( rule__Guidance__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1488:1: ( ( rule__Guidance__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1489:1: ( rule__Guidance__NameAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1490:1: ( rule__Guidance__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1490:2: rule__Guidance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Guidance__NameAssignment_1_in_rule__Guidance__Group__1__Impl3016);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1500:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1504:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1505:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__23046);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__3_in_rule__Guidance__Group__23049);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1512:1: rule__Guidance__Group__2__Impl : ( ':' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1516:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1517:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1517:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1518:1: ':'
            {
             before(grammarAccess.getGuidanceAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Guidance__Group__2__Impl3077); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1531:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1535:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1536:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_rule__Guidance__Group__3__Impl_in_rule__Guidance__Group__33108);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__4_in_rule__Guidance__Group__33111);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1543:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__TypeAssignment_3 ) ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1547:1: ( ( ( rule__Guidance__TypeAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1548:1: ( ( rule__Guidance__TypeAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1548:1: ( ( rule__Guidance__TypeAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1549:1: ( rule__Guidance__TypeAssignment_3 )
            {
             before(grammarAccess.getGuidanceAccess().getTypeAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1550:1: ( rule__Guidance__TypeAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1550:2: rule__Guidance__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Guidance__TypeAssignment_3_in_rule__Guidance__Group__3__Impl3138);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1560:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl rule__Guidance__Group__5 ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1564:1: ( rule__Guidance__Group__4__Impl rule__Guidance__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1565:2: rule__Guidance__Group__4__Impl rule__Guidance__Group__5
            {
            pushFollow(FOLLOW_rule__Guidance__Group__4__Impl_in_rule__Guidance__Group__43168);
            rule__Guidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__5_in_rule__Guidance__Group__43171);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1572:1: rule__Guidance__Group__4__Impl : ( ( rule__Guidance__TextfieldAssignment_4 ) ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1576:1: ( ( ( rule__Guidance__TextfieldAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1577:1: ( ( rule__Guidance__TextfieldAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1577:1: ( ( rule__Guidance__TextfieldAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1578:1: ( rule__Guidance__TextfieldAssignment_4 )
            {
             before(grammarAccess.getGuidanceAccess().getTextfieldAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1579:1: ( rule__Guidance__TextfieldAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1579:2: rule__Guidance__TextfieldAssignment_4
            {
            pushFollow(FOLLOW_rule__Guidance__TextfieldAssignment_4_in_rule__Guidance__Group__4__Impl3198);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1589:1: rule__Guidance__Group__5 : rule__Guidance__Group__5__Impl ;
    public final void rule__Guidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1593:1: ( rule__Guidance__Group__5__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1594:2: rule__Guidance__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Guidance__Group__5__Impl_in_rule__Guidance__Group__53228);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1600:1: rule__Guidance__Group__5__Impl : ( ';' ) ;
    public final void rule__Guidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1604:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1605:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1605:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1606:1: ';'
            {
             before(grammarAccess.getGuidanceAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__Guidance__Group__5__Impl3256); 
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


    // $ANTLR start "rule__Port__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1631:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1635:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1636:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03299);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03302);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1643:1: rule__Port__Group__0__Impl : ( ( rule__Port__TypeAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1647:1: ( ( ( rule__Port__TypeAssignment_0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1648:1: ( ( rule__Port__TypeAssignment_0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1648:1: ( ( rule__Port__TypeAssignment_0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1649:1: ( rule__Port__TypeAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1650:1: ( rule__Port__TypeAssignment_0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1650:2: rule__Port__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__TypeAssignment_0_in_rule__Port__Group__0__Impl3329);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1660:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1664:1: ( rule__Port__Group__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1665:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13359);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1671:1: rule__Port__Group__1__Impl : ( ( rule__Port__Group_1__0 )? ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1675:1: ( ( ( rule__Port__Group_1__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1676:1: ( ( rule__Port__Group_1__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1676:1: ( ( rule__Port__Group_1__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1677:1: ( rule__Port__Group_1__0 )?
            {
             before(grammarAccess.getPortAccess().getGroup_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1678:1: ( rule__Port__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1678:2: rule__Port__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Port__Group_1__0_in_rule__Port__Group__1__Impl3386);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1692:1: rule__Port__Group_1__0 : rule__Port__Group_1__0__Impl rule__Port__Group_1__1 ;
    public final void rule__Port__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1696:1: ( rule__Port__Group_1__0__Impl rule__Port__Group_1__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1697:2: rule__Port__Group_1__0__Impl rule__Port__Group_1__1
            {
            pushFollow(FOLLOW_rule__Port__Group_1__0__Impl_in_rule__Port__Group_1__03421);
            rule__Port__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group_1__1_in_rule__Port__Group_1__03424);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1704:1: rule__Port__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Port__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1708:1: ( ( '(' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1709:1: ( '(' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1709:1: ( '(' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1710:1: '('
            {
             before(grammarAccess.getPortAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Port__Group_1__0__Impl3452); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1723:1: rule__Port__Group_1__1 : rule__Port__Group_1__1__Impl rule__Port__Group_1__2 ;
    public final void rule__Port__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1727:1: ( rule__Port__Group_1__1__Impl rule__Port__Group_1__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1728:2: rule__Port__Group_1__1__Impl rule__Port__Group_1__2
            {
            pushFollow(FOLLOW_rule__Port__Group_1__1__Impl_in_rule__Port__Group_1__13483);
            rule__Port__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group_1__2_in_rule__Port__Group_1__13486);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1735:1: rule__Port__Group_1__1__Impl : ( ( rule__Port__StateAssignment_1_1 ) ) ;
    public final void rule__Port__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1739:1: ( ( ( rule__Port__StateAssignment_1_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1740:1: ( ( rule__Port__StateAssignment_1_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1740:1: ( ( rule__Port__StateAssignment_1_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1741:1: ( rule__Port__StateAssignment_1_1 )
            {
             before(grammarAccess.getPortAccess().getStateAssignment_1_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1742:1: ( rule__Port__StateAssignment_1_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1742:2: rule__Port__StateAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Port__StateAssignment_1_1_in_rule__Port__Group_1__1__Impl3513);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1752:1: rule__Port__Group_1__2 : rule__Port__Group_1__2__Impl ;
    public final void rule__Port__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1756:1: ( rule__Port__Group_1__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1757:2: rule__Port__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group_1__2__Impl_in_rule__Port__Group_1__23543);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1763:1: rule__Port__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Port__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1767:1: ( ( ')' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1768:1: ( ')' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1768:1: ( ')' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1769:1: ')'
            {
             before(grammarAccess.getPortAccess().getRightParenthesisKeyword_1_2()); 
            match(input,21,FOLLOW_21_in_rule__Port__Group_1__2__Impl3571); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1788:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1792:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1793:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03608);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03611);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1800:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1804:1: ( ( 'Activity' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1805:1: ( 'Activity' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1805:1: ( 'Activity' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1806:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Activity__Group__0__Impl3639); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1819:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1823:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1824:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13670);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13673);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1831:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1835:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1836:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1836:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1837:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1838:1: ( rule__Activity__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1838:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl3700);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1848:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1852:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1853:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23730);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23733);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1860:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__TextfieldAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1864:1: ( ( ( rule__Activity__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1865:1: ( ( rule__Activity__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1865:1: ( ( rule__Activity__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1866:1: ( rule__Activity__TextfieldAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1867:1: ( rule__Activity__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1867:2: rule__Activity__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__TextfieldAssignment_2_in_rule__Activity__Group__2__Impl3760);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1877:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1881:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1882:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33790);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33793);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1889:1: rule__Activity__Group__3__Impl : ( 'responsible' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1893:1: ( ( 'responsible' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1894:1: ( 'responsible' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1894:1: ( 'responsible' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1895:1: 'responsible'
            {
             before(grammarAccess.getActivityAccess().getResponsibleKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Activity__Group__3__Impl3821); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1908:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1912:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1913:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43852);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43855);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1920:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__RoleAssignment_4 ) ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1924:1: ( ( ( rule__Activity__RoleAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1925:1: ( ( rule__Activity__RoleAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1925:1: ( ( rule__Activity__RoleAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1926:1: ( rule__Activity__RoleAssignment_4 )
            {
             before(grammarAccess.getActivityAccess().getRoleAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1927:1: ( rule__Activity__RoleAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1927:2: rule__Activity__RoleAssignment_4
            {
            pushFollow(FOLLOW_rule__Activity__RoleAssignment_4_in_rule__Activity__Group__4__Impl3882);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1937:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1941:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1942:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__53912);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__53915);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1949:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1953:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1954:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1954:1: ( ( rule__Activity__Group_5__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1955:1: ( rule__Activity__Group_5__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_5()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1956:1: ( rule__Activity__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1956:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl3942);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1966:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1970:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1971:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63973);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63976);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1978:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__Group_6__0 )? ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1982:1: ( ( ( rule__Activity__Group_6__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1983:1: ( ( rule__Activity__Group_6__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1983:1: ( ( rule__Activity__Group_6__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1984:1: ( rule__Activity__Group_6__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_6()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1985:1: ( rule__Activity__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1985:2: rule__Activity__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl4003);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1995:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1999:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2000:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__74034);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__74037);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2007:1: rule__Activity__Group__7__Impl : ( ( rule__Activity__Group_7__0 )? ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2011:1: ( ( ( rule__Activity__Group_7__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2012:1: ( ( rule__Activity__Group_7__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2012:1: ( ( rule__Activity__Group_7__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2013:1: ( rule__Activity__Group_7__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_7()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2014:1: ( rule__Activity__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2014:2: rule__Activity__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl4064);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2024:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2028:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2029:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__84095);
            rule__Activity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__84098);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2036:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__Group_8__0 )? ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2040:1: ( ( ( rule__Activity__Group_8__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2041:1: ( ( rule__Activity__Group_8__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2041:1: ( ( rule__Activity__Group_8__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2042:1: ( rule__Activity__Group_8__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_8()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2043:1: ( rule__Activity__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2043:2: rule__Activity__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl4125);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2053:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2057:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2058:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__94156);
            rule__Activity__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__94159);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2065:1: rule__Activity__Group__9__Impl : ( ( rule__Activity__Group_9__0 )? ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2069:1: ( ( ( rule__Activity__Group_9__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2070:1: ( ( rule__Activity__Group_9__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2070:1: ( ( rule__Activity__Group_9__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2071:1: ( rule__Activity__Group_9__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_9()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2072:1: ( rule__Activity__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2072:2: rule__Activity__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl4186);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2082:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2086:1: ( rule__Activity__Group__10__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2087:2: rule__Activity__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__104217);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2093:1: rule__Activity__Group__10__Impl : ( ';' ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2097:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2098:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2098:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2099:1: ';'
            {
             before(grammarAccess.getActivityAccess().getSemicolonKeyword_10()); 
            match(input,12,FOLLOW_12_in_rule__Activity__Group__10__Impl4245); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2134:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2138:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2139:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__04298);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__04301);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2146:1: rule__Activity__Group_5__0__Impl : ( 'inputs' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2150:1: ( ( 'inputs' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2151:1: ( 'inputs' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2151:1: ( 'inputs' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2152:1: 'inputs'
            {
             before(grammarAccess.getActivityAccess().getInputsKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Activity__Group_5__0__Impl4329); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2165:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2169:1: ( rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2170:2: rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__14360);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__14363);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2177:1: rule__Activity__Group_5__1__Impl : ( ( rule__Activity__InPortsAssignment_5_1 ) ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2181:1: ( ( ( rule__Activity__InPortsAssignment_5_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2182:1: ( ( rule__Activity__InPortsAssignment_5_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2182:1: ( ( rule__Activity__InPortsAssignment_5_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2183:1: ( rule__Activity__InPortsAssignment_5_1 )
            {
             before(grammarAccess.getActivityAccess().getInPortsAssignment_5_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2184:1: ( rule__Activity__InPortsAssignment_5_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2184:2: rule__Activity__InPortsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Activity__InPortsAssignment_5_1_in_rule__Activity__Group_5__1__Impl4390);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2194:1: rule__Activity__Group_5__2 : rule__Activity__Group_5__2__Impl ;
    public final void rule__Activity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2198:1: ( rule__Activity__Group_5__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2199:2: rule__Activity__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__24420);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2205:1: rule__Activity__Group_5__2__Impl : ( ( rule__Activity__Group_5_2__0 )* ) ;
    public final void rule__Activity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2209:1: ( ( ( rule__Activity__Group_5_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2210:1: ( ( rule__Activity__Group_5_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2210:1: ( ( rule__Activity__Group_5_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2211:1: ( rule__Activity__Group_5_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_5_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2212:1: ( rule__Activity__Group_5_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2212:2: rule__Activity__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__Group_5__2__Impl4447);
            	    rule__Activity__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2228:1: rule__Activity__Group_5_2__0 : rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 ;
    public final void rule__Activity__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2232:1: ( rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2233:2: rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__04484);
            rule__Activity__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__04487);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2240:1: rule__Activity__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2244:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2245:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2245:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2246:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_5_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Activity__Group_5_2__0__Impl4515); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2259:1: rule__Activity__Group_5_2__1 : rule__Activity__Group_5_2__1__Impl ;
    public final void rule__Activity__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2263:1: ( rule__Activity__Group_5_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2264:2: rule__Activity__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__14546);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2270:1: rule__Activity__Group_5_2__1__Impl : ( ( rule__Activity__InPortsAssignment_5_2_1 ) ) ;
    public final void rule__Activity__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2274:1: ( ( ( rule__Activity__InPortsAssignment_5_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2275:1: ( ( rule__Activity__InPortsAssignment_5_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2275:1: ( ( rule__Activity__InPortsAssignment_5_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2276:1: ( rule__Activity__InPortsAssignment_5_2_1 )
            {
             before(grammarAccess.getActivityAccess().getInPortsAssignment_5_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2277:1: ( rule__Activity__InPortsAssignment_5_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2277:2: rule__Activity__InPortsAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Activity__InPortsAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl4573);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2291:1: rule__Activity__Group_6__0 : rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 ;
    public final void rule__Activity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2295:1: ( rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2296:2: rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__04607);
            rule__Activity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__04610);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2303:1: rule__Activity__Group_6__0__Impl : ( 'outputs' ) ;
    public final void rule__Activity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2307:1: ( ( 'outputs' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2308:1: ( 'outputs' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2308:1: ( 'outputs' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2309:1: 'outputs'
            {
             before(grammarAccess.getActivityAccess().getOutputsKeyword_6_0()); 
            match(input,25,FOLLOW_25_in_rule__Activity__Group_6__0__Impl4638); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2322:1: rule__Activity__Group_6__1 : rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 ;
    public final void rule__Activity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2326:1: ( rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2327:2: rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__14669);
            rule__Activity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__14672);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2334:1: rule__Activity__Group_6__1__Impl : ( ( rule__Activity__OutPortsAssignment_6_1 ) ) ;
    public final void rule__Activity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2338:1: ( ( ( rule__Activity__OutPortsAssignment_6_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2339:1: ( ( rule__Activity__OutPortsAssignment_6_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2339:1: ( ( rule__Activity__OutPortsAssignment_6_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2340:1: ( rule__Activity__OutPortsAssignment_6_1 )
            {
             before(grammarAccess.getActivityAccess().getOutPortsAssignment_6_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2341:1: ( rule__Activity__OutPortsAssignment_6_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2341:2: rule__Activity__OutPortsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Activity__OutPortsAssignment_6_1_in_rule__Activity__Group_6__1__Impl4699);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2351:1: rule__Activity__Group_6__2 : rule__Activity__Group_6__2__Impl ;
    public final void rule__Activity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2355:1: ( rule__Activity__Group_6__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2356:2: rule__Activity__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__24729);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2362:1: rule__Activity__Group_6__2__Impl : ( ( rule__Activity__Group_6_2__0 )* ) ;
    public final void rule__Activity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2366:1: ( ( ( rule__Activity__Group_6_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2367:1: ( ( rule__Activity__Group_6_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2367:1: ( ( rule__Activity__Group_6_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2368:1: ( rule__Activity__Group_6_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_6_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2369:1: ( rule__Activity__Group_6_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2369:2: rule__Activity__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__Group_6__2__Impl4756);
            	    rule__Activity__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2385:1: rule__Activity__Group_6_2__0 : rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 ;
    public final void rule__Activity__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2389:1: ( rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2390:2: rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__04793);
            rule__Activity__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__04796);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2397:1: rule__Activity__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2401:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2402:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2402:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2403:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_6_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Activity__Group_6_2__0__Impl4824); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2416:1: rule__Activity__Group_6_2__1 : rule__Activity__Group_6_2__1__Impl ;
    public final void rule__Activity__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2420:1: ( rule__Activity__Group_6_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2421:2: rule__Activity__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__14855);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2427:1: rule__Activity__Group_6_2__1__Impl : ( ( rule__Activity__OutPortsAssignment_6_2_1 ) ) ;
    public final void rule__Activity__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2431:1: ( ( ( rule__Activity__OutPortsAssignment_6_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2432:1: ( ( rule__Activity__OutPortsAssignment_6_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2432:1: ( ( rule__Activity__OutPortsAssignment_6_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2433:1: ( rule__Activity__OutPortsAssignment_6_2_1 )
            {
             before(grammarAccess.getActivityAccess().getOutPortsAssignment_6_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2434:1: ( rule__Activity__OutPortsAssignment_6_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2434:2: rule__Activity__OutPortsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Activity__OutPortsAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl4882);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2448:1: rule__Activity__Group_7__0 : rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 ;
    public final void rule__Activity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2452:1: ( rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2453:2: rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__04916);
            rule__Activity__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__04919);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2460:1: rule__Activity__Group_7__0__Impl : ( 'subActivities' ) ;
    public final void rule__Activity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2464:1: ( ( 'subActivities' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2465:1: ( 'subActivities' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2465:1: ( 'subActivities' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2466:1: 'subActivities'
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Activity__Group_7__0__Impl4947); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2479:1: rule__Activity__Group_7__1 : rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2 ;
    public final void rule__Activity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2483:1: ( rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2484:2: rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__14978);
            rule__Activity__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7__2_in_rule__Activity__Group_7__14981);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2491:1: rule__Activity__Group_7__1__Impl : ( ( rule__Activity__SubActivitiesAssignment_7_1 ) ) ;
    public final void rule__Activity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2495:1: ( ( ( rule__Activity__SubActivitiesAssignment_7_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2496:1: ( ( rule__Activity__SubActivitiesAssignment_7_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2496:1: ( ( rule__Activity__SubActivitiesAssignment_7_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2497:1: ( rule__Activity__SubActivitiesAssignment_7_1 )
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2498:1: ( rule__Activity__SubActivitiesAssignment_7_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2498:2: rule__Activity__SubActivitiesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Activity__SubActivitiesAssignment_7_1_in_rule__Activity__Group_7__1__Impl5008);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2508:1: rule__Activity__Group_7__2 : rule__Activity__Group_7__2__Impl ;
    public final void rule__Activity__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2512:1: ( rule__Activity__Group_7__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2513:2: rule__Activity__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__2__Impl_in_rule__Activity__Group_7__25038);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2519:1: rule__Activity__Group_7__2__Impl : ( ( rule__Activity__Group_7_2__0 )* ) ;
    public final void rule__Activity__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2523:1: ( ( ( rule__Activity__Group_7_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2524:1: ( ( rule__Activity__Group_7_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2524:1: ( ( rule__Activity__Group_7_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2525:1: ( rule__Activity__Group_7_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_7_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2526:1: ( rule__Activity__Group_7_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2526:2: rule__Activity__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__Group_7__2__Impl5065);
            	    rule__Activity__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2542:1: rule__Activity__Group_7_2__0 : rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 ;
    public final void rule__Activity__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2546:1: ( rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2547:2: rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__05102);
            rule__Activity__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__05105);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2554:1: rule__Activity__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2558:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2559:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2559:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2560:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_7_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Activity__Group_7_2__0__Impl5133); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2573:1: rule__Activity__Group_7_2__1 : rule__Activity__Group_7_2__1__Impl ;
    public final void rule__Activity__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2577:1: ( rule__Activity__Group_7_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2578:2: rule__Activity__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__15164);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2584:1: rule__Activity__Group_7_2__1__Impl : ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) ) ;
    public final void rule__Activity__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2588:1: ( ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2589:1: ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2589:1: ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2590:1: ( rule__Activity__SubActivitiesAssignment_7_2_1 )
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2591:1: ( rule__Activity__SubActivitiesAssignment_7_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2591:2: rule__Activity__SubActivitiesAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Activity__SubActivitiesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl5191);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2605:1: rule__Activity__Group_8__0 : rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 ;
    public final void rule__Activity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2609:1: ( rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2610:2: rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__05225);
            rule__Activity__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__05228);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2617:1: rule__Activity__Group_8__0__Impl : ( 'guidances' ) ;
    public final void rule__Activity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2621:1: ( ( 'guidances' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2622:1: ( 'guidances' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2622:1: ( 'guidances' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2623:1: 'guidances'
            {
             before(grammarAccess.getActivityAccess().getGuidancesKeyword_8_0()); 
            match(input,27,FOLLOW_27_in_rule__Activity__Group_8__0__Impl5256); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2636:1: rule__Activity__Group_8__1 : rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 ;
    public final void rule__Activity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2640:1: ( rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2641:2: rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__15287);
            rule__Activity__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__15290);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2648:1: rule__Activity__Group_8__1__Impl : ( ( rule__Activity__GuidancesAssignment_8_1 ) ) ;
    public final void rule__Activity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2652:1: ( ( ( rule__Activity__GuidancesAssignment_8_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2653:1: ( ( rule__Activity__GuidancesAssignment_8_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2653:1: ( ( rule__Activity__GuidancesAssignment_8_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2654:1: ( rule__Activity__GuidancesAssignment_8_1 )
            {
             before(grammarAccess.getActivityAccess().getGuidancesAssignment_8_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2655:1: ( rule__Activity__GuidancesAssignment_8_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2655:2: rule__Activity__GuidancesAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Activity__GuidancesAssignment_8_1_in_rule__Activity__Group_8__1__Impl5317);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2665:1: rule__Activity__Group_8__2 : rule__Activity__Group_8__2__Impl ;
    public final void rule__Activity__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2669:1: ( rule__Activity__Group_8__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2670:2: rule__Activity__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__25347);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2676:1: rule__Activity__Group_8__2__Impl : ( ( rule__Activity__Group_8_2__0 )* ) ;
    public final void rule__Activity__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2680:1: ( ( ( rule__Activity__Group_8_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2681:1: ( ( rule__Activity__Group_8_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2681:1: ( ( rule__Activity__Group_8_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2682:1: ( rule__Activity__Group_8_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_8_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2683:1: ( rule__Activity__Group_8_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2683:2: rule__Activity__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_8_2__0_in_rule__Activity__Group_8__2__Impl5374);
            	    rule__Activity__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2699:1: rule__Activity__Group_8_2__0 : rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1 ;
    public final void rule__Activity__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2703:1: ( rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2704:2: rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8_2__0__Impl_in_rule__Activity__Group_8_2__05411);
            rule__Activity__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8_2__1_in_rule__Activity__Group_8_2__05414);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2711:1: rule__Activity__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2715:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2716:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2716:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2717:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_8_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Activity__Group_8_2__0__Impl5442); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2730:1: rule__Activity__Group_8_2__1 : rule__Activity__Group_8_2__1__Impl ;
    public final void rule__Activity__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2734:1: ( rule__Activity__Group_8_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2735:2: rule__Activity__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8_2__1__Impl_in_rule__Activity__Group_8_2__15473);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2741:1: rule__Activity__Group_8_2__1__Impl : ( ( rule__Activity__GuidancesAssignment_8_2_1 ) ) ;
    public final void rule__Activity__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2745:1: ( ( ( rule__Activity__GuidancesAssignment_8_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2746:1: ( ( rule__Activity__GuidancesAssignment_8_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2746:1: ( ( rule__Activity__GuidancesAssignment_8_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2747:1: ( rule__Activity__GuidancesAssignment_8_2_1 )
            {
             before(grammarAccess.getActivityAccess().getGuidancesAssignment_8_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2748:1: ( rule__Activity__GuidancesAssignment_8_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2748:2: rule__Activity__GuidancesAssignment_8_2_1
            {
            pushFollow(FOLLOW_rule__Activity__GuidancesAssignment_8_2_1_in_rule__Activity__Group_8_2__1__Impl5500);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2762:1: rule__Activity__Group_9__0 : rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 ;
    public final void rule__Activity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2766:1: ( rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2767:2: rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__05534);
            rule__Activity__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__05537);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2774:1: rule__Activity__Group_9__0__Impl : ( 'Behavior' ) ;
    public final void rule__Activity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2778:1: ( ( 'Behavior' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2779:1: ( 'Behavior' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2779:1: ( 'Behavior' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2780:1: 'Behavior'
            {
             before(grammarAccess.getActivityAccess().getBehaviorKeyword_9_0()); 
            match(input,28,FOLLOW_28_in_rule__Activity__Group_9__0__Impl5565); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2793:1: rule__Activity__Group_9__1 : rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 ;
    public final void rule__Activity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2797:1: ( rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2798:2: rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__15596);
            rule__Activity__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__15599);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2805:1: rule__Activity__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2809:1: ( ( '{' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2810:1: ( '{' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2810:1: ( '{' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2811:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,29,FOLLOW_29_in_rule__Activity__Group_9__1__Impl5627); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2824:1: rule__Activity__Group_9__2 : rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3 ;
    public final void rule__Activity__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2828:1: ( rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2829:2: rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__25658);
            rule__Activity__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__3_in_rule__Activity__Group_9__25661);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2836:1: rule__Activity__Group_9__2__Impl : ( ( rule__Activity__Alternatives_9_2 )* ) ;
    public final void rule__Activity__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2840:1: ( ( ( rule__Activity__Alternatives_9_2 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2841:1: ( ( rule__Activity__Alternatives_9_2 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2841:1: ( ( rule__Activity__Alternatives_9_2 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2842:1: ( rule__Activity__Alternatives_9_2 )*
            {
             before(grammarAccess.getActivityAccess().getAlternatives_9_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2843:1: ( rule__Activity__Alternatives_9_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=31 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2843:2: rule__Activity__Alternatives_9_2
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Alternatives_9_2_in_rule__Activity__Group_9__2__Impl5688);
            	    rule__Activity__Alternatives_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2853:1: rule__Activity__Group_9__3 : rule__Activity__Group_9__3__Impl ;
    public final void rule__Activity__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2857:1: ( rule__Activity__Group_9__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2858:2: rule__Activity__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__3__Impl_in_rule__Activity__Group_9__35719);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2864:1: rule__Activity__Group_9__3__Impl : ( '}' ) ;
    public final void rule__Activity__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2868:1: ( ( '}' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2869:1: ( '}' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2869:1: ( '}' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2870:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,30,FOLLOW_30_in_rule__Activity__Group_9__3__Impl5747); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2891:1: rule__Decision__Group__0 : rule__Decision__Group__0__Impl rule__Decision__Group__1 ;
    public final void rule__Decision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2895:1: ( rule__Decision__Group__0__Impl rule__Decision__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2896:2: rule__Decision__Group__0__Impl rule__Decision__Group__1
            {
            pushFollow(FOLLOW_rule__Decision__Group__0__Impl_in_rule__Decision__Group__05786);
            rule__Decision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decision__Group__1_in_rule__Decision__Group__05789);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2903:1: rule__Decision__Group__0__Impl : ( 'Decision' ) ;
    public final void rule__Decision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2907:1: ( ( 'Decision' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2908:1: ( 'Decision' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2908:1: ( 'Decision' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2909:1: 'Decision'
            {
             before(grammarAccess.getDecisionAccess().getDecisionKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Decision__Group__0__Impl5817); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2922:1: rule__Decision__Group__1 : rule__Decision__Group__1__Impl rule__Decision__Group__2 ;
    public final void rule__Decision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2926:1: ( rule__Decision__Group__1__Impl rule__Decision__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2927:2: rule__Decision__Group__1__Impl rule__Decision__Group__2
            {
            pushFollow(FOLLOW_rule__Decision__Group__1__Impl_in_rule__Decision__Group__15848);
            rule__Decision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decision__Group__2_in_rule__Decision__Group__15851);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2934:1: rule__Decision__Group__1__Impl : ( ( rule__Decision__NameAssignment_1 ) ) ;
    public final void rule__Decision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2938:1: ( ( ( rule__Decision__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2939:1: ( ( rule__Decision__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2939:1: ( ( rule__Decision__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2940:1: ( rule__Decision__NameAssignment_1 )
            {
             before(grammarAccess.getDecisionAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2941:1: ( rule__Decision__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2941:2: rule__Decision__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Decision__NameAssignment_1_in_rule__Decision__Group__1__Impl5878);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2951:1: rule__Decision__Group__2 : rule__Decision__Group__2__Impl ;
    public final void rule__Decision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2955:1: ( rule__Decision__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2956:2: rule__Decision__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Decision__Group__2__Impl_in_rule__Decision__Group__25908);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2962:1: rule__Decision__Group__2__Impl : ( ( rule__Decision__LabelAssignment_2 )? ) ;
    public final void rule__Decision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2966:1: ( ( ( rule__Decision__LabelAssignment_2 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2967:1: ( ( rule__Decision__LabelAssignment_2 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2967:1: ( ( rule__Decision__LabelAssignment_2 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2968:1: ( rule__Decision__LabelAssignment_2 )?
            {
             before(grammarAccess.getDecisionAccess().getLabelAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2969:1: ( rule__Decision__LabelAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2969:2: rule__Decision__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Decision__LabelAssignment_2_in_rule__Decision__Group__2__Impl5935);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2985:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2989:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2990:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__05972);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__1_in_rule__Step__Group__05975);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2997:1: rule__Step__Group__0__Impl : ( 'Step' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3001:1: ( ( 'Step' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3002:1: ( 'Step' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3002:1: ( 'Step' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3003:1: 'Step'
            {
             before(grammarAccess.getStepAccess().getStepKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Step__Group__0__Impl6003); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3016:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3020:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3021:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__16034);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__2_in_rule__Step__Group__16037);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3028:1: rule__Step__Group__1__Impl : ( ( rule__Step__NameAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3032:1: ( ( ( rule__Step__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3033:1: ( ( rule__Step__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3033:1: ( ( rule__Step__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3034:1: ( rule__Step__NameAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3035:1: ( rule__Step__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3035:2: rule__Step__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Step__NameAssignment_1_in_rule__Step__Group__1__Impl6064);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3045:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3049:1: ( rule__Step__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3050:2: rule__Step__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__26094);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3056:1: rule__Step__Group__2__Impl : ( ( rule__Step__LabelAssignment_2 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3060:1: ( ( ( rule__Step__LabelAssignment_2 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3061:1: ( ( rule__Step__LabelAssignment_2 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3061:1: ( ( rule__Step__LabelAssignment_2 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3062:1: ( rule__Step__LabelAssignment_2 )?
            {
             before(grammarAccess.getStepAccess().getLabelAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3063:1: ( rule__Step__LabelAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3063:2: rule__Step__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Step__LabelAssignment_2_in_rule__Step__Group__2__Impl6121);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3079:1: rule__InitialTransition__Group__0 : rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1 ;
    public final void rule__InitialTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3083:1: ( rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3084:2: rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__0__Impl_in_rule__InitialTransition__Group__06158);
            rule__InitialTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__1_in_rule__InitialTransition__Group__06161);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3091:1: rule__InitialTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__InitialTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3095:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3096:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3096:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3097:1: 'Transition'
            {
             before(grammarAccess.getInitialTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__InitialTransition__Group__0__Impl6189); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3110:1: rule__InitialTransition__Group__1 : rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2 ;
    public final void rule__InitialTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3114:1: ( rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3115:2: rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__1__Impl_in_rule__InitialTransition__Group__16220);
            rule__InitialTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__2_in_rule__InitialTransition__Group__16223);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3122:1: rule__InitialTransition__Group__1__Impl : ( 'initial' ) ;
    public final void rule__InitialTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3126:1: ( ( 'initial' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3127:1: ( 'initial' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3127:1: ( 'initial' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3128:1: 'initial'
            {
             before(grammarAccess.getInitialTransitionAccess().getInitialKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__InitialTransition__Group__1__Impl6251); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3141:1: rule__InitialTransition__Group__2 : rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3 ;
    public final void rule__InitialTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3145:1: ( rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3146:2: rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__2__Impl_in_rule__InitialTransition__Group__26282);
            rule__InitialTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__3_in_rule__InitialTransition__Group__26285);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3153:1: rule__InitialTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__InitialTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3157:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3158:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3158:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3159:1: 'to'
            {
             before(grammarAccess.getInitialTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__InitialTransition__Group__2__Impl6313); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3172:1: rule__InitialTransition__Group__3 : rule__InitialTransition__Group__3__Impl ;
    public final void rule__InitialTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3176:1: ( rule__InitialTransition__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3177:2: rule__InitialTransition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__3__Impl_in_rule__InitialTransition__Group__36344);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3183:1: rule__InitialTransition__Group__3__Impl : ( ( rule__InitialTransition__ToAssignment_3 ) ) ;
    public final void rule__InitialTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3187:1: ( ( ( rule__InitialTransition__ToAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3188:1: ( ( rule__InitialTransition__ToAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3188:1: ( ( rule__InitialTransition__ToAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3189:1: ( rule__InitialTransition__ToAssignment_3 )
            {
             before(grammarAccess.getInitialTransitionAccess().getToAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3190:1: ( rule__InitialTransition__ToAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3190:2: rule__InitialTransition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__InitialTransition__ToAssignment_3_in_rule__InitialTransition__Group__3__Impl6371);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3208:1: rule__FinalTransition__Group__0 : rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1 ;
    public final void rule__FinalTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3212:1: ( rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3213:2: rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__0__Impl_in_rule__FinalTransition__Group__06409);
            rule__FinalTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__1_in_rule__FinalTransition__Group__06412);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3220:1: rule__FinalTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__FinalTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3224:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3225:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3225:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3226:1: 'Transition'
            {
             before(grammarAccess.getFinalTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__FinalTransition__Group__0__Impl6440); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3239:1: rule__FinalTransition__Group__1 : rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2 ;
    public final void rule__FinalTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3243:1: ( rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3244:2: rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__1__Impl_in_rule__FinalTransition__Group__16471);
            rule__FinalTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__2_in_rule__FinalTransition__Group__16474);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3251:1: rule__FinalTransition__Group__1__Impl : ( ( rule__FinalTransition__FromAssignment_1 ) ) ;
    public final void rule__FinalTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3255:1: ( ( ( rule__FinalTransition__FromAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3256:1: ( ( rule__FinalTransition__FromAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3256:1: ( ( rule__FinalTransition__FromAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3257:1: ( rule__FinalTransition__FromAssignment_1 )
            {
             before(grammarAccess.getFinalTransitionAccess().getFromAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3258:1: ( rule__FinalTransition__FromAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3258:2: rule__FinalTransition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__FinalTransition__FromAssignment_1_in_rule__FinalTransition__Group__1__Impl6501);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3268:1: rule__FinalTransition__Group__2 : rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3 ;
    public final void rule__FinalTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3272:1: ( rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3273:2: rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__2__Impl_in_rule__FinalTransition__Group__26531);
            rule__FinalTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__3_in_rule__FinalTransition__Group__26534);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3280:1: rule__FinalTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__FinalTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3284:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3285:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3285:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3286:1: 'to'
            {
             before(grammarAccess.getFinalTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__FinalTransition__Group__2__Impl6562); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3299:1: rule__FinalTransition__Group__3 : rule__FinalTransition__Group__3__Impl ;
    public final void rule__FinalTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3303:1: ( rule__FinalTransition__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3304:2: rule__FinalTransition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__3__Impl_in_rule__FinalTransition__Group__36593);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3310:1: rule__FinalTransition__Group__3__Impl : ( 'final' ) ;
    public final void rule__FinalTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3314:1: ( ( 'final' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3315:1: ( 'final' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3315:1: ( 'final' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3316:1: 'final'
            {
             before(grammarAccess.getFinalTransitionAccess().getFinalKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__FinalTransition__Group__3__Impl6621); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3337:1: rule__DecisionTransition__Group__0 : rule__DecisionTransition__Group__0__Impl rule__DecisionTransition__Group__1 ;
    public final void rule__DecisionTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3341:1: ( rule__DecisionTransition__Group__0__Impl rule__DecisionTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3342:2: rule__DecisionTransition__Group__0__Impl rule__DecisionTransition__Group__1
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__0__Impl_in_rule__DecisionTransition__Group__06660);
            rule__DecisionTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__1_in_rule__DecisionTransition__Group__06663);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3349:1: rule__DecisionTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__DecisionTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3353:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3354:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3354:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3355:1: 'Transition'
            {
             before(grammarAccess.getDecisionTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__DecisionTransition__Group__0__Impl6691); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3368:1: rule__DecisionTransition__Group__1 : rule__DecisionTransition__Group__1__Impl rule__DecisionTransition__Group__2 ;
    public final void rule__DecisionTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3372:1: ( rule__DecisionTransition__Group__1__Impl rule__DecisionTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3373:2: rule__DecisionTransition__Group__1__Impl rule__DecisionTransition__Group__2
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__1__Impl_in_rule__DecisionTransition__Group__16722);
            rule__DecisionTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__2_in_rule__DecisionTransition__Group__16725);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3380:1: rule__DecisionTransition__Group__1__Impl : ( ( rule__DecisionTransition__FromAssignment_1 ) ) ;
    public final void rule__DecisionTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3384:1: ( ( ( rule__DecisionTransition__FromAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3385:1: ( ( rule__DecisionTransition__FromAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3385:1: ( ( rule__DecisionTransition__FromAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3386:1: ( rule__DecisionTransition__FromAssignment_1 )
            {
             before(grammarAccess.getDecisionTransitionAccess().getFromAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3387:1: ( rule__DecisionTransition__FromAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3387:2: rule__DecisionTransition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__DecisionTransition__FromAssignment_1_in_rule__DecisionTransition__Group__1__Impl6752);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3397:1: rule__DecisionTransition__Group__2 : rule__DecisionTransition__Group__2__Impl rule__DecisionTransition__Group__3 ;
    public final void rule__DecisionTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3401:1: ( rule__DecisionTransition__Group__2__Impl rule__DecisionTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3402:2: rule__DecisionTransition__Group__2__Impl rule__DecisionTransition__Group__3
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__2__Impl_in_rule__DecisionTransition__Group__26782);
            rule__DecisionTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__3_in_rule__DecisionTransition__Group__26785);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3409:1: rule__DecisionTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__DecisionTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3413:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3414:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3414:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3415:1: 'to'
            {
             before(grammarAccess.getDecisionTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__DecisionTransition__Group__2__Impl6813); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3428:1: rule__DecisionTransition__Group__3 : rule__DecisionTransition__Group__3__Impl rule__DecisionTransition__Group__4 ;
    public final void rule__DecisionTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3432:1: ( rule__DecisionTransition__Group__3__Impl rule__DecisionTransition__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3433:2: rule__DecisionTransition__Group__3__Impl rule__DecisionTransition__Group__4
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__3__Impl_in_rule__DecisionTransition__Group__36844);
            rule__DecisionTransition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__4_in_rule__DecisionTransition__Group__36847);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3440:1: rule__DecisionTransition__Group__3__Impl : ( ( rule__DecisionTransition__ToAssignment_3 ) ) ;
    public final void rule__DecisionTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3444:1: ( ( ( rule__DecisionTransition__ToAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3445:1: ( ( rule__DecisionTransition__ToAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3445:1: ( ( rule__DecisionTransition__ToAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3446:1: ( rule__DecisionTransition__ToAssignment_3 )
            {
             before(grammarAccess.getDecisionTransitionAccess().getToAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3447:1: ( rule__DecisionTransition__ToAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3447:2: rule__DecisionTransition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__DecisionTransition__ToAssignment_3_in_rule__DecisionTransition__Group__3__Impl6874);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3457:1: rule__DecisionTransition__Group__4 : rule__DecisionTransition__Group__4__Impl ;
    public final void rule__DecisionTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3461:1: ( rule__DecisionTransition__Group__4__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3462:2: rule__DecisionTransition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__4__Impl_in_rule__DecisionTransition__Group__46904);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3468:1: rule__DecisionTransition__Group__4__Impl : ( ( rule__DecisionTransition__GuardAssignment_4 ) ) ;
    public final void rule__DecisionTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3472:1: ( ( ( rule__DecisionTransition__GuardAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3473:1: ( ( rule__DecisionTransition__GuardAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3473:1: ( ( rule__DecisionTransition__GuardAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3474:1: ( rule__DecisionTransition__GuardAssignment_4 )
            {
             before(grammarAccess.getDecisionTransitionAccess().getGuardAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3475:1: ( rule__DecisionTransition__GuardAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3475:2: rule__DecisionTransition__GuardAssignment_4
            {
            pushFollow(FOLLOW_rule__DecisionTransition__GuardAssignment_4_in_rule__DecisionTransition__Group__4__Impl6931);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3495:1: rule__NonInitialTransition__Group__0 : rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1 ;
    public final void rule__NonInitialTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3499:1: ( rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3500:2: rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__0__Impl_in_rule__NonInitialTransition__Group__06971);
            rule__NonInitialTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__1_in_rule__NonInitialTransition__Group__06974);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3507:1: rule__NonInitialTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__NonInitialTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3511:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3512:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3512:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3513:1: 'Transition'
            {
             before(grammarAccess.getNonInitialTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__NonInitialTransition__Group__0__Impl7002); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3526:1: rule__NonInitialTransition__Group__1 : rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2 ;
    public final void rule__NonInitialTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3530:1: ( rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3531:2: rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__1__Impl_in_rule__NonInitialTransition__Group__17033);
            rule__NonInitialTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__2_in_rule__NonInitialTransition__Group__17036);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3538:1: rule__NonInitialTransition__Group__1__Impl : ( ( rule__NonInitialTransition__FromAssignment_1 ) ) ;
    public final void rule__NonInitialTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3542:1: ( ( ( rule__NonInitialTransition__FromAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3543:1: ( ( rule__NonInitialTransition__FromAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3543:1: ( ( rule__NonInitialTransition__FromAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3544:1: ( rule__NonInitialTransition__FromAssignment_1 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3545:1: ( rule__NonInitialTransition__FromAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3545:2: rule__NonInitialTransition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__FromAssignment_1_in_rule__NonInitialTransition__Group__1__Impl7063);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3555:1: rule__NonInitialTransition__Group__2 : rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3 ;
    public final void rule__NonInitialTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3559:1: ( rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3560:2: rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__2__Impl_in_rule__NonInitialTransition__Group__27093);
            rule__NonInitialTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__3_in_rule__NonInitialTransition__Group__27096);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3567:1: rule__NonInitialTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__NonInitialTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3571:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3572:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3572:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3573:1: 'to'
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__NonInitialTransition__Group__2__Impl7124); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3586:1: rule__NonInitialTransition__Group__3 : rule__NonInitialTransition__Group__3__Impl ;
    public final void rule__NonInitialTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3590:1: ( rule__NonInitialTransition__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3591:2: rule__NonInitialTransition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__3__Impl_in_rule__NonInitialTransition__Group__37155);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3597:1: rule__NonInitialTransition__Group__3__Impl : ( ( rule__NonInitialTransition__ToAssignment_3 ) ) ;
    public final void rule__NonInitialTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3601:1: ( ( ( rule__NonInitialTransition__ToAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3602:1: ( ( rule__NonInitialTransition__ToAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3602:1: ( ( rule__NonInitialTransition__ToAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3603:1: ( rule__NonInitialTransition__ToAssignment_3 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3604:1: ( rule__NonInitialTransition__ToAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3604:2: rule__NonInitialTransition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__ToAssignment_3_in_rule__NonInitialTransition__Group__3__Impl7182);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3622:1: rule__Textfield__Group__0 : rule__Textfield__Group__0__Impl rule__Textfield__Group__1 ;
    public final void rule__Textfield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3626:1: ( rule__Textfield__Group__0__Impl rule__Textfield__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3627:2: rule__Textfield__Group__0__Impl rule__Textfield__Group__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group__0__Impl_in_rule__Textfield__Group__07220);
            rule__Textfield__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__1_in_rule__Textfield__Group__07223);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3634:1: rule__Textfield__Group__0__Impl : ( ( rule__Textfield__Group_0__0 )? ) ;
    public final void rule__Textfield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3638:1: ( ( ( rule__Textfield__Group_0__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3639:1: ( ( rule__Textfield__Group_0__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3639:1: ( ( rule__Textfield__Group_0__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3640:1: ( rule__Textfield__Group_0__0 )?
            {
             before(grammarAccess.getTextfieldAccess().getGroup_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3641:1: ( rule__Textfield__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3641:2: rule__Textfield__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Textfield__Group_0__0_in_rule__Textfield__Group__0__Impl7250);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3651:1: rule__Textfield__Group__1 : rule__Textfield__Group__1__Impl rule__Textfield__Group__2 ;
    public final void rule__Textfield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3655:1: ( rule__Textfield__Group__1__Impl rule__Textfield__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3656:2: rule__Textfield__Group__1__Impl rule__Textfield__Group__2
            {
            pushFollow(FOLLOW_rule__Textfield__Group__1__Impl_in_rule__Textfield__Group__17281);
            rule__Textfield__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__2_in_rule__Textfield__Group__17284);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3663:1: rule__Textfield__Group__1__Impl : ( 'summary' ) ;
    public final void rule__Textfield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3667:1: ( ( 'summary' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3668:1: ( 'summary' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3668:1: ( 'summary' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3669:1: 'summary'
            {
             before(grammarAccess.getTextfieldAccess().getSummaryKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__Textfield__Group__1__Impl7312); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3682:1: rule__Textfield__Group__2 : rule__Textfield__Group__2__Impl rule__Textfield__Group__3 ;
    public final void rule__Textfield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3686:1: ( rule__Textfield__Group__2__Impl rule__Textfield__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3687:2: rule__Textfield__Group__2__Impl rule__Textfield__Group__3
            {
            pushFollow(FOLLOW_rule__Textfield__Group__2__Impl_in_rule__Textfield__Group__27343);
            rule__Textfield__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__3_in_rule__Textfield__Group__27346);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3694:1: rule__Textfield__Group__2__Impl : ( ( rule__Textfield__SummaryAssignment_2 ) ) ;
    public final void rule__Textfield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3698:1: ( ( ( rule__Textfield__SummaryAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3699:1: ( ( rule__Textfield__SummaryAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3699:1: ( ( rule__Textfield__SummaryAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3700:1: ( rule__Textfield__SummaryAssignment_2 )
            {
             before(grammarAccess.getTextfieldAccess().getSummaryAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3701:1: ( rule__Textfield__SummaryAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3701:2: rule__Textfield__SummaryAssignment_2
            {
            pushFollow(FOLLOW_rule__Textfield__SummaryAssignment_2_in_rule__Textfield__Group__2__Impl7373);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3711:1: rule__Textfield__Group__3 : rule__Textfield__Group__3__Impl ;
    public final void rule__Textfield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3715:1: ( rule__Textfield__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3716:2: rule__Textfield__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group__3__Impl_in_rule__Textfield__Group__37403);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3722:1: rule__Textfield__Group__3__Impl : ( ( rule__Textfield__Group_3__0 )? ) ;
    public final void rule__Textfield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3726:1: ( ( ( rule__Textfield__Group_3__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3727:1: ( ( rule__Textfield__Group_3__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3727:1: ( ( rule__Textfield__Group_3__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3728:1: ( rule__Textfield__Group_3__0 )?
            {
             before(grammarAccess.getTextfieldAccess().getGroup_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3729:1: ( rule__Textfield__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3729:2: rule__Textfield__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Textfield__Group_3__0_in_rule__Textfield__Group__3__Impl7430);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3747:1: rule__Textfield__Group_0__0 : rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1 ;
    public final void rule__Textfield__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3751:1: ( rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3752:2: rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group_0__0__Impl_in_rule__Textfield__Group_0__07469);
            rule__Textfield__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group_0__1_in_rule__Textfield__Group_0__07472);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3759:1: rule__Textfield__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__Textfield__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3763:1: ( ( 'label' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3764:1: ( 'label' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3764:1: ( 'label' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3765:1: 'label'
            {
             before(grammarAccess.getTextfieldAccess().getLabelKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Textfield__Group_0__0__Impl7500); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3778:1: rule__Textfield__Group_0__1 : rule__Textfield__Group_0__1__Impl ;
    public final void rule__Textfield__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3782:1: ( rule__Textfield__Group_0__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3783:2: rule__Textfield__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group_0__1__Impl_in_rule__Textfield__Group_0__17531);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3789:1: rule__Textfield__Group_0__1__Impl : ( ( rule__Textfield__LabelAssignment_0_1 ) ) ;
    public final void rule__Textfield__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3793:1: ( ( ( rule__Textfield__LabelAssignment_0_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3794:1: ( ( rule__Textfield__LabelAssignment_0_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3794:1: ( ( rule__Textfield__LabelAssignment_0_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3795:1: ( rule__Textfield__LabelAssignment_0_1 )
            {
             before(grammarAccess.getTextfieldAccess().getLabelAssignment_0_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3796:1: ( rule__Textfield__LabelAssignment_0_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3796:2: rule__Textfield__LabelAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Textfield__LabelAssignment_0_1_in_rule__Textfield__Group_0__1__Impl7558);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3810:1: rule__Textfield__Group_3__0 : rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1 ;
    public final void rule__Textfield__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3814:1: ( rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3815:2: rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group_3__0__Impl_in_rule__Textfield__Group_3__07592);
            rule__Textfield__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group_3__1_in_rule__Textfield__Group_3__07595);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3822:1: rule__Textfield__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Textfield__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3826:1: ( ( 'description' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3827:1: ( 'description' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3827:1: ( 'description' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3828:1: 'description'
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionKeyword_3_0()); 
            match(input,39,FOLLOW_39_in_rule__Textfield__Group_3__0__Impl7623); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3841:1: rule__Textfield__Group_3__1 : rule__Textfield__Group_3__1__Impl ;
    public final void rule__Textfield__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3845:1: ( rule__Textfield__Group_3__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3846:2: rule__Textfield__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group_3__1__Impl_in_rule__Textfield__Group_3__17654);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3852:1: rule__Textfield__Group_3__1__Impl : ( ( rule__Textfield__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Textfield__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3856:1: ( ( ( rule__Textfield__DescriptionAssignment_3_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3857:1: ( ( rule__Textfield__DescriptionAssignment_3_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3857:1: ( ( rule__Textfield__DescriptionAssignment_3_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3858:1: ( rule__Textfield__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionAssignment_3_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3859:1: ( rule__Textfield__DescriptionAssignment_3_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3859:2: rule__Textfield__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Textfield__DescriptionAssignment_3_1_in_rule__Textfield__Group_3__1__Impl7681);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3874:1: rule__Model__ActivitiesAssignment_0 : ( ruleActivity ) ;
    public final void rule__Model__ActivitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3878:1: ( ( ruleActivity ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3879:1: ( ruleActivity )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3879:1: ( ruleActivity )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3880:1: ruleActivity
            {
             before(grammarAccess.getModelAccess().getActivitiesActivityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleActivity_in_rule__Model__ActivitiesAssignment_07720);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3889:1: rule__Model__RolesAssignment_1 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3893:1: ( ( ruleRole ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3894:1: ( ruleRole )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3894:1: ( ruleRole )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3895:1: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Model__RolesAssignment_17751);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3904:1: rule__Model__WorkProductsAssignment_2 : ( ruleWorkProduct ) ;
    public final void rule__Model__WorkProductsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3908:1: ( ( ruleWorkProduct ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3909:1: ( ruleWorkProduct )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3909:1: ( ruleWorkProduct )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3910:1: ruleWorkProduct
            {
             before(grammarAccess.getModelAccess().getWorkProductsWorkProductParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWorkProduct_in_rule__Model__WorkProductsAssignment_27782);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3919:1: rule__Model__WorkProductTypesAssignment_3 : ( ruleWorkProductType ) ;
    public final void rule__Model__WorkProductTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3923:1: ( ( ruleWorkProductType ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3924:1: ( ruleWorkProductType )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3924:1: ( ruleWorkProductType )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3925:1: ruleWorkProductType
            {
             before(grammarAccess.getModelAccess().getWorkProductTypesWorkProductTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWorkProductType_in_rule__Model__WorkProductTypesAssignment_37813);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3934:1: rule__Model__GuidancesAssignment_4 : ( ruleGuidance ) ;
    public final void rule__Model__GuidancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3938:1: ( ( ruleGuidance ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3939:1: ( ruleGuidance )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3939:1: ( ruleGuidance )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3940:1: ruleGuidance
            {
             before(grammarAccess.getModelAccess().getGuidancesGuidanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleGuidance_in_rule__Model__GuidancesAssignment_47844);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3949:1: rule__Model__GuidanceTypesAssignment_5 : ( ruleGuidanceType ) ;
    public final void rule__Model__GuidanceTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3953:1: ( ( ruleGuidanceType ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3954:1: ( ruleGuidanceType )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3954:1: ( ruleGuidanceType )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3955:1: ruleGuidanceType
            {
             before(grammarAccess.getModelAccess().getGuidanceTypesGuidanceTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleGuidanceType_in_rule__Model__GuidanceTypesAssignment_57875);
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


    // $ANTLR start "rule__Role__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3964:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3968:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3969:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3969:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3970:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17906); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3979:1: rule__Role__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__Role__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3983:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3984:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3984:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3985:1: ruleTextfield
            {
             before(grammarAccess.getRoleAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Role__TextfieldAssignment_27937);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3994:1: rule__WorkProductType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkProductType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3998:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3999:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3999:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4000:1: RULE_ID
            {
             before(grammarAccess.getWorkProductTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProductType__NameAssignment_17968); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4009:1: rule__WorkProductType__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__WorkProductType__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4013:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4014:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4014:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4015:1: ruleTextfield
            {
             before(grammarAccess.getWorkProductTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__WorkProductType__TextfieldAssignment_27999);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4024:1: rule__WorkProduct__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkProduct__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4028:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4029:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4029:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4030:1: RULE_ID
            {
             before(grammarAccess.getWorkProductAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProduct__NameAssignment_18030); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4039:1: rule__WorkProduct__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkProduct__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4043:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4044:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4044:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4045:1: ( RULE_ID )
            {
             before(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4046:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4047:1: RULE_ID
            {
             before(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProduct__TypeAssignment_38065); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4058:1: rule__WorkProduct__TextfieldAssignment_4 : ( ruleTextfield ) ;
    public final void rule__WorkProduct__TextfieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4062:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4063:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4063:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4064:1: ruleTextfield
            {
             before(grammarAccess.getWorkProductAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__WorkProduct__TextfieldAssignment_48100);
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


    // $ANTLR start "rule__WorkProduct__StatesAssignment_5_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4073:1: rule__WorkProduct__StatesAssignment_5_1 : ( ruleState ) ;
    public final void rule__WorkProduct__StatesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4077:1: ( ( ruleState ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4078:1: ( ruleState )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4078:1: ( ruleState )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4079:1: ruleState
            {
             before(grammarAccess.getWorkProductAccess().getStatesStateParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__WorkProduct__StatesAssignment_5_18131);
            ruleState();

            state._fsp--;

             after(grammarAccess.getWorkProductAccess().getStatesStateParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__WorkProduct__StatesAssignment_5_1"


    // $ANTLR start "rule__WorkProduct__StatesAssignment_5_2_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4088:1: rule__WorkProduct__StatesAssignment_5_2_1 : ( ruleState ) ;
    public final void rule__WorkProduct__StatesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4092:1: ( ( ruleState ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4093:1: ( ruleState )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4093:1: ( ruleState )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4094:1: ruleState
            {
             before(grammarAccess.getWorkProductAccess().getStatesStateParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__WorkProduct__StatesAssignment_5_2_18162);
            ruleState();

            state._fsp--;

             after(grammarAccess.getWorkProductAccess().getStatesStateParserRuleCall_5_2_1_0()); 

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
    // $ANTLR end "rule__WorkProduct__StatesAssignment_5_2_1"


    // $ANTLR start "rule__GuidanceType__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4103:1: rule__GuidanceType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GuidanceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4107:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4108:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4108:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4109:1: RULE_ID
            {
             before(grammarAccess.getGuidanceTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GuidanceType__NameAssignment_18193); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4118:1: rule__GuidanceType__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__GuidanceType__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4122:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4123:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4123:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4124:1: ruleTextfield
            {
             before(grammarAccess.getGuidanceTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__GuidanceType__TextfieldAssignment_28224);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4133:1: rule__Guidance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Guidance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4137:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4138:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4138:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4139:1: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guidance__NameAssignment_18255); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4148:1: rule__Guidance__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4152:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4153:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4153:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4154:1: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4155:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4156:1: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guidance__TypeAssignment_38290); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4167:1: rule__Guidance__TextfieldAssignment_4 : ( ruleTextfield ) ;
    public final void rule__Guidance__TextfieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4171:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4172:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4172:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4173:1: ruleTextfield
            {
             before(grammarAccess.getGuidanceAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Guidance__TextfieldAssignment_48325);
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


    // $ANTLR start "rule__State__NameAssignment"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4182:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4186:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4187:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4187:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4188:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment8356); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__State__NameAssignment"


    // $ANTLR start "rule__Port__TypeAssignment_0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4197:1: rule__Port__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Port__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4201:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4202:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4202:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4203:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getTypeWorkProductCrossReference_0_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4204:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4205:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getTypeWorkProductIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__TypeAssignment_08391); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4216:1: rule__Port__StateAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Port__StateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4220:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4221:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4221:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4222:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getStateStateCrossReference_1_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4223:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4224:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getStateStateIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__StateAssignment_1_18430); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4235:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4239:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4240:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4240:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4241:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_18465); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4250:1: rule__Activity__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__Activity__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4254:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4255:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4255:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4256:1: ruleTextfield
            {
             before(grammarAccess.getActivityAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Activity__TextfieldAssignment_28496);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4265:1: rule__Activity__RoleAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__RoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4269:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4270:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4270:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4271:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getRoleRoleCrossReference_4_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4272:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4273:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getRoleRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__RoleAssignment_48531); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4284:1: rule__Activity__InPortsAssignment_5_1 : ( rulePort ) ;
    public final void rule__Activity__InPortsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4288:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4289:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4289:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4290:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_18566);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4299:1: rule__Activity__InPortsAssignment_5_2_1 : ( rulePort ) ;
    public final void rule__Activity__InPortsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4303:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4304:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4304:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4305:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_2_18597);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4314:1: rule__Activity__OutPortsAssignment_6_1 : ( rulePort ) ;
    public final void rule__Activity__OutPortsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4318:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4319:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4319:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4320:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_18628);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4329:1: rule__Activity__OutPortsAssignment_6_2_1 : ( rulePort ) ;
    public final void rule__Activity__OutPortsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4333:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4334:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4334:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4335:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_2_18659);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4344:1: rule__Activity__SubActivitiesAssignment_7_1 : ( ruleActivityRef ) ;
    public final void rule__Activity__SubActivitiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4348:1: ( ( ruleActivityRef ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4349:1: ( ruleActivityRef )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4349:1: ( ruleActivityRef )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4350:1: ruleActivityRef
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_18690);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4359:1: rule__Activity__SubActivitiesAssignment_7_2_1 : ( ruleActivityRef ) ;
    public final void rule__Activity__SubActivitiesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4363:1: ( ( ruleActivityRef ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4364:1: ( ruleActivityRef )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4364:1: ( ruleActivityRef )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4365:1: ruleActivityRef
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_2_18721);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4374:1: rule__Activity__GuidancesAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__GuidancesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4378:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4379:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4379:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4380:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4381:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4382:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_18756); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4393:1: rule__Activity__GuidancesAssignment_8_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__GuidancesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4397:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4398:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4398:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4399:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_2_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4400:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4401:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_2_18795); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4412:1: rule__Activity__StepsAssignment_9_2_0 : ( ruleStep ) ;
    public final void rule__Activity__StepsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4416:1: ( ( ruleStep ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4417:1: ( ruleStep )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4417:1: ( ruleStep )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4418:1: ruleStep
            {
             before(grammarAccess.getActivityAccess().getStepsStepParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Activity__StepsAssignment_9_2_08830);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4427:1: rule__Activity__DecisionsAssignment_9_2_1 : ( ruleDecision ) ;
    public final void rule__Activity__DecisionsAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4431:1: ( ( ruleDecision ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4432:1: ( ruleDecision )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4432:1: ( ruleDecision )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4433:1: ruleDecision
            {
             before(grammarAccess.getActivityAccess().getDecisionsDecisionParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_ruleDecision_in_rule__Activity__DecisionsAssignment_9_2_18861);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4442:1: rule__Activity__TransitionsAssignment_9_2_2 : ( ruleTransition ) ;
    public final void rule__Activity__TransitionsAssignment_9_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4446:1: ( ( ruleTransition ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4447:1: ( ruleTransition )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4447:1: ( ruleTransition )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4448:1: ruleTransition
            {
             before(grammarAccess.getActivityAccess().getTransitionsTransitionParserRuleCall_9_2_2_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__Activity__TransitionsAssignment_9_2_28892);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4457:1: rule__ActivityRef__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ActivityRef__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4461:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4462:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4462:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4463:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityRefAccess().getTypeActivityCrossReference_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4464:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4465:1: RULE_ID
            {
             before(grammarAccess.getActivityRefAccess().getTypeActivityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityRef__TypeAssignment8927); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4476:1: rule__Decision__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decision__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4480:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4481:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4481:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4482:1: RULE_ID
            {
             before(grammarAccess.getDecisionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decision__NameAssignment_18962); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4491:1: rule__Decision__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Decision__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4495:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4496:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4496:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4497:1: RULE_STRING
            {
             before(grammarAccess.getDecisionAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Decision__LabelAssignment_28993); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4506:1: rule__Step__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Step__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4510:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4511:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4511:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4512:1: RULE_ID
            {
             before(grammarAccess.getStepAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Step__NameAssignment_19024); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4521:1: rule__Step__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Step__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4525:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4526:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4526:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4527:1: RULE_STRING
            {
             before(grammarAccess.getStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Step__LabelAssignment_29055); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4536:1: rule__InitialTransition__ToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InitialTransition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4540:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4541:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4541:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4542:1: ( RULE_ID )
            {
             before(grammarAccess.getInitialTransitionAccess().getToNodeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4543:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4544:1: RULE_ID
            {
             before(grammarAccess.getInitialTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InitialTransition__ToAssignment_39090); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4555:1: rule__FinalTransition__FromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FinalTransition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4559:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4560:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4560:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4561:1: ( RULE_ID )
            {
             before(grammarAccess.getFinalTransitionAccess().getFromNodeCrossReference_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4562:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4563:1: RULE_ID
            {
             before(grammarAccess.getFinalTransitionAccess().getFromNodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FinalTransition__FromAssignment_19129); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4574:1: rule__DecisionTransition__FromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DecisionTransition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4578:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4579:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4579:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4580:1: ( RULE_ID )
            {
             before(grammarAccess.getDecisionTransitionAccess().getFromDecisionCrossReference_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4581:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4582:1: RULE_ID
            {
             before(grammarAccess.getDecisionTransitionAccess().getFromDecisionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DecisionTransition__FromAssignment_19168); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4593:1: rule__DecisionTransition__ToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DecisionTransition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4597:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4598:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4598:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4599:1: ( RULE_ID )
            {
             before(grammarAccess.getDecisionTransitionAccess().getToNodeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4600:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4601:1: RULE_ID
            {
             before(grammarAccess.getDecisionTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DecisionTransition__ToAssignment_39207); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4612:1: rule__DecisionTransition__GuardAssignment_4 : ( RULE_STRING ) ;
    public final void rule__DecisionTransition__GuardAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4616:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4617:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4617:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4618:1: RULE_STRING
            {
             before(grammarAccess.getDecisionTransitionAccess().getGuardSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecisionTransition__GuardAssignment_49242); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4627:1: rule__NonInitialTransition__FromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NonInitialTransition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4631:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4632:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4632:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4633:1: ( RULE_ID )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromNodeCrossReference_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4634:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4635:1: RULE_ID
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromNodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonInitialTransition__FromAssignment_19277); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4646:1: rule__NonInitialTransition__ToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__NonInitialTransition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4650:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4651:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4651:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4652:1: ( RULE_ID )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToNodeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4653:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4654:1: RULE_ID
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonInitialTransition__ToAssignment_39316); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4665:1: rule__Textfield__LabelAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Textfield__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4669:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4670:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4670:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4671:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getLabelSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__LabelAssignment_0_19351); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4680:1: rule__Textfield__SummaryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Textfield__SummaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4684:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4685:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4685:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4686:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getSummarySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__SummaryAssignment_29382); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4695:1: rule__Textfield__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Textfield__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4699:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4700:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4700:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4701:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__DescriptionAssignment_3_19413); 
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
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x00000000004C6802L});
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
    public static final BitSet FOLLOW_rule__State__NameAssignment_in_ruleState457 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Activity__StepsAssignment_9_2_0_in_rule__Activity__Alternatives_9_21279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DecisionsAssignment_9_2_1_in_rule__Activity__Alternatives_9_21297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__TransitionsAssignment_9_2_2_in_rule__Activity__Alternatives_9_21315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_rule__Transition__Alternatives1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_rule__Transition__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_rule__Transition__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecisionTransition_in_rule__Transition__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__01430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__01433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Role__Group__0__Impl1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__11492 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__21552 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__21555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__TextfieldAssignment_2_in_rule__Role__Group__2__Impl1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__31612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Role__Group__3__Impl1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__0__Impl_in_rule__WorkProductType__Group__01679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__1_in_rule__WorkProductType__Group__01682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WorkProductType__Group__0__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__1__Impl_in_rule__WorkProductType__Group__11741 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__2_in_rule__WorkProductType__Group__11744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__NameAssignment_1_in_rule__WorkProductType__Group__1__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__2__Impl_in_rule__WorkProductType__Group__21801 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__3_in_rule__WorkProductType__Group__21804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__TextfieldAssignment_2_in_rule__WorkProductType__Group__2__Impl1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__3__Impl_in_rule__WorkProductType__Group__31861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkProductType__Group__3__Impl1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__0__Impl_in_rule__WorkProduct__Group__01928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__1_in_rule__WorkProduct__Group__01931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WorkProduct__Group__0__Impl1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__1__Impl_in_rule__WorkProduct__Group__11990 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__2_in_rule__WorkProduct__Group__11993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__NameAssignment_1_in_rule__WorkProduct__Group__1__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__2__Impl_in_rule__WorkProduct__Group__22050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__3_in_rule__WorkProduct__Group__22053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WorkProduct__Group__2__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__3__Impl_in_rule__WorkProduct__Group__32112 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__4_in_rule__WorkProduct__Group__32115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__TypeAssignment_3_in_rule__WorkProduct__Group__3__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__4__Impl_in_rule__WorkProduct__Group__42172 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__5_in_rule__WorkProduct__Group__42175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__TextfieldAssignment_4_in_rule__WorkProduct__Group__4__Impl2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__5__Impl_in_rule__WorkProduct__Group__52232 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__6_in_rule__WorkProduct__Group__52235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__0_in_rule__WorkProduct__Group__5__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__6__Impl_in_rule__WorkProduct__Group__62293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkProduct__Group__6__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__0__Impl_in_rule__WorkProduct__Group_5__02366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__1_in_rule__WorkProduct__Group_5__02369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WorkProduct__Group_5__0__Impl2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__1__Impl_in_rule__WorkProduct__Group_5__12428 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__2_in_rule__WorkProduct__Group_5__12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__StatesAssignment_5_1_in_rule__WorkProduct__Group_5__1__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__2__Impl_in_rule__WorkProduct__Group_5__22488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5_2__0_in_rule__WorkProduct__Group_5__2__Impl2515 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5_2__0__Impl_in_rule__WorkProduct__Group_5_2__02552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5_2__1_in_rule__WorkProduct__Group_5_2__02555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WorkProduct__Group_5_2__0__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5_2__1__Impl_in_rule__WorkProduct__Group_5_2__12614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__StatesAssignment_5_2_1_in_rule__WorkProduct__Group_5_2__1__Impl2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__0__Impl_in_rule__GuidanceType__Group__02675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__1_in_rule__GuidanceType__Group__02678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GuidanceType__Group__0__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__1__Impl_in_rule__GuidanceType__Group__12737 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__2_in_rule__GuidanceType__Group__12740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__NameAssignment_1_in_rule__GuidanceType__Group__1__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__2__Impl_in_rule__GuidanceType__Group__22797 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__3_in_rule__GuidanceType__Group__22800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__TextfieldAssignment_2_in_rule__GuidanceType__Group__2__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__3__Impl_in_rule__GuidanceType__Group__32857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GuidanceType__Group__3__Impl2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Guidance__Group__0__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__12986 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__12989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__NameAssignment_1_in_rule__Guidance__Group__1__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__23046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guidance__Group__3_in_rule__Guidance__Group__23049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Guidance__Group__2__Impl3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__3__Impl_in_rule__Guidance__Group__33108 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__4_in_rule__Guidance__Group__33111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TypeAssignment_3_in_rule__Guidance__Group__3__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__4__Impl_in_rule__Guidance__Group__43168 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__5_in_rule__Guidance__Group__43171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TextfieldAssignment_4_in_rule__Guidance__Group__4__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__5__Impl_in_rule__Guidance__Group__53228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Guidance__Group__5__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03299 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__TypeAssignment_0_in_rule__Port__Group__0__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__0_in_rule__Port__Group__1__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__0__Impl_in_rule__Port__Group_1__03421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group_1__1_in_rule__Port__Group_1__03424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Port__Group_1__0__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__1__Impl_in_rule__Port__Group_1__13483 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Port__Group_1__2_in_rule__Port__Group_1__13486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__StateAssignment_1_1_in_rule__Port__Group_1__1__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__2__Impl_in_rule__Port__Group_1__23543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Port__Group_1__2__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Activity__Group__0__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13670 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23730 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__TextfieldAssignment_2_in_rule__Activity__Group__2__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Activity__Group__3__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43852 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__RoleAssignment_4_in_rule__Activity__Group__4__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__53912 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__53915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63973 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__74034 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__74037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__84095 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__84098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__94156 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__94159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__104217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Activity__Group__10__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__04298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__04301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group_5__0__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__14360 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__14363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InPortsAssignment_5_1_in_rule__Activity__Group_5__1__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__24420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__Group_5__2__Impl4447 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__04484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__04487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Activity__Group_5_2__0__Impl4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__14546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InPortsAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__04607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__04610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Activity__Group_6__0__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__14669 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__14672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OutPortsAssignment_6_1_in_rule__Activity__Group_6__1__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__24729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__Group_6__2__Impl4756 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__04793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__04796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Activity__Group_6_2__0__Impl4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__14855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OutPortsAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__04916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__04919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group_7__0__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__14978 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__2_in_rule__Activity__Group_7__14981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SubActivitiesAssignment_7_1_in_rule__Activity__Group_7__1__Impl5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__2__Impl_in_rule__Activity__Group_7__25038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__Group_7__2__Impl5065 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__05102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__05105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Activity__Group_7_2__0__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__15164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SubActivitiesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__05225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__05228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group_8__0__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__15287 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__15290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__GuidancesAssignment_8_1_in_rule__Activity__Group_8__1__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__25347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__0_in_rule__Activity__Group_8__2__Impl5374 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__0__Impl_in_rule__Activity__Group_8_2__05411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__1_in_rule__Activity__Group_8_2__05414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Activity__Group_8_2__0__Impl5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__1__Impl_in_rule__Activity__Group_8_2__15473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__GuidancesAssignment_8_2_1_in_rule__Activity__Group_8_2__1__Impl5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__05534 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__05537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Activity__Group_9__0__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__15596 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__15599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Activity__Group_9__1__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__25658 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__3_in_rule__Activity__Group_9__25661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_9_2_in_rule__Activity__Group_9__2__Impl5688 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__3__Impl_in_rule__Activity__Group_9__35719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Activity__Group_9__3__Impl5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__0__Impl_in_rule__Decision__Group__05786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decision__Group__1_in_rule__Decision__Group__05789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Decision__Group__0__Impl5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__1__Impl_in_rule__Decision__Group__15848 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Decision__Group__2_in_rule__Decision__Group__15851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__NameAssignment_1_in_rule__Decision__Group__1__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__2__Impl_in_rule__Decision__Group__25908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__LabelAssignment_2_in_rule__Decision__Group__2__Impl5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__05972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Step__Group__1_in_rule__Step__Group__05975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Step__Group__0__Impl6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__16034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Step__Group__2_in_rule__Step__Group__16037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__NameAssignment_1_in_rule__Step__Group__1__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__26094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__LabelAssignment_2_in_rule__Step__Group__2__Impl6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__0__Impl_in_rule__InitialTransition__Group__06158 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__1_in_rule__InitialTransition__Group__06161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InitialTransition__Group__0__Impl6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__1__Impl_in_rule__InitialTransition__Group__16220 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__2_in_rule__InitialTransition__Group__16223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InitialTransition__Group__1__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__2__Impl_in_rule__InitialTransition__Group__26282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__3_in_rule__InitialTransition__Group__26285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InitialTransition__Group__2__Impl6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__3__Impl_in_rule__InitialTransition__Group__36344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__ToAssignment_3_in_rule__InitialTransition__Group__3__Impl6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__0__Impl_in_rule__FinalTransition__Group__06409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__1_in_rule__FinalTransition__Group__06412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FinalTransition__Group__0__Impl6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__1__Impl_in_rule__FinalTransition__Group__16471 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__2_in_rule__FinalTransition__Group__16474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__FromAssignment_1_in_rule__FinalTransition__Group__1__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__2__Impl_in_rule__FinalTransition__Group__26531 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__3_in_rule__FinalTransition__Group__26534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FinalTransition__Group__2__Impl6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__3__Impl_in_rule__FinalTransition__Group__36593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FinalTransition__Group__3__Impl6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__0__Impl_in_rule__DecisionTransition__Group__06660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__1_in_rule__DecisionTransition__Group__06663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DecisionTransition__Group__0__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__1__Impl_in_rule__DecisionTransition__Group__16722 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__2_in_rule__DecisionTransition__Group__16725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__FromAssignment_1_in_rule__DecisionTransition__Group__1__Impl6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__2__Impl_in_rule__DecisionTransition__Group__26782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__3_in_rule__DecisionTransition__Group__26785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DecisionTransition__Group__2__Impl6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__3__Impl_in_rule__DecisionTransition__Group__36844 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__4_in_rule__DecisionTransition__Group__36847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__ToAssignment_3_in_rule__DecisionTransition__Group__3__Impl6874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__4__Impl_in_rule__DecisionTransition__Group__46904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__GuardAssignment_4_in_rule__DecisionTransition__Group__4__Impl6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__0__Impl_in_rule__NonInitialTransition__Group__06971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__1_in_rule__NonInitialTransition__Group__06974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NonInitialTransition__Group__0__Impl7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__1__Impl_in_rule__NonInitialTransition__Group__17033 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__2_in_rule__NonInitialTransition__Group__17036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__FromAssignment_1_in_rule__NonInitialTransition__Group__1__Impl7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__2__Impl_in_rule__NonInitialTransition__Group__27093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__3_in_rule__NonInitialTransition__Group__27096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NonInitialTransition__Group__2__Impl7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__3__Impl_in_rule__NonInitialTransition__Group__37155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__ToAssignment_3_in_rule__NonInitialTransition__Group__3__Impl7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__0__Impl_in_rule__Textfield__Group__07220 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Textfield__Group__1_in_rule__Textfield__Group__07223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__0_in_rule__Textfield__Group__0__Impl7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__1__Impl_in_rule__Textfield__Group__17281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group__2_in_rule__Textfield__Group__17284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Textfield__Group__1__Impl7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__2__Impl_in_rule__Textfield__Group__27343 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Textfield__Group__3_in_rule__Textfield__Group__27346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__SummaryAssignment_2_in_rule__Textfield__Group__2__Impl7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__3__Impl_in_rule__Textfield__Group__37403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__0_in_rule__Textfield__Group__3__Impl7430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__0__Impl_in_rule__Textfield__Group_0__07469 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__1_in_rule__Textfield__Group_0__07472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Textfield__Group_0__0__Impl7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__1__Impl_in_rule__Textfield__Group_0__17531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__LabelAssignment_0_1_in_rule__Textfield__Group_0__1__Impl7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__0__Impl_in_rule__Textfield__Group_3__07592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__1_in_rule__Textfield__Group_3__07595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Textfield__Group_3__0__Impl7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__1__Impl_in_rule__Textfield__Group_3__17654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__DescriptionAssignment_3_1_in_rule__Textfield__Group_3__1__Impl7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Model__ActivitiesAssignment_07720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Model__RolesAssignment_17751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_rule__Model__WorkProductsAssignment_27782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_rule__Model__WorkProductTypesAssignment_37813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_rule__Model__GuidancesAssignment_47844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_rule__Model__GuidanceTypesAssignment_57875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Role__TextfieldAssignment_27937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProductType__NameAssignment_17968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__WorkProductType__TextfieldAssignment_27999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProduct__NameAssignment_18030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProduct__TypeAssignment_38065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__WorkProduct__TextfieldAssignment_48100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__WorkProduct__StatesAssignment_5_18131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__WorkProduct__StatesAssignment_5_2_18162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GuidanceType__NameAssignment_18193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__GuidanceType__TextfieldAssignment_28224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guidance__NameAssignment_18255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guidance__TypeAssignment_38290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Guidance__TextfieldAssignment_48325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment8356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__TypeAssignment_08391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__StateAssignment_1_18430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_18465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Activity__TextfieldAssignment_28496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__RoleAssignment_48531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_18566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_2_18597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_18628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_2_18659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_18690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_2_18721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_18756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_2_18795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Activity__StepsAssignment_9_2_08830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecision_in_rule__Activity__DecisionsAssignment_9_2_18861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Activity__TransitionsAssignment_9_2_28892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityRef__TypeAssignment8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decision__NameAssignment_18962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Decision__LabelAssignment_28993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Step__NameAssignment_19024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Step__LabelAssignment_29055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InitialTransition__ToAssignment_39090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FinalTransition__FromAssignment_19129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DecisionTransition__FromAssignment_19168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DecisionTransition__ToAssignment_39207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecisionTransition__GuardAssignment_49242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonInitialTransition__FromAssignment_19277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonInitialTransition__ToAssignment_39316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__LabelAssignment_0_19351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__SummaryAssignment_29382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__DescriptionAssignment_3_19413 = new BitSet(new long[]{0x0000000000000002L});

}