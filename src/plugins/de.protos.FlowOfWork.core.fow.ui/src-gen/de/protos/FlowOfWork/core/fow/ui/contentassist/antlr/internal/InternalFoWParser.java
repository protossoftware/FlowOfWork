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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Role'", "';'", "'WorkProductType'", "'WorkProduct'", "':'", "'states'", "','", "'GuidanceType'", "'Guidance'", "'('", "')'", "'Activity'", "'responsible'", "'inputs'", "'outputs'", "'subActivities'", "'guidances'", "'Behavior'", "'{'", "'}'", "'Decision'", "'Step'", "'Transition'", "'initial'", "'to'", "'final'", "'summary'", "'label'", "'description'", "'link'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
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


    // $ANTLR start "entryRuleLink"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:568:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:569:1: ( ruleLink EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:570:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1146);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1153); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:577:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:581:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:582:1: ( ( rule__Link__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:582:1: ( ( rule__Link__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:583:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:584:1: ( rule__Link__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:584:2: rule__Link__Group__0
            {
            pushFollow(FOLLOW_rule__Link__Group__0_in_ruleLink1179);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "rule__Model__Alternatives"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:596:1: rule__Model__Alternatives : ( ( ( rule__Model__ActivitiesAssignment_0 ) ) | ( ( rule__Model__RolesAssignment_1 ) ) | ( ( rule__Model__WorkProductsAssignment_2 ) ) | ( ( rule__Model__WorkProductTypesAssignment_3 ) ) | ( ( rule__Model__GuidancesAssignment_4 ) ) | ( ( rule__Model__GuidanceTypesAssignment_5 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:600:1: ( ( ( rule__Model__ActivitiesAssignment_0 ) ) | ( ( rule__Model__RolesAssignment_1 ) ) | ( ( rule__Model__WorkProductsAssignment_2 ) ) | ( ( rule__Model__WorkProductTypesAssignment_3 ) ) | ( ( rule__Model__GuidancesAssignment_4 ) ) | ( ( rule__Model__GuidanceTypesAssignment_5 ) ) )
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
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:601:1: ( ( rule__Model__ActivitiesAssignment_0 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:601:1: ( ( rule__Model__ActivitiesAssignment_0 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:602:1: ( rule__Model__ActivitiesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getActivitiesAssignment_0()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:603:1: ( rule__Model__ActivitiesAssignment_0 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:603:2: rule__Model__ActivitiesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__ActivitiesAssignment_0_in_rule__Model__Alternatives1215);
                    rule__Model__ActivitiesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getActivitiesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:607:6: ( ( rule__Model__RolesAssignment_1 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:607:6: ( ( rule__Model__RolesAssignment_1 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:608:1: ( rule__Model__RolesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getRolesAssignment_1()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:609:1: ( rule__Model__RolesAssignment_1 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:609:2: rule__Model__RolesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__RolesAssignment_1_in_rule__Model__Alternatives1233);
                    rule__Model__RolesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getRolesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:613:6: ( ( rule__Model__WorkProductsAssignment_2 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:613:6: ( ( rule__Model__WorkProductsAssignment_2 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:614:1: ( rule__Model__WorkProductsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getWorkProductsAssignment_2()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:615:1: ( rule__Model__WorkProductsAssignment_2 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:615:2: rule__Model__WorkProductsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__WorkProductsAssignment_2_in_rule__Model__Alternatives1251);
                    rule__Model__WorkProductsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getWorkProductsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:619:6: ( ( rule__Model__WorkProductTypesAssignment_3 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:619:6: ( ( rule__Model__WorkProductTypesAssignment_3 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:620:1: ( rule__Model__WorkProductTypesAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getWorkProductTypesAssignment_3()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:621:1: ( rule__Model__WorkProductTypesAssignment_3 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:621:2: rule__Model__WorkProductTypesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__WorkProductTypesAssignment_3_in_rule__Model__Alternatives1269);
                    rule__Model__WorkProductTypesAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getWorkProductTypesAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:625:6: ( ( rule__Model__GuidancesAssignment_4 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:625:6: ( ( rule__Model__GuidancesAssignment_4 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:626:1: ( rule__Model__GuidancesAssignment_4 )
                    {
                     before(grammarAccess.getModelAccess().getGuidancesAssignment_4()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:627:1: ( rule__Model__GuidancesAssignment_4 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:627:2: rule__Model__GuidancesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__GuidancesAssignment_4_in_rule__Model__Alternatives1287);
                    rule__Model__GuidancesAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGuidancesAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:631:6: ( ( rule__Model__GuidanceTypesAssignment_5 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:631:6: ( ( rule__Model__GuidanceTypesAssignment_5 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:632:1: ( rule__Model__GuidanceTypesAssignment_5 )
                    {
                     before(grammarAccess.getModelAccess().getGuidanceTypesAssignment_5()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:633:1: ( rule__Model__GuidanceTypesAssignment_5 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:633:2: rule__Model__GuidanceTypesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Model__GuidanceTypesAssignment_5_in_rule__Model__Alternatives1305);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:643:1: rule__Activity__Alternatives_9_2 : ( ( ( rule__Activity__StepsAssignment_9_2_0 ) ) | ( ( rule__Activity__DecisionsAssignment_9_2_1 ) ) | ( ( rule__Activity__TransitionsAssignment_9_2_2 ) ) );
    public final void rule__Activity__Alternatives_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:647:1: ( ( ( rule__Activity__StepsAssignment_9_2_0 ) ) | ( ( rule__Activity__DecisionsAssignment_9_2_1 ) ) | ( ( rule__Activity__TransitionsAssignment_9_2_2 ) ) )
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
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:648:1: ( ( rule__Activity__StepsAssignment_9_2_0 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:648:1: ( ( rule__Activity__StepsAssignment_9_2_0 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:649:1: ( rule__Activity__StepsAssignment_9_2_0 )
                    {
                     before(grammarAccess.getActivityAccess().getStepsAssignment_9_2_0()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:650:1: ( rule__Activity__StepsAssignment_9_2_0 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:650:2: rule__Activity__StepsAssignment_9_2_0
                    {
                    pushFollow(FOLLOW_rule__Activity__StepsAssignment_9_2_0_in_rule__Activity__Alternatives_9_21339);
                    rule__Activity__StepsAssignment_9_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getStepsAssignment_9_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:654:6: ( ( rule__Activity__DecisionsAssignment_9_2_1 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:654:6: ( ( rule__Activity__DecisionsAssignment_9_2_1 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:655:1: ( rule__Activity__DecisionsAssignment_9_2_1 )
                    {
                     before(grammarAccess.getActivityAccess().getDecisionsAssignment_9_2_1()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:656:1: ( rule__Activity__DecisionsAssignment_9_2_1 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:656:2: rule__Activity__DecisionsAssignment_9_2_1
                    {
                    pushFollow(FOLLOW_rule__Activity__DecisionsAssignment_9_2_1_in_rule__Activity__Alternatives_9_21357);
                    rule__Activity__DecisionsAssignment_9_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getDecisionsAssignment_9_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:660:6: ( ( rule__Activity__TransitionsAssignment_9_2_2 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:660:6: ( ( rule__Activity__TransitionsAssignment_9_2_2 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:661:1: ( rule__Activity__TransitionsAssignment_9_2_2 )
                    {
                     before(grammarAccess.getActivityAccess().getTransitionsAssignment_9_2_2()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:662:1: ( rule__Activity__TransitionsAssignment_9_2_2 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:662:2: rule__Activity__TransitionsAssignment_9_2_2
                    {
                    pushFollow(FOLLOW_rule__Activity__TransitionsAssignment_9_2_2_in_rule__Activity__Alternatives_9_21375);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:672:1: rule__Transition__Alternatives : ( ( ruleInitialTransition ) | ( ruleFinalTransition ) | ( ruleNonInitialTransition ) | ( ruleDecisionTransition ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:676:1: ( ( ruleInitialTransition ) | ( ruleFinalTransition ) | ( ruleNonInitialTransition ) | ( ruleDecisionTransition ) )
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
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:677:1: ( ruleInitialTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:677:1: ( ruleInitialTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:678:1: ruleInitialTransition
                    {
                     before(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInitialTransition_in_rule__Transition__Alternatives1409);
                    ruleInitialTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:683:6: ( ruleFinalTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:683:6: ( ruleFinalTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:684:1: ruleFinalTransition
                    {
                     before(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFinalTransition_in_rule__Transition__Alternatives1426);
                    ruleFinalTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:689:6: ( ruleNonInitialTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:689:6: ( ruleNonInitialTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:690:1: ruleNonInitialTransition
                    {
                     before(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNonInitialTransition_in_rule__Transition__Alternatives1443);
                    ruleNonInitialTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:695:6: ( ruleDecisionTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:695:6: ( ruleDecisionTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:696:1: ruleDecisionTransition
                    {
                     before(grammarAccess.getTransitionAccess().getDecisionTransitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDecisionTransition_in_rule__Transition__Alternatives1460);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:708:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:712:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:713:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__01490);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__01493);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:720:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:724:1: ( ( 'Role' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:725:1: ( 'Role' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:725:1: ( 'Role' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:726:1: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Role__Group__0__Impl1521); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:739:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:743:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:744:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__11552);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__11555);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:751:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:755:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:756:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:756:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:757:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:758:1: ( rule__Role__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:758:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl1582);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:768:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:772:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:773:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__21612);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__21615);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:780:1: rule__Role__Group__2__Impl : ( ( rule__Role__TextfieldAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:784:1: ( ( ( rule__Role__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:785:1: ( ( rule__Role__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:785:1: ( ( rule__Role__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:786:1: ( rule__Role__TextfieldAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:787:1: ( rule__Role__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:787:2: rule__Role__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__Role__TextfieldAssignment_2_in_rule__Role__Group__2__Impl1642);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:797:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:801:1: ( rule__Role__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:802:2: rule__Role__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__31672);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:808:1: rule__Role__Group__3__Impl : ( ';' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:812:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:813:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:813:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:814:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Role__Group__3__Impl1700); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:835:1: rule__WorkProductType__Group__0 : rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1 ;
    public final void rule__WorkProductType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:839:1: ( rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:840:2: rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__0__Impl_in_rule__WorkProductType__Group__01739);
            rule__WorkProductType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__1_in_rule__WorkProductType__Group__01742);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:847:1: rule__WorkProductType__Group__0__Impl : ( 'WorkProductType' ) ;
    public final void rule__WorkProductType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:851:1: ( ( 'WorkProductType' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:852:1: ( 'WorkProductType' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:852:1: ( 'WorkProductType' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:853:1: 'WorkProductType'
            {
             before(grammarAccess.getWorkProductTypeAccess().getWorkProductTypeKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__WorkProductType__Group__0__Impl1770); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:866:1: rule__WorkProductType__Group__1 : rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2 ;
    public final void rule__WorkProductType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:870:1: ( rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:871:2: rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__1__Impl_in_rule__WorkProductType__Group__11801);
            rule__WorkProductType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__2_in_rule__WorkProductType__Group__11804);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:878:1: rule__WorkProductType__Group__1__Impl : ( ( rule__WorkProductType__NameAssignment_1 ) ) ;
    public final void rule__WorkProductType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:882:1: ( ( ( rule__WorkProductType__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:883:1: ( ( rule__WorkProductType__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:883:1: ( ( rule__WorkProductType__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:884:1: ( rule__WorkProductType__NameAssignment_1 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:885:1: ( rule__WorkProductType__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:885:2: rule__WorkProductType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkProductType__NameAssignment_1_in_rule__WorkProductType__Group__1__Impl1831);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:895:1: rule__WorkProductType__Group__2 : rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3 ;
    public final void rule__WorkProductType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:899:1: ( rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:900:2: rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__2__Impl_in_rule__WorkProductType__Group__21861);
            rule__WorkProductType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__3_in_rule__WorkProductType__Group__21864);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:907:1: rule__WorkProductType__Group__2__Impl : ( ( rule__WorkProductType__TextfieldAssignment_2 ) ) ;
    public final void rule__WorkProductType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:911:1: ( ( ( rule__WorkProductType__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:912:1: ( ( rule__WorkProductType__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:912:1: ( ( rule__WorkProductType__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:913:1: ( rule__WorkProductType__TextfieldAssignment_2 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:914:1: ( rule__WorkProductType__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:914:2: rule__WorkProductType__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__WorkProductType__TextfieldAssignment_2_in_rule__WorkProductType__Group__2__Impl1891);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:924:1: rule__WorkProductType__Group__3 : rule__WorkProductType__Group__3__Impl ;
    public final void rule__WorkProductType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:928:1: ( rule__WorkProductType__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:929:2: rule__WorkProductType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__3__Impl_in_rule__WorkProductType__Group__31921);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:935:1: rule__WorkProductType__Group__3__Impl : ( ';' ) ;
    public final void rule__WorkProductType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:939:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:940:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:940:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:941:1: ';'
            {
             before(grammarAccess.getWorkProductTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__WorkProductType__Group__3__Impl1949); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:962:1: rule__WorkProduct__Group__0 : rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1 ;
    public final void rule__WorkProduct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:966:1: ( rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:967:2: rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__0__Impl_in_rule__WorkProduct__Group__01988);
            rule__WorkProduct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__1_in_rule__WorkProduct__Group__01991);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:974:1: rule__WorkProduct__Group__0__Impl : ( 'WorkProduct' ) ;
    public final void rule__WorkProduct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:978:1: ( ( 'WorkProduct' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:979:1: ( 'WorkProduct' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:979:1: ( 'WorkProduct' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:980:1: 'WorkProduct'
            {
             before(grammarAccess.getWorkProductAccess().getWorkProductKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__WorkProduct__Group__0__Impl2019); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:993:1: rule__WorkProduct__Group__1 : rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2 ;
    public final void rule__WorkProduct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:997:1: ( rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:998:2: rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__1__Impl_in_rule__WorkProduct__Group__12050);
            rule__WorkProduct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__2_in_rule__WorkProduct__Group__12053);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1005:1: rule__WorkProduct__Group__1__Impl : ( ( rule__WorkProduct__NameAssignment_1 ) ) ;
    public final void rule__WorkProduct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1009:1: ( ( ( rule__WorkProduct__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1010:1: ( ( rule__WorkProduct__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1010:1: ( ( rule__WorkProduct__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1011:1: ( rule__WorkProduct__NameAssignment_1 )
            {
             before(grammarAccess.getWorkProductAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1012:1: ( rule__WorkProduct__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1012:2: rule__WorkProduct__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkProduct__NameAssignment_1_in_rule__WorkProduct__Group__1__Impl2080);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1022:1: rule__WorkProduct__Group__2 : rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3 ;
    public final void rule__WorkProduct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1026:1: ( rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1027:2: rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__2__Impl_in_rule__WorkProduct__Group__22110);
            rule__WorkProduct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__3_in_rule__WorkProduct__Group__22113);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1034:1: rule__WorkProduct__Group__2__Impl : ( ':' ) ;
    public final void rule__WorkProduct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1038:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1039:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1039:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1040:1: ':'
            {
             before(grammarAccess.getWorkProductAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__WorkProduct__Group__2__Impl2141); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1053:1: rule__WorkProduct__Group__3 : rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4 ;
    public final void rule__WorkProduct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1057:1: ( rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1058:2: rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__3__Impl_in_rule__WorkProduct__Group__32172);
            rule__WorkProduct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__4_in_rule__WorkProduct__Group__32175);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1065:1: rule__WorkProduct__Group__3__Impl : ( ( rule__WorkProduct__TypeAssignment_3 ) ) ;
    public final void rule__WorkProduct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1069:1: ( ( ( rule__WorkProduct__TypeAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1070:1: ( ( rule__WorkProduct__TypeAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1070:1: ( ( rule__WorkProduct__TypeAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1071:1: ( rule__WorkProduct__TypeAssignment_3 )
            {
             before(grammarAccess.getWorkProductAccess().getTypeAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1072:1: ( rule__WorkProduct__TypeAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1072:2: rule__WorkProduct__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__WorkProduct__TypeAssignment_3_in_rule__WorkProduct__Group__3__Impl2202);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1082:1: rule__WorkProduct__Group__4 : rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5 ;
    public final void rule__WorkProduct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1086:1: ( rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1087:2: rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__4__Impl_in_rule__WorkProduct__Group__42232);
            rule__WorkProduct__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__5_in_rule__WorkProduct__Group__42235);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1094:1: rule__WorkProduct__Group__4__Impl : ( ( rule__WorkProduct__TextfieldAssignment_4 ) ) ;
    public final void rule__WorkProduct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1098:1: ( ( ( rule__WorkProduct__TextfieldAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1099:1: ( ( rule__WorkProduct__TextfieldAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1099:1: ( ( rule__WorkProduct__TextfieldAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1100:1: ( rule__WorkProduct__TextfieldAssignment_4 )
            {
             before(grammarAccess.getWorkProductAccess().getTextfieldAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1101:1: ( rule__WorkProduct__TextfieldAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1101:2: rule__WorkProduct__TextfieldAssignment_4
            {
            pushFollow(FOLLOW_rule__WorkProduct__TextfieldAssignment_4_in_rule__WorkProduct__Group__4__Impl2262);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1111:1: rule__WorkProduct__Group__5 : rule__WorkProduct__Group__5__Impl rule__WorkProduct__Group__6 ;
    public final void rule__WorkProduct__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1115:1: ( rule__WorkProduct__Group__5__Impl rule__WorkProduct__Group__6 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1116:2: rule__WorkProduct__Group__5__Impl rule__WorkProduct__Group__6
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__5__Impl_in_rule__WorkProduct__Group__52292);
            rule__WorkProduct__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__6_in_rule__WorkProduct__Group__52295);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1123:1: rule__WorkProduct__Group__5__Impl : ( ( rule__WorkProduct__Group_5__0 )? ) ;
    public final void rule__WorkProduct__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1127:1: ( ( ( rule__WorkProduct__Group_5__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1128:1: ( ( rule__WorkProduct__Group_5__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1128:1: ( ( rule__WorkProduct__Group_5__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1129:1: ( rule__WorkProduct__Group_5__0 )?
            {
             before(grammarAccess.getWorkProductAccess().getGroup_5()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1130:1: ( rule__WorkProduct__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1130:2: rule__WorkProduct__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__WorkProduct__Group_5__0_in_rule__WorkProduct__Group__5__Impl2322);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1140:1: rule__WorkProduct__Group__6 : rule__WorkProduct__Group__6__Impl ;
    public final void rule__WorkProduct__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1144:1: ( rule__WorkProduct__Group__6__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1145:2: rule__WorkProduct__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__6__Impl_in_rule__WorkProduct__Group__62353);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1151:1: rule__WorkProduct__Group__6__Impl : ( ';' ) ;
    public final void rule__WorkProduct__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1155:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1156:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1156:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1157:1: ';'
            {
             before(grammarAccess.getWorkProductAccess().getSemicolonKeyword_6()); 
            match(input,12,FOLLOW_12_in_rule__WorkProduct__Group__6__Impl2381); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1184:1: rule__WorkProduct__Group_5__0 : rule__WorkProduct__Group_5__0__Impl rule__WorkProduct__Group_5__1 ;
    public final void rule__WorkProduct__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1188:1: ( rule__WorkProduct__Group_5__0__Impl rule__WorkProduct__Group_5__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1189:2: rule__WorkProduct__Group_5__0__Impl rule__WorkProduct__Group_5__1
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group_5__0__Impl_in_rule__WorkProduct__Group_5__02426);
            rule__WorkProduct__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group_5__1_in_rule__WorkProduct__Group_5__02429);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1196:1: rule__WorkProduct__Group_5__0__Impl : ( 'states' ) ;
    public final void rule__WorkProduct__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1200:1: ( ( 'states' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1201:1: ( 'states' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1201:1: ( 'states' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1202:1: 'states'
            {
             before(grammarAccess.getWorkProductAccess().getStatesKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__WorkProduct__Group_5__0__Impl2457); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1215:1: rule__WorkProduct__Group_5__1 : rule__WorkProduct__Group_5__1__Impl rule__WorkProduct__Group_5__2 ;
    public final void rule__WorkProduct__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1219:1: ( rule__WorkProduct__Group_5__1__Impl rule__WorkProduct__Group_5__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1220:2: rule__WorkProduct__Group_5__1__Impl rule__WorkProduct__Group_5__2
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group_5__1__Impl_in_rule__WorkProduct__Group_5__12488);
            rule__WorkProduct__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group_5__2_in_rule__WorkProduct__Group_5__12491);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1227:1: rule__WorkProduct__Group_5__1__Impl : ( ( rule__WorkProduct__StatesAssignment_5_1 ) ) ;
    public final void rule__WorkProduct__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1231:1: ( ( ( rule__WorkProduct__StatesAssignment_5_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1232:1: ( ( rule__WorkProduct__StatesAssignment_5_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1232:1: ( ( rule__WorkProduct__StatesAssignment_5_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1233:1: ( rule__WorkProduct__StatesAssignment_5_1 )
            {
             before(grammarAccess.getWorkProductAccess().getStatesAssignment_5_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1234:1: ( rule__WorkProduct__StatesAssignment_5_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1234:2: rule__WorkProduct__StatesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__WorkProduct__StatesAssignment_5_1_in_rule__WorkProduct__Group_5__1__Impl2518);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1244:1: rule__WorkProduct__Group_5__2 : rule__WorkProduct__Group_5__2__Impl ;
    public final void rule__WorkProduct__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1248:1: ( rule__WorkProduct__Group_5__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1249:2: rule__WorkProduct__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group_5__2__Impl_in_rule__WorkProduct__Group_5__22548);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1255:1: rule__WorkProduct__Group_5__2__Impl : ( ( rule__WorkProduct__Group_5_2__0 )* ) ;
    public final void rule__WorkProduct__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1259:1: ( ( ( rule__WorkProduct__Group_5_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1260:1: ( ( rule__WorkProduct__Group_5_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1260:1: ( ( rule__WorkProduct__Group_5_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1261:1: ( rule__WorkProduct__Group_5_2__0 )*
            {
             before(grammarAccess.getWorkProductAccess().getGroup_5_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1262:1: ( rule__WorkProduct__Group_5_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1262:2: rule__WorkProduct__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__WorkProduct__Group_5_2__0_in_rule__WorkProduct__Group_5__2__Impl2575);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1278:1: rule__WorkProduct__Group_5_2__0 : rule__WorkProduct__Group_5_2__0__Impl rule__WorkProduct__Group_5_2__1 ;
    public final void rule__WorkProduct__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1282:1: ( rule__WorkProduct__Group_5_2__0__Impl rule__WorkProduct__Group_5_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1283:2: rule__WorkProduct__Group_5_2__0__Impl rule__WorkProduct__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group_5_2__0__Impl_in_rule__WorkProduct__Group_5_2__02612);
            rule__WorkProduct__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group_5_2__1_in_rule__WorkProduct__Group_5_2__02615);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1290:1: rule__WorkProduct__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__WorkProduct__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1294:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1295:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1295:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1296:1: ','
            {
             before(grammarAccess.getWorkProductAccess().getCommaKeyword_5_2_0()); 
            match(input,17,FOLLOW_17_in_rule__WorkProduct__Group_5_2__0__Impl2643); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1309:1: rule__WorkProduct__Group_5_2__1 : rule__WorkProduct__Group_5_2__1__Impl ;
    public final void rule__WorkProduct__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1313:1: ( rule__WorkProduct__Group_5_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1314:2: rule__WorkProduct__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group_5_2__1__Impl_in_rule__WorkProduct__Group_5_2__12674);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1320:1: rule__WorkProduct__Group_5_2__1__Impl : ( ( rule__WorkProduct__StatesAssignment_5_2_1 ) ) ;
    public final void rule__WorkProduct__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1324:1: ( ( ( rule__WorkProduct__StatesAssignment_5_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1325:1: ( ( rule__WorkProduct__StatesAssignment_5_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1325:1: ( ( rule__WorkProduct__StatesAssignment_5_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1326:1: ( rule__WorkProduct__StatesAssignment_5_2_1 )
            {
             before(grammarAccess.getWorkProductAccess().getStatesAssignment_5_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1327:1: ( rule__WorkProduct__StatesAssignment_5_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1327:2: rule__WorkProduct__StatesAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__WorkProduct__StatesAssignment_5_2_1_in_rule__WorkProduct__Group_5_2__1__Impl2701);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1341:1: rule__GuidanceType__Group__0 : rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1 ;
    public final void rule__GuidanceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1345:1: ( rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1346:2: rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__0__Impl_in_rule__GuidanceType__Group__02735);
            rule__GuidanceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__1_in_rule__GuidanceType__Group__02738);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1353:1: rule__GuidanceType__Group__0__Impl : ( 'GuidanceType' ) ;
    public final void rule__GuidanceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1357:1: ( ( 'GuidanceType' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1358:1: ( 'GuidanceType' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1358:1: ( 'GuidanceType' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1359:1: 'GuidanceType'
            {
             before(grammarAccess.getGuidanceTypeAccess().getGuidanceTypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__GuidanceType__Group__0__Impl2766); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1372:1: rule__GuidanceType__Group__1 : rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2 ;
    public final void rule__GuidanceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1376:1: ( rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1377:2: rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__1__Impl_in_rule__GuidanceType__Group__12797);
            rule__GuidanceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__2_in_rule__GuidanceType__Group__12800);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1384:1: rule__GuidanceType__Group__1__Impl : ( ( rule__GuidanceType__NameAssignment_1 ) ) ;
    public final void rule__GuidanceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1388:1: ( ( ( rule__GuidanceType__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1389:1: ( ( rule__GuidanceType__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1389:1: ( ( rule__GuidanceType__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1390:1: ( rule__GuidanceType__NameAssignment_1 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1391:1: ( rule__GuidanceType__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1391:2: rule__GuidanceType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GuidanceType__NameAssignment_1_in_rule__GuidanceType__Group__1__Impl2827);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1401:1: rule__GuidanceType__Group__2 : rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3 ;
    public final void rule__GuidanceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1405:1: ( rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1406:2: rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__2__Impl_in_rule__GuidanceType__Group__22857);
            rule__GuidanceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__3_in_rule__GuidanceType__Group__22860);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1413:1: rule__GuidanceType__Group__2__Impl : ( ( rule__GuidanceType__TextfieldAssignment_2 ) ) ;
    public final void rule__GuidanceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1417:1: ( ( ( rule__GuidanceType__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1418:1: ( ( rule__GuidanceType__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1418:1: ( ( rule__GuidanceType__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1419:1: ( rule__GuidanceType__TextfieldAssignment_2 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1420:1: ( rule__GuidanceType__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1420:2: rule__GuidanceType__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__GuidanceType__TextfieldAssignment_2_in_rule__GuidanceType__Group__2__Impl2887);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1430:1: rule__GuidanceType__Group__3 : rule__GuidanceType__Group__3__Impl ;
    public final void rule__GuidanceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1434:1: ( rule__GuidanceType__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1435:2: rule__GuidanceType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__3__Impl_in_rule__GuidanceType__Group__32917);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1441:1: rule__GuidanceType__Group__3__Impl : ( ';' ) ;
    public final void rule__GuidanceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1445:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1446:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1446:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1447:1: ';'
            {
             before(grammarAccess.getGuidanceTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__GuidanceType__Group__3__Impl2945); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1468:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1472:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1473:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02984);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02987);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1480:1: rule__Guidance__Group__0__Impl : ( 'Guidance' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1484:1: ( ( 'Guidance' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1485:1: ( 'Guidance' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1485:1: ( 'Guidance' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1486:1: 'Guidance'
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Guidance__Group__0__Impl3015); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1499:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1503:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1504:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__13046);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__13049);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1511:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__NameAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1515:1: ( ( ( rule__Guidance__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1516:1: ( ( rule__Guidance__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1516:1: ( ( rule__Guidance__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1517:1: ( rule__Guidance__NameAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1518:1: ( rule__Guidance__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1518:2: rule__Guidance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Guidance__NameAssignment_1_in_rule__Guidance__Group__1__Impl3076);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1528:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1532:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1533:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__23106);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__3_in_rule__Guidance__Group__23109);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1540:1: rule__Guidance__Group__2__Impl : ( ':' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1544:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1545:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1545:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1546:1: ':'
            {
             before(grammarAccess.getGuidanceAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Guidance__Group__2__Impl3137); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1559:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1563:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1564:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_rule__Guidance__Group__3__Impl_in_rule__Guidance__Group__33168);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__4_in_rule__Guidance__Group__33171);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1571:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__TypeAssignment_3 ) ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1575:1: ( ( ( rule__Guidance__TypeAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1576:1: ( ( rule__Guidance__TypeAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1576:1: ( ( rule__Guidance__TypeAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1577:1: ( rule__Guidance__TypeAssignment_3 )
            {
             before(grammarAccess.getGuidanceAccess().getTypeAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1578:1: ( rule__Guidance__TypeAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1578:2: rule__Guidance__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Guidance__TypeAssignment_3_in_rule__Guidance__Group__3__Impl3198);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1588:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl rule__Guidance__Group__5 ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1592:1: ( rule__Guidance__Group__4__Impl rule__Guidance__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1593:2: rule__Guidance__Group__4__Impl rule__Guidance__Group__5
            {
            pushFollow(FOLLOW_rule__Guidance__Group__4__Impl_in_rule__Guidance__Group__43228);
            rule__Guidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__5_in_rule__Guidance__Group__43231);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1600:1: rule__Guidance__Group__4__Impl : ( ( rule__Guidance__TextfieldAssignment_4 ) ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1604:1: ( ( ( rule__Guidance__TextfieldAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1605:1: ( ( rule__Guidance__TextfieldAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1605:1: ( ( rule__Guidance__TextfieldAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1606:1: ( rule__Guidance__TextfieldAssignment_4 )
            {
             before(grammarAccess.getGuidanceAccess().getTextfieldAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1607:1: ( rule__Guidance__TextfieldAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1607:2: rule__Guidance__TextfieldAssignment_4
            {
            pushFollow(FOLLOW_rule__Guidance__TextfieldAssignment_4_in_rule__Guidance__Group__4__Impl3258);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1617:1: rule__Guidance__Group__5 : rule__Guidance__Group__5__Impl rule__Guidance__Group__6 ;
    public final void rule__Guidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1621:1: ( rule__Guidance__Group__5__Impl rule__Guidance__Group__6 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1622:2: rule__Guidance__Group__5__Impl rule__Guidance__Group__6
            {
            pushFollow(FOLLOW_rule__Guidance__Group__5__Impl_in_rule__Guidance__Group__53288);
            rule__Guidance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__6_in_rule__Guidance__Group__53291);
            rule__Guidance__Group__6();

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1629:1: rule__Guidance__Group__5__Impl : ( ( rule__Guidance__LinksAssignment_5 )* ) ;
    public final void rule__Guidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1633:1: ( ( ( rule__Guidance__LinksAssignment_5 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1634:1: ( ( rule__Guidance__LinksAssignment_5 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1634:1: ( ( rule__Guidance__LinksAssignment_5 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1635:1: ( rule__Guidance__LinksAssignment_5 )*
            {
             before(grammarAccess.getGuidanceAccess().getLinksAssignment_5()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1636:1: ( rule__Guidance__LinksAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==40) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1636:2: rule__Guidance__LinksAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Guidance__LinksAssignment_5_in_rule__Guidance__Group__5__Impl3318);
            	    rule__Guidance__LinksAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGuidanceAccess().getLinksAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Guidance__Group__6"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1646:1: rule__Guidance__Group__6 : rule__Guidance__Group__6__Impl ;
    public final void rule__Guidance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1650:1: ( rule__Guidance__Group__6__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1651:2: rule__Guidance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Guidance__Group__6__Impl_in_rule__Guidance__Group__63349);
            rule__Guidance__Group__6__Impl();

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
    // $ANTLR end "rule__Guidance__Group__6"


    // $ANTLR start "rule__Guidance__Group__6__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1657:1: rule__Guidance__Group__6__Impl : ( ';' ) ;
    public final void rule__Guidance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1661:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1662:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1662:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1663:1: ';'
            {
             before(grammarAccess.getGuidanceAccess().getSemicolonKeyword_6()); 
            match(input,12,FOLLOW_12_in_rule__Guidance__Group__6__Impl3377); 
             after(grammarAccess.getGuidanceAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__6__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1690:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1694:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1695:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03422);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03425);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1702:1: rule__Port__Group__0__Impl : ( ( rule__Port__TypeAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1706:1: ( ( ( rule__Port__TypeAssignment_0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1707:1: ( ( rule__Port__TypeAssignment_0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1707:1: ( ( rule__Port__TypeAssignment_0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1708:1: ( rule__Port__TypeAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1709:1: ( rule__Port__TypeAssignment_0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1709:2: rule__Port__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__TypeAssignment_0_in_rule__Port__Group__0__Impl3452);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1719:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1723:1: ( rule__Port__Group__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1724:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13482);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1730:1: rule__Port__Group__1__Impl : ( ( rule__Port__Group_1__0 )? ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1734:1: ( ( ( rule__Port__Group_1__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1735:1: ( ( rule__Port__Group_1__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1735:1: ( ( rule__Port__Group_1__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1736:1: ( rule__Port__Group_1__0 )?
            {
             before(grammarAccess.getPortAccess().getGroup_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1737:1: ( rule__Port__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1737:2: rule__Port__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Port__Group_1__0_in_rule__Port__Group__1__Impl3509);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1751:1: rule__Port__Group_1__0 : rule__Port__Group_1__0__Impl rule__Port__Group_1__1 ;
    public final void rule__Port__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1755:1: ( rule__Port__Group_1__0__Impl rule__Port__Group_1__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1756:2: rule__Port__Group_1__0__Impl rule__Port__Group_1__1
            {
            pushFollow(FOLLOW_rule__Port__Group_1__0__Impl_in_rule__Port__Group_1__03544);
            rule__Port__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group_1__1_in_rule__Port__Group_1__03547);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1763:1: rule__Port__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Port__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1767:1: ( ( '(' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1768:1: ( '(' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1768:1: ( '(' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1769:1: '('
            {
             before(grammarAccess.getPortAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Port__Group_1__0__Impl3575); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1782:1: rule__Port__Group_1__1 : rule__Port__Group_1__1__Impl rule__Port__Group_1__2 ;
    public final void rule__Port__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1786:1: ( rule__Port__Group_1__1__Impl rule__Port__Group_1__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1787:2: rule__Port__Group_1__1__Impl rule__Port__Group_1__2
            {
            pushFollow(FOLLOW_rule__Port__Group_1__1__Impl_in_rule__Port__Group_1__13606);
            rule__Port__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group_1__2_in_rule__Port__Group_1__13609);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1794:1: rule__Port__Group_1__1__Impl : ( ( rule__Port__StateAssignment_1_1 ) ) ;
    public final void rule__Port__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1798:1: ( ( ( rule__Port__StateAssignment_1_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1799:1: ( ( rule__Port__StateAssignment_1_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1799:1: ( ( rule__Port__StateAssignment_1_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1800:1: ( rule__Port__StateAssignment_1_1 )
            {
             before(grammarAccess.getPortAccess().getStateAssignment_1_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1801:1: ( rule__Port__StateAssignment_1_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1801:2: rule__Port__StateAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Port__StateAssignment_1_1_in_rule__Port__Group_1__1__Impl3636);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1811:1: rule__Port__Group_1__2 : rule__Port__Group_1__2__Impl ;
    public final void rule__Port__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1815:1: ( rule__Port__Group_1__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1816:2: rule__Port__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group_1__2__Impl_in_rule__Port__Group_1__23666);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1822:1: rule__Port__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Port__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1826:1: ( ( ')' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1827:1: ( ')' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1827:1: ( ')' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1828:1: ')'
            {
             before(grammarAccess.getPortAccess().getRightParenthesisKeyword_1_2()); 
            match(input,21,FOLLOW_21_in_rule__Port__Group_1__2__Impl3694); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1847:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1851:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1852:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03731);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03734);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1859:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1863:1: ( ( 'Activity' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1864:1: ( 'Activity' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1864:1: ( 'Activity' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1865:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Activity__Group__0__Impl3762); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1878:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1882:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1883:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13793);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13796);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1890:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1894:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1895:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1895:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1896:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1897:1: ( rule__Activity__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1897:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl3823);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1907:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1911:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1912:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23853);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23856);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1919:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__TextfieldAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1923:1: ( ( ( rule__Activity__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1924:1: ( ( rule__Activity__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1924:1: ( ( rule__Activity__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1925:1: ( rule__Activity__TextfieldAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1926:1: ( rule__Activity__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1926:2: rule__Activity__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__TextfieldAssignment_2_in_rule__Activity__Group__2__Impl3883);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1936:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1940:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1941:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33913);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33916);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1948:1: rule__Activity__Group__3__Impl : ( 'responsible' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1952:1: ( ( 'responsible' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1953:1: ( 'responsible' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1953:1: ( 'responsible' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1954:1: 'responsible'
            {
             before(grammarAccess.getActivityAccess().getResponsibleKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Activity__Group__3__Impl3944); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1967:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1971:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1972:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43975);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43978);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1979:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__RoleAssignment_4 ) ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1983:1: ( ( ( rule__Activity__RoleAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1984:1: ( ( rule__Activity__RoleAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1984:1: ( ( rule__Activity__RoleAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1985:1: ( rule__Activity__RoleAssignment_4 )
            {
             before(grammarAccess.getActivityAccess().getRoleAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1986:1: ( rule__Activity__RoleAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1986:2: rule__Activity__RoleAssignment_4
            {
            pushFollow(FOLLOW_rule__Activity__RoleAssignment_4_in_rule__Activity__Group__4__Impl4005);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1996:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2000:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2001:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__54035);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__54038);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2008:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2012:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2013:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2013:1: ( ( rule__Activity__Group_5__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2014:1: ( rule__Activity__Group_5__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_5()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2015:1: ( rule__Activity__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2015:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl4065);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2025:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2029:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2030:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__64096);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__64099);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2037:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__Group_6__0 )? ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2041:1: ( ( ( rule__Activity__Group_6__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2042:1: ( ( rule__Activity__Group_6__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2042:1: ( ( rule__Activity__Group_6__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2043:1: ( rule__Activity__Group_6__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_6()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2044:1: ( rule__Activity__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2044:2: rule__Activity__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl4126);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2054:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2058:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2059:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__74157);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__74160);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2066:1: rule__Activity__Group__7__Impl : ( ( rule__Activity__Group_7__0 )? ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2070:1: ( ( ( rule__Activity__Group_7__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2071:1: ( ( rule__Activity__Group_7__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2071:1: ( ( rule__Activity__Group_7__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2072:1: ( rule__Activity__Group_7__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_7()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2073:1: ( rule__Activity__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2073:2: rule__Activity__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl4187);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2083:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2087:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2088:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__84218);
            rule__Activity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__84221);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2095:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__Group_8__0 )? ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2099:1: ( ( ( rule__Activity__Group_8__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2100:1: ( ( rule__Activity__Group_8__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2100:1: ( ( rule__Activity__Group_8__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2101:1: ( rule__Activity__Group_8__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_8()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2102:1: ( rule__Activity__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2102:2: rule__Activity__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl4248);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2112:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2116:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2117:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__94279);
            rule__Activity__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__94282);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2124:1: rule__Activity__Group__9__Impl : ( ( rule__Activity__Group_9__0 )? ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2128:1: ( ( ( rule__Activity__Group_9__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2129:1: ( ( rule__Activity__Group_9__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2129:1: ( ( rule__Activity__Group_9__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2130:1: ( rule__Activity__Group_9__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_9()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2131:1: ( rule__Activity__Group_9__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2131:2: rule__Activity__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl4309);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2141:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2145:1: ( rule__Activity__Group__10__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2146:2: rule__Activity__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__104340);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2152:1: rule__Activity__Group__10__Impl : ( ';' ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2156:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2157:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2157:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2158:1: ';'
            {
             before(grammarAccess.getActivityAccess().getSemicolonKeyword_10()); 
            match(input,12,FOLLOW_12_in_rule__Activity__Group__10__Impl4368); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2193:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2197:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2198:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__04421);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__04424);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2205:1: rule__Activity__Group_5__0__Impl : ( 'inputs' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2209:1: ( ( 'inputs' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2210:1: ( 'inputs' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2210:1: ( 'inputs' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2211:1: 'inputs'
            {
             before(grammarAccess.getActivityAccess().getInputsKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Activity__Group_5__0__Impl4452); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2224:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2228:1: ( rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2229:2: rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__14483);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__14486);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2236:1: rule__Activity__Group_5__1__Impl : ( ( rule__Activity__InPortsAssignment_5_1 ) ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2240:1: ( ( ( rule__Activity__InPortsAssignment_5_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2241:1: ( ( rule__Activity__InPortsAssignment_5_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2241:1: ( ( rule__Activity__InPortsAssignment_5_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2242:1: ( rule__Activity__InPortsAssignment_5_1 )
            {
             before(grammarAccess.getActivityAccess().getInPortsAssignment_5_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2243:1: ( rule__Activity__InPortsAssignment_5_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2243:2: rule__Activity__InPortsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Activity__InPortsAssignment_5_1_in_rule__Activity__Group_5__1__Impl4513);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2253:1: rule__Activity__Group_5__2 : rule__Activity__Group_5__2__Impl ;
    public final void rule__Activity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2257:1: ( rule__Activity__Group_5__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2258:2: rule__Activity__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__24543);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2264:1: rule__Activity__Group_5__2__Impl : ( ( rule__Activity__Group_5_2__0 )* ) ;
    public final void rule__Activity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2268:1: ( ( ( rule__Activity__Group_5_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2269:1: ( ( rule__Activity__Group_5_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2269:1: ( ( rule__Activity__Group_5_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2270:1: ( rule__Activity__Group_5_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_5_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2271:1: ( rule__Activity__Group_5_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2271:2: rule__Activity__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__Group_5__2__Impl4570);
            	    rule__Activity__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2287:1: rule__Activity__Group_5_2__0 : rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 ;
    public final void rule__Activity__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2291:1: ( rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2292:2: rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__04607);
            rule__Activity__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__04610);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2299:1: rule__Activity__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2303:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2304:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2304:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2305:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_5_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Activity__Group_5_2__0__Impl4638); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2318:1: rule__Activity__Group_5_2__1 : rule__Activity__Group_5_2__1__Impl ;
    public final void rule__Activity__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2322:1: ( rule__Activity__Group_5_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2323:2: rule__Activity__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__14669);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2329:1: rule__Activity__Group_5_2__1__Impl : ( ( rule__Activity__InPortsAssignment_5_2_1 ) ) ;
    public final void rule__Activity__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2333:1: ( ( ( rule__Activity__InPortsAssignment_5_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2334:1: ( ( rule__Activity__InPortsAssignment_5_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2334:1: ( ( rule__Activity__InPortsAssignment_5_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2335:1: ( rule__Activity__InPortsAssignment_5_2_1 )
            {
             before(grammarAccess.getActivityAccess().getInPortsAssignment_5_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2336:1: ( rule__Activity__InPortsAssignment_5_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2336:2: rule__Activity__InPortsAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Activity__InPortsAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl4696);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2350:1: rule__Activity__Group_6__0 : rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 ;
    public final void rule__Activity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2354:1: ( rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2355:2: rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__04730);
            rule__Activity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__04733);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2362:1: rule__Activity__Group_6__0__Impl : ( 'outputs' ) ;
    public final void rule__Activity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2366:1: ( ( 'outputs' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2367:1: ( 'outputs' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2367:1: ( 'outputs' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2368:1: 'outputs'
            {
             before(grammarAccess.getActivityAccess().getOutputsKeyword_6_0()); 
            match(input,25,FOLLOW_25_in_rule__Activity__Group_6__0__Impl4761); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2381:1: rule__Activity__Group_6__1 : rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 ;
    public final void rule__Activity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2385:1: ( rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2386:2: rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__14792);
            rule__Activity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__14795);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2393:1: rule__Activity__Group_6__1__Impl : ( ( rule__Activity__OutPortsAssignment_6_1 ) ) ;
    public final void rule__Activity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2397:1: ( ( ( rule__Activity__OutPortsAssignment_6_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2398:1: ( ( rule__Activity__OutPortsAssignment_6_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2398:1: ( ( rule__Activity__OutPortsAssignment_6_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2399:1: ( rule__Activity__OutPortsAssignment_6_1 )
            {
             before(grammarAccess.getActivityAccess().getOutPortsAssignment_6_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2400:1: ( rule__Activity__OutPortsAssignment_6_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2400:2: rule__Activity__OutPortsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Activity__OutPortsAssignment_6_1_in_rule__Activity__Group_6__1__Impl4822);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2410:1: rule__Activity__Group_6__2 : rule__Activity__Group_6__2__Impl ;
    public final void rule__Activity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2414:1: ( rule__Activity__Group_6__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2415:2: rule__Activity__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__24852);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2421:1: rule__Activity__Group_6__2__Impl : ( ( rule__Activity__Group_6_2__0 )* ) ;
    public final void rule__Activity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2425:1: ( ( ( rule__Activity__Group_6_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2426:1: ( ( rule__Activity__Group_6_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2426:1: ( ( rule__Activity__Group_6_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2427:1: ( rule__Activity__Group_6_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_6_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2428:1: ( rule__Activity__Group_6_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2428:2: rule__Activity__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__Group_6__2__Impl4879);
            	    rule__Activity__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2444:1: rule__Activity__Group_6_2__0 : rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 ;
    public final void rule__Activity__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2448:1: ( rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2449:2: rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__04916);
            rule__Activity__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__04919);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2456:1: rule__Activity__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2460:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2461:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2461:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2462:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_6_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Activity__Group_6_2__0__Impl4947); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2475:1: rule__Activity__Group_6_2__1 : rule__Activity__Group_6_2__1__Impl ;
    public final void rule__Activity__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2479:1: ( rule__Activity__Group_6_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2480:2: rule__Activity__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__14978);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2486:1: rule__Activity__Group_6_2__1__Impl : ( ( rule__Activity__OutPortsAssignment_6_2_1 ) ) ;
    public final void rule__Activity__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2490:1: ( ( ( rule__Activity__OutPortsAssignment_6_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2491:1: ( ( rule__Activity__OutPortsAssignment_6_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2491:1: ( ( rule__Activity__OutPortsAssignment_6_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2492:1: ( rule__Activity__OutPortsAssignment_6_2_1 )
            {
             before(grammarAccess.getActivityAccess().getOutPortsAssignment_6_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2493:1: ( rule__Activity__OutPortsAssignment_6_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2493:2: rule__Activity__OutPortsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Activity__OutPortsAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl5005);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2507:1: rule__Activity__Group_7__0 : rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 ;
    public final void rule__Activity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2511:1: ( rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2512:2: rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__05039);
            rule__Activity__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__05042);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2519:1: rule__Activity__Group_7__0__Impl : ( 'subActivities' ) ;
    public final void rule__Activity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2523:1: ( ( 'subActivities' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2524:1: ( 'subActivities' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2524:1: ( 'subActivities' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2525:1: 'subActivities'
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Activity__Group_7__0__Impl5070); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2538:1: rule__Activity__Group_7__1 : rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2 ;
    public final void rule__Activity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2542:1: ( rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2543:2: rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__15101);
            rule__Activity__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7__2_in_rule__Activity__Group_7__15104);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2550:1: rule__Activity__Group_7__1__Impl : ( ( rule__Activity__SubActivitiesAssignment_7_1 ) ) ;
    public final void rule__Activity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2554:1: ( ( ( rule__Activity__SubActivitiesAssignment_7_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2555:1: ( ( rule__Activity__SubActivitiesAssignment_7_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2555:1: ( ( rule__Activity__SubActivitiesAssignment_7_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2556:1: ( rule__Activity__SubActivitiesAssignment_7_1 )
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2557:1: ( rule__Activity__SubActivitiesAssignment_7_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2557:2: rule__Activity__SubActivitiesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Activity__SubActivitiesAssignment_7_1_in_rule__Activity__Group_7__1__Impl5131);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2567:1: rule__Activity__Group_7__2 : rule__Activity__Group_7__2__Impl ;
    public final void rule__Activity__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2571:1: ( rule__Activity__Group_7__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2572:2: rule__Activity__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__2__Impl_in_rule__Activity__Group_7__25161);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2578:1: rule__Activity__Group_7__2__Impl : ( ( rule__Activity__Group_7_2__0 )* ) ;
    public final void rule__Activity__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2582:1: ( ( ( rule__Activity__Group_7_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2583:1: ( ( rule__Activity__Group_7_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2583:1: ( ( rule__Activity__Group_7_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2584:1: ( rule__Activity__Group_7_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_7_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2585:1: ( rule__Activity__Group_7_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2585:2: rule__Activity__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__Group_7__2__Impl5188);
            	    rule__Activity__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2601:1: rule__Activity__Group_7_2__0 : rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 ;
    public final void rule__Activity__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2605:1: ( rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2606:2: rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__05225);
            rule__Activity__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__05228);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2613:1: rule__Activity__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2617:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2618:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2618:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2619:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_7_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Activity__Group_7_2__0__Impl5256); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2632:1: rule__Activity__Group_7_2__1 : rule__Activity__Group_7_2__1__Impl ;
    public final void rule__Activity__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2636:1: ( rule__Activity__Group_7_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2637:2: rule__Activity__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__15287);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2643:1: rule__Activity__Group_7_2__1__Impl : ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) ) ;
    public final void rule__Activity__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2647:1: ( ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2648:1: ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2648:1: ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2649:1: ( rule__Activity__SubActivitiesAssignment_7_2_1 )
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2650:1: ( rule__Activity__SubActivitiesAssignment_7_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2650:2: rule__Activity__SubActivitiesAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Activity__SubActivitiesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl5314);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2664:1: rule__Activity__Group_8__0 : rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 ;
    public final void rule__Activity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2668:1: ( rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2669:2: rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__05348);
            rule__Activity__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__05351);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2676:1: rule__Activity__Group_8__0__Impl : ( 'guidances' ) ;
    public final void rule__Activity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2680:1: ( ( 'guidances' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2681:1: ( 'guidances' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2681:1: ( 'guidances' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2682:1: 'guidances'
            {
             before(grammarAccess.getActivityAccess().getGuidancesKeyword_8_0()); 
            match(input,27,FOLLOW_27_in_rule__Activity__Group_8__0__Impl5379); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2695:1: rule__Activity__Group_8__1 : rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 ;
    public final void rule__Activity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2699:1: ( rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2700:2: rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__15410);
            rule__Activity__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__15413);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2707:1: rule__Activity__Group_8__1__Impl : ( ( rule__Activity__GuidancesAssignment_8_1 ) ) ;
    public final void rule__Activity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2711:1: ( ( ( rule__Activity__GuidancesAssignment_8_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2712:1: ( ( rule__Activity__GuidancesAssignment_8_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2712:1: ( ( rule__Activity__GuidancesAssignment_8_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2713:1: ( rule__Activity__GuidancesAssignment_8_1 )
            {
             before(grammarAccess.getActivityAccess().getGuidancesAssignment_8_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2714:1: ( rule__Activity__GuidancesAssignment_8_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2714:2: rule__Activity__GuidancesAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Activity__GuidancesAssignment_8_1_in_rule__Activity__Group_8__1__Impl5440);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2724:1: rule__Activity__Group_8__2 : rule__Activity__Group_8__2__Impl ;
    public final void rule__Activity__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2728:1: ( rule__Activity__Group_8__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2729:2: rule__Activity__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__25470);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2735:1: rule__Activity__Group_8__2__Impl : ( ( rule__Activity__Group_8_2__0 )* ) ;
    public final void rule__Activity__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2739:1: ( ( ( rule__Activity__Group_8_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2740:1: ( ( rule__Activity__Group_8_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2740:1: ( ( rule__Activity__Group_8_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2741:1: ( rule__Activity__Group_8_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_8_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2742:1: ( rule__Activity__Group_8_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2742:2: rule__Activity__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_8_2__0_in_rule__Activity__Group_8__2__Impl5497);
            	    rule__Activity__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2758:1: rule__Activity__Group_8_2__0 : rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1 ;
    public final void rule__Activity__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2762:1: ( rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2763:2: rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8_2__0__Impl_in_rule__Activity__Group_8_2__05534);
            rule__Activity__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8_2__1_in_rule__Activity__Group_8_2__05537);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2770:1: rule__Activity__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2774:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2775:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2775:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2776:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_8_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Activity__Group_8_2__0__Impl5565); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2789:1: rule__Activity__Group_8_2__1 : rule__Activity__Group_8_2__1__Impl ;
    public final void rule__Activity__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2793:1: ( rule__Activity__Group_8_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2794:2: rule__Activity__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8_2__1__Impl_in_rule__Activity__Group_8_2__15596);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2800:1: rule__Activity__Group_8_2__1__Impl : ( ( rule__Activity__GuidancesAssignment_8_2_1 ) ) ;
    public final void rule__Activity__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2804:1: ( ( ( rule__Activity__GuidancesAssignment_8_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2805:1: ( ( rule__Activity__GuidancesAssignment_8_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2805:1: ( ( rule__Activity__GuidancesAssignment_8_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2806:1: ( rule__Activity__GuidancesAssignment_8_2_1 )
            {
             before(grammarAccess.getActivityAccess().getGuidancesAssignment_8_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2807:1: ( rule__Activity__GuidancesAssignment_8_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2807:2: rule__Activity__GuidancesAssignment_8_2_1
            {
            pushFollow(FOLLOW_rule__Activity__GuidancesAssignment_8_2_1_in_rule__Activity__Group_8_2__1__Impl5623);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2821:1: rule__Activity__Group_9__0 : rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 ;
    public final void rule__Activity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2825:1: ( rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2826:2: rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__05657);
            rule__Activity__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__05660);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2833:1: rule__Activity__Group_9__0__Impl : ( 'Behavior' ) ;
    public final void rule__Activity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2837:1: ( ( 'Behavior' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2838:1: ( 'Behavior' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2838:1: ( 'Behavior' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2839:1: 'Behavior'
            {
             before(grammarAccess.getActivityAccess().getBehaviorKeyword_9_0()); 
            match(input,28,FOLLOW_28_in_rule__Activity__Group_9__0__Impl5688); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2852:1: rule__Activity__Group_9__1 : rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 ;
    public final void rule__Activity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2856:1: ( rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2857:2: rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__15719);
            rule__Activity__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__15722);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2864:1: rule__Activity__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2868:1: ( ( '{' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2869:1: ( '{' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2869:1: ( '{' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2870:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,29,FOLLOW_29_in_rule__Activity__Group_9__1__Impl5750); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2883:1: rule__Activity__Group_9__2 : rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3 ;
    public final void rule__Activity__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2887:1: ( rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2888:2: rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__25781);
            rule__Activity__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__3_in_rule__Activity__Group_9__25784);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2895:1: rule__Activity__Group_9__2__Impl : ( ( rule__Activity__Alternatives_9_2 )* ) ;
    public final void rule__Activity__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2899:1: ( ( ( rule__Activity__Alternatives_9_2 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2900:1: ( ( rule__Activity__Alternatives_9_2 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2900:1: ( ( rule__Activity__Alternatives_9_2 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2901:1: ( rule__Activity__Alternatives_9_2 )*
            {
             before(grammarAccess.getActivityAccess().getAlternatives_9_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2902:1: ( rule__Activity__Alternatives_9_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=31 && LA18_0<=33)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2902:2: rule__Activity__Alternatives_9_2
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Alternatives_9_2_in_rule__Activity__Group_9__2__Impl5811);
            	    rule__Activity__Alternatives_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2912:1: rule__Activity__Group_9__3 : rule__Activity__Group_9__3__Impl ;
    public final void rule__Activity__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2916:1: ( rule__Activity__Group_9__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2917:2: rule__Activity__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__3__Impl_in_rule__Activity__Group_9__35842);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2923:1: rule__Activity__Group_9__3__Impl : ( '}' ) ;
    public final void rule__Activity__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2927:1: ( ( '}' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2928:1: ( '}' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2928:1: ( '}' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2929:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,30,FOLLOW_30_in_rule__Activity__Group_9__3__Impl5870); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2950:1: rule__Decision__Group__0 : rule__Decision__Group__0__Impl rule__Decision__Group__1 ;
    public final void rule__Decision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2954:1: ( rule__Decision__Group__0__Impl rule__Decision__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2955:2: rule__Decision__Group__0__Impl rule__Decision__Group__1
            {
            pushFollow(FOLLOW_rule__Decision__Group__0__Impl_in_rule__Decision__Group__05909);
            rule__Decision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decision__Group__1_in_rule__Decision__Group__05912);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2962:1: rule__Decision__Group__0__Impl : ( 'Decision' ) ;
    public final void rule__Decision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2966:1: ( ( 'Decision' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2967:1: ( 'Decision' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2967:1: ( 'Decision' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2968:1: 'Decision'
            {
             before(grammarAccess.getDecisionAccess().getDecisionKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Decision__Group__0__Impl5940); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2981:1: rule__Decision__Group__1 : rule__Decision__Group__1__Impl rule__Decision__Group__2 ;
    public final void rule__Decision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2985:1: ( rule__Decision__Group__1__Impl rule__Decision__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2986:2: rule__Decision__Group__1__Impl rule__Decision__Group__2
            {
            pushFollow(FOLLOW_rule__Decision__Group__1__Impl_in_rule__Decision__Group__15971);
            rule__Decision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decision__Group__2_in_rule__Decision__Group__15974);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2993:1: rule__Decision__Group__1__Impl : ( ( rule__Decision__NameAssignment_1 ) ) ;
    public final void rule__Decision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2997:1: ( ( ( rule__Decision__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2998:1: ( ( rule__Decision__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2998:1: ( ( rule__Decision__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2999:1: ( rule__Decision__NameAssignment_1 )
            {
             before(grammarAccess.getDecisionAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3000:1: ( rule__Decision__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3000:2: rule__Decision__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Decision__NameAssignment_1_in_rule__Decision__Group__1__Impl6001);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3010:1: rule__Decision__Group__2 : rule__Decision__Group__2__Impl ;
    public final void rule__Decision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3014:1: ( rule__Decision__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3015:2: rule__Decision__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Decision__Group__2__Impl_in_rule__Decision__Group__26031);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3021:1: rule__Decision__Group__2__Impl : ( ( rule__Decision__LabelAssignment_2 )? ) ;
    public final void rule__Decision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3025:1: ( ( ( rule__Decision__LabelAssignment_2 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3026:1: ( ( rule__Decision__LabelAssignment_2 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3026:1: ( ( rule__Decision__LabelAssignment_2 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3027:1: ( rule__Decision__LabelAssignment_2 )?
            {
             before(grammarAccess.getDecisionAccess().getLabelAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3028:1: ( rule__Decision__LabelAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3028:2: rule__Decision__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Decision__LabelAssignment_2_in_rule__Decision__Group__2__Impl6058);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3044:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3048:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3049:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__06095);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__1_in_rule__Step__Group__06098);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3056:1: rule__Step__Group__0__Impl : ( 'Step' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3060:1: ( ( 'Step' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3061:1: ( 'Step' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3061:1: ( 'Step' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3062:1: 'Step'
            {
             before(grammarAccess.getStepAccess().getStepKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Step__Group__0__Impl6126); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3075:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3079:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3080:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__16157);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__2_in_rule__Step__Group__16160);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3087:1: rule__Step__Group__1__Impl : ( ( rule__Step__NameAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3091:1: ( ( ( rule__Step__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3092:1: ( ( rule__Step__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3092:1: ( ( rule__Step__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3093:1: ( rule__Step__NameAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3094:1: ( rule__Step__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3094:2: rule__Step__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Step__NameAssignment_1_in_rule__Step__Group__1__Impl6187);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3104:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3108:1: ( rule__Step__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3109:2: rule__Step__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__26217);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3115:1: rule__Step__Group__2__Impl : ( ( rule__Step__LabelAssignment_2 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3119:1: ( ( ( rule__Step__LabelAssignment_2 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3120:1: ( ( rule__Step__LabelAssignment_2 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3120:1: ( ( rule__Step__LabelAssignment_2 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3121:1: ( rule__Step__LabelAssignment_2 )?
            {
             before(grammarAccess.getStepAccess().getLabelAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3122:1: ( rule__Step__LabelAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3122:2: rule__Step__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Step__LabelAssignment_2_in_rule__Step__Group__2__Impl6244);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3138:1: rule__InitialTransition__Group__0 : rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1 ;
    public final void rule__InitialTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3142:1: ( rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3143:2: rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__0__Impl_in_rule__InitialTransition__Group__06281);
            rule__InitialTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__1_in_rule__InitialTransition__Group__06284);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3150:1: rule__InitialTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__InitialTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3154:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3155:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3155:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3156:1: 'Transition'
            {
             before(grammarAccess.getInitialTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__InitialTransition__Group__0__Impl6312); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3169:1: rule__InitialTransition__Group__1 : rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2 ;
    public final void rule__InitialTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3173:1: ( rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3174:2: rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__1__Impl_in_rule__InitialTransition__Group__16343);
            rule__InitialTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__2_in_rule__InitialTransition__Group__16346);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3181:1: rule__InitialTransition__Group__1__Impl : ( 'initial' ) ;
    public final void rule__InitialTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3185:1: ( ( 'initial' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3186:1: ( 'initial' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3186:1: ( 'initial' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3187:1: 'initial'
            {
             before(grammarAccess.getInitialTransitionAccess().getInitialKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__InitialTransition__Group__1__Impl6374); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3200:1: rule__InitialTransition__Group__2 : rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3 ;
    public final void rule__InitialTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3204:1: ( rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3205:2: rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__2__Impl_in_rule__InitialTransition__Group__26405);
            rule__InitialTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__3_in_rule__InitialTransition__Group__26408);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3212:1: rule__InitialTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__InitialTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3216:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3217:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3217:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3218:1: 'to'
            {
             before(grammarAccess.getInitialTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__InitialTransition__Group__2__Impl6436); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3231:1: rule__InitialTransition__Group__3 : rule__InitialTransition__Group__3__Impl ;
    public final void rule__InitialTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3235:1: ( rule__InitialTransition__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3236:2: rule__InitialTransition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__3__Impl_in_rule__InitialTransition__Group__36467);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3242:1: rule__InitialTransition__Group__3__Impl : ( ( rule__InitialTransition__ToAssignment_3 ) ) ;
    public final void rule__InitialTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3246:1: ( ( ( rule__InitialTransition__ToAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3247:1: ( ( rule__InitialTransition__ToAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3247:1: ( ( rule__InitialTransition__ToAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3248:1: ( rule__InitialTransition__ToAssignment_3 )
            {
             before(grammarAccess.getInitialTransitionAccess().getToAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3249:1: ( rule__InitialTransition__ToAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3249:2: rule__InitialTransition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__InitialTransition__ToAssignment_3_in_rule__InitialTransition__Group__3__Impl6494);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3267:1: rule__FinalTransition__Group__0 : rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1 ;
    public final void rule__FinalTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3271:1: ( rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3272:2: rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__0__Impl_in_rule__FinalTransition__Group__06532);
            rule__FinalTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__1_in_rule__FinalTransition__Group__06535);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3279:1: rule__FinalTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__FinalTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3283:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3284:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3284:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3285:1: 'Transition'
            {
             before(grammarAccess.getFinalTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__FinalTransition__Group__0__Impl6563); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3298:1: rule__FinalTransition__Group__1 : rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2 ;
    public final void rule__FinalTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3302:1: ( rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3303:2: rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__1__Impl_in_rule__FinalTransition__Group__16594);
            rule__FinalTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__2_in_rule__FinalTransition__Group__16597);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3310:1: rule__FinalTransition__Group__1__Impl : ( ( rule__FinalTransition__FromAssignment_1 ) ) ;
    public final void rule__FinalTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3314:1: ( ( ( rule__FinalTransition__FromAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3315:1: ( ( rule__FinalTransition__FromAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3315:1: ( ( rule__FinalTransition__FromAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3316:1: ( rule__FinalTransition__FromAssignment_1 )
            {
             before(grammarAccess.getFinalTransitionAccess().getFromAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3317:1: ( rule__FinalTransition__FromAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3317:2: rule__FinalTransition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__FinalTransition__FromAssignment_1_in_rule__FinalTransition__Group__1__Impl6624);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3327:1: rule__FinalTransition__Group__2 : rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3 ;
    public final void rule__FinalTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3331:1: ( rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3332:2: rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__2__Impl_in_rule__FinalTransition__Group__26654);
            rule__FinalTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__3_in_rule__FinalTransition__Group__26657);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3339:1: rule__FinalTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__FinalTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3343:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3344:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3344:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3345:1: 'to'
            {
             before(grammarAccess.getFinalTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__FinalTransition__Group__2__Impl6685); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3358:1: rule__FinalTransition__Group__3 : rule__FinalTransition__Group__3__Impl ;
    public final void rule__FinalTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3362:1: ( rule__FinalTransition__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3363:2: rule__FinalTransition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__3__Impl_in_rule__FinalTransition__Group__36716);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3369:1: rule__FinalTransition__Group__3__Impl : ( 'final' ) ;
    public final void rule__FinalTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3373:1: ( ( 'final' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3374:1: ( 'final' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3374:1: ( 'final' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3375:1: 'final'
            {
             before(grammarAccess.getFinalTransitionAccess().getFinalKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__FinalTransition__Group__3__Impl6744); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3396:1: rule__DecisionTransition__Group__0 : rule__DecisionTransition__Group__0__Impl rule__DecisionTransition__Group__1 ;
    public final void rule__DecisionTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3400:1: ( rule__DecisionTransition__Group__0__Impl rule__DecisionTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3401:2: rule__DecisionTransition__Group__0__Impl rule__DecisionTransition__Group__1
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__0__Impl_in_rule__DecisionTransition__Group__06783);
            rule__DecisionTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__1_in_rule__DecisionTransition__Group__06786);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3408:1: rule__DecisionTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__DecisionTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3412:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3413:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3413:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3414:1: 'Transition'
            {
             before(grammarAccess.getDecisionTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__DecisionTransition__Group__0__Impl6814); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3427:1: rule__DecisionTransition__Group__1 : rule__DecisionTransition__Group__1__Impl rule__DecisionTransition__Group__2 ;
    public final void rule__DecisionTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3431:1: ( rule__DecisionTransition__Group__1__Impl rule__DecisionTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3432:2: rule__DecisionTransition__Group__1__Impl rule__DecisionTransition__Group__2
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__1__Impl_in_rule__DecisionTransition__Group__16845);
            rule__DecisionTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__2_in_rule__DecisionTransition__Group__16848);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3439:1: rule__DecisionTransition__Group__1__Impl : ( ( rule__DecisionTransition__FromAssignment_1 ) ) ;
    public final void rule__DecisionTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3443:1: ( ( ( rule__DecisionTransition__FromAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3444:1: ( ( rule__DecisionTransition__FromAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3444:1: ( ( rule__DecisionTransition__FromAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3445:1: ( rule__DecisionTransition__FromAssignment_1 )
            {
             before(grammarAccess.getDecisionTransitionAccess().getFromAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3446:1: ( rule__DecisionTransition__FromAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3446:2: rule__DecisionTransition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__DecisionTransition__FromAssignment_1_in_rule__DecisionTransition__Group__1__Impl6875);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3456:1: rule__DecisionTransition__Group__2 : rule__DecisionTransition__Group__2__Impl rule__DecisionTransition__Group__3 ;
    public final void rule__DecisionTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3460:1: ( rule__DecisionTransition__Group__2__Impl rule__DecisionTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3461:2: rule__DecisionTransition__Group__2__Impl rule__DecisionTransition__Group__3
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__2__Impl_in_rule__DecisionTransition__Group__26905);
            rule__DecisionTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__3_in_rule__DecisionTransition__Group__26908);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3468:1: rule__DecisionTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__DecisionTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3472:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3473:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3473:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3474:1: 'to'
            {
             before(grammarAccess.getDecisionTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__DecisionTransition__Group__2__Impl6936); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3487:1: rule__DecisionTransition__Group__3 : rule__DecisionTransition__Group__3__Impl rule__DecisionTransition__Group__4 ;
    public final void rule__DecisionTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3491:1: ( rule__DecisionTransition__Group__3__Impl rule__DecisionTransition__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3492:2: rule__DecisionTransition__Group__3__Impl rule__DecisionTransition__Group__4
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__3__Impl_in_rule__DecisionTransition__Group__36967);
            rule__DecisionTransition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecisionTransition__Group__4_in_rule__DecisionTransition__Group__36970);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3499:1: rule__DecisionTransition__Group__3__Impl : ( ( rule__DecisionTransition__ToAssignment_3 ) ) ;
    public final void rule__DecisionTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3503:1: ( ( ( rule__DecisionTransition__ToAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3504:1: ( ( rule__DecisionTransition__ToAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3504:1: ( ( rule__DecisionTransition__ToAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3505:1: ( rule__DecisionTransition__ToAssignment_3 )
            {
             before(grammarAccess.getDecisionTransitionAccess().getToAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3506:1: ( rule__DecisionTransition__ToAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3506:2: rule__DecisionTransition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__DecisionTransition__ToAssignment_3_in_rule__DecisionTransition__Group__3__Impl6997);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3516:1: rule__DecisionTransition__Group__4 : rule__DecisionTransition__Group__4__Impl ;
    public final void rule__DecisionTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3520:1: ( rule__DecisionTransition__Group__4__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3521:2: rule__DecisionTransition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DecisionTransition__Group__4__Impl_in_rule__DecisionTransition__Group__47027);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3527:1: rule__DecisionTransition__Group__4__Impl : ( ( rule__DecisionTransition__GuardAssignment_4 ) ) ;
    public final void rule__DecisionTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3531:1: ( ( ( rule__DecisionTransition__GuardAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3532:1: ( ( rule__DecisionTransition__GuardAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3532:1: ( ( rule__DecisionTransition__GuardAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3533:1: ( rule__DecisionTransition__GuardAssignment_4 )
            {
             before(grammarAccess.getDecisionTransitionAccess().getGuardAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3534:1: ( rule__DecisionTransition__GuardAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3534:2: rule__DecisionTransition__GuardAssignment_4
            {
            pushFollow(FOLLOW_rule__DecisionTransition__GuardAssignment_4_in_rule__DecisionTransition__Group__4__Impl7054);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3554:1: rule__NonInitialTransition__Group__0 : rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1 ;
    public final void rule__NonInitialTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3558:1: ( rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3559:2: rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__0__Impl_in_rule__NonInitialTransition__Group__07094);
            rule__NonInitialTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__1_in_rule__NonInitialTransition__Group__07097);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3566:1: rule__NonInitialTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__NonInitialTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3570:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3571:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3571:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3572:1: 'Transition'
            {
             before(grammarAccess.getNonInitialTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__NonInitialTransition__Group__0__Impl7125); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3585:1: rule__NonInitialTransition__Group__1 : rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2 ;
    public final void rule__NonInitialTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3589:1: ( rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3590:2: rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__1__Impl_in_rule__NonInitialTransition__Group__17156);
            rule__NonInitialTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__2_in_rule__NonInitialTransition__Group__17159);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3597:1: rule__NonInitialTransition__Group__1__Impl : ( ( rule__NonInitialTransition__FromAssignment_1 ) ) ;
    public final void rule__NonInitialTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3601:1: ( ( ( rule__NonInitialTransition__FromAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3602:1: ( ( rule__NonInitialTransition__FromAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3602:1: ( ( rule__NonInitialTransition__FromAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3603:1: ( rule__NonInitialTransition__FromAssignment_1 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3604:1: ( rule__NonInitialTransition__FromAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3604:2: rule__NonInitialTransition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__FromAssignment_1_in_rule__NonInitialTransition__Group__1__Impl7186);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3614:1: rule__NonInitialTransition__Group__2 : rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3 ;
    public final void rule__NonInitialTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3618:1: ( rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3619:2: rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__2__Impl_in_rule__NonInitialTransition__Group__27216);
            rule__NonInitialTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__3_in_rule__NonInitialTransition__Group__27219);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3626:1: rule__NonInitialTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__NonInitialTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3630:1: ( ( 'to' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3631:1: ( 'to' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3631:1: ( 'to' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3632:1: 'to'
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__NonInitialTransition__Group__2__Impl7247); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3645:1: rule__NonInitialTransition__Group__3 : rule__NonInitialTransition__Group__3__Impl ;
    public final void rule__NonInitialTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3649:1: ( rule__NonInitialTransition__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3650:2: rule__NonInitialTransition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__3__Impl_in_rule__NonInitialTransition__Group__37278);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3656:1: rule__NonInitialTransition__Group__3__Impl : ( ( rule__NonInitialTransition__ToAssignment_3 ) ) ;
    public final void rule__NonInitialTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3660:1: ( ( ( rule__NonInitialTransition__ToAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3661:1: ( ( rule__NonInitialTransition__ToAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3661:1: ( ( rule__NonInitialTransition__ToAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3662:1: ( rule__NonInitialTransition__ToAssignment_3 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3663:1: ( rule__NonInitialTransition__ToAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3663:2: rule__NonInitialTransition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__ToAssignment_3_in_rule__NonInitialTransition__Group__3__Impl7305);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3681:1: rule__Textfield__Group__0 : rule__Textfield__Group__0__Impl rule__Textfield__Group__1 ;
    public final void rule__Textfield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3685:1: ( rule__Textfield__Group__0__Impl rule__Textfield__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3686:2: rule__Textfield__Group__0__Impl rule__Textfield__Group__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group__0__Impl_in_rule__Textfield__Group__07343);
            rule__Textfield__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__1_in_rule__Textfield__Group__07346);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3693:1: rule__Textfield__Group__0__Impl : ( ( rule__Textfield__Group_0__0 )? ) ;
    public final void rule__Textfield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3697:1: ( ( ( rule__Textfield__Group_0__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3698:1: ( ( rule__Textfield__Group_0__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3698:1: ( ( rule__Textfield__Group_0__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3699:1: ( rule__Textfield__Group_0__0 )?
            {
             before(grammarAccess.getTextfieldAccess().getGroup_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3700:1: ( rule__Textfield__Group_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3700:2: rule__Textfield__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Textfield__Group_0__0_in_rule__Textfield__Group__0__Impl7373);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3710:1: rule__Textfield__Group__1 : rule__Textfield__Group__1__Impl rule__Textfield__Group__2 ;
    public final void rule__Textfield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3714:1: ( rule__Textfield__Group__1__Impl rule__Textfield__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3715:2: rule__Textfield__Group__1__Impl rule__Textfield__Group__2
            {
            pushFollow(FOLLOW_rule__Textfield__Group__1__Impl_in_rule__Textfield__Group__17404);
            rule__Textfield__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__2_in_rule__Textfield__Group__17407);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3722:1: rule__Textfield__Group__1__Impl : ( 'summary' ) ;
    public final void rule__Textfield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3726:1: ( ( 'summary' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3727:1: ( 'summary' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3727:1: ( 'summary' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3728:1: 'summary'
            {
             before(grammarAccess.getTextfieldAccess().getSummaryKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__Textfield__Group__1__Impl7435); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3741:1: rule__Textfield__Group__2 : rule__Textfield__Group__2__Impl rule__Textfield__Group__3 ;
    public final void rule__Textfield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3745:1: ( rule__Textfield__Group__2__Impl rule__Textfield__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3746:2: rule__Textfield__Group__2__Impl rule__Textfield__Group__3
            {
            pushFollow(FOLLOW_rule__Textfield__Group__2__Impl_in_rule__Textfield__Group__27466);
            rule__Textfield__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__3_in_rule__Textfield__Group__27469);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3753:1: rule__Textfield__Group__2__Impl : ( ( rule__Textfield__SummaryAssignment_2 ) ) ;
    public final void rule__Textfield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3757:1: ( ( ( rule__Textfield__SummaryAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3758:1: ( ( rule__Textfield__SummaryAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3758:1: ( ( rule__Textfield__SummaryAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3759:1: ( rule__Textfield__SummaryAssignment_2 )
            {
             before(grammarAccess.getTextfieldAccess().getSummaryAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3760:1: ( rule__Textfield__SummaryAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3760:2: rule__Textfield__SummaryAssignment_2
            {
            pushFollow(FOLLOW_rule__Textfield__SummaryAssignment_2_in_rule__Textfield__Group__2__Impl7496);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3770:1: rule__Textfield__Group__3 : rule__Textfield__Group__3__Impl ;
    public final void rule__Textfield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3774:1: ( rule__Textfield__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3775:2: rule__Textfield__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group__3__Impl_in_rule__Textfield__Group__37526);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3781:1: rule__Textfield__Group__3__Impl : ( ( rule__Textfield__Group_3__0 )? ) ;
    public final void rule__Textfield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3785:1: ( ( ( rule__Textfield__Group_3__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3786:1: ( ( rule__Textfield__Group_3__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3786:1: ( ( rule__Textfield__Group_3__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3787:1: ( rule__Textfield__Group_3__0 )?
            {
             before(grammarAccess.getTextfieldAccess().getGroup_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3788:1: ( rule__Textfield__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3788:2: rule__Textfield__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Textfield__Group_3__0_in_rule__Textfield__Group__3__Impl7553);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3806:1: rule__Textfield__Group_0__0 : rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1 ;
    public final void rule__Textfield__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3810:1: ( rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3811:2: rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group_0__0__Impl_in_rule__Textfield__Group_0__07592);
            rule__Textfield__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group_0__1_in_rule__Textfield__Group_0__07595);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3818:1: rule__Textfield__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__Textfield__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3822:1: ( ( 'label' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3823:1: ( 'label' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3823:1: ( 'label' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3824:1: 'label'
            {
             before(grammarAccess.getTextfieldAccess().getLabelKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Textfield__Group_0__0__Impl7623); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3837:1: rule__Textfield__Group_0__1 : rule__Textfield__Group_0__1__Impl ;
    public final void rule__Textfield__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3841:1: ( rule__Textfield__Group_0__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3842:2: rule__Textfield__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group_0__1__Impl_in_rule__Textfield__Group_0__17654);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3848:1: rule__Textfield__Group_0__1__Impl : ( ( rule__Textfield__LabelAssignment_0_1 ) ) ;
    public final void rule__Textfield__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3852:1: ( ( ( rule__Textfield__LabelAssignment_0_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3853:1: ( ( rule__Textfield__LabelAssignment_0_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3853:1: ( ( rule__Textfield__LabelAssignment_0_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3854:1: ( rule__Textfield__LabelAssignment_0_1 )
            {
             before(grammarAccess.getTextfieldAccess().getLabelAssignment_0_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3855:1: ( rule__Textfield__LabelAssignment_0_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3855:2: rule__Textfield__LabelAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Textfield__LabelAssignment_0_1_in_rule__Textfield__Group_0__1__Impl7681);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3869:1: rule__Textfield__Group_3__0 : rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1 ;
    public final void rule__Textfield__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3873:1: ( rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3874:2: rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group_3__0__Impl_in_rule__Textfield__Group_3__07715);
            rule__Textfield__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group_3__1_in_rule__Textfield__Group_3__07718);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3881:1: rule__Textfield__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Textfield__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3885:1: ( ( 'description' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3886:1: ( 'description' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3886:1: ( 'description' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3887:1: 'description'
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionKeyword_3_0()); 
            match(input,39,FOLLOW_39_in_rule__Textfield__Group_3__0__Impl7746); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3900:1: rule__Textfield__Group_3__1 : rule__Textfield__Group_3__1__Impl ;
    public final void rule__Textfield__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3904:1: ( rule__Textfield__Group_3__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3905:2: rule__Textfield__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group_3__1__Impl_in_rule__Textfield__Group_3__17777);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3911:1: rule__Textfield__Group_3__1__Impl : ( ( rule__Textfield__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Textfield__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3915:1: ( ( ( rule__Textfield__DescriptionAssignment_3_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3916:1: ( ( rule__Textfield__DescriptionAssignment_3_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3916:1: ( ( rule__Textfield__DescriptionAssignment_3_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3917:1: ( rule__Textfield__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionAssignment_3_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3918:1: ( rule__Textfield__DescriptionAssignment_3_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3918:2: rule__Textfield__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Textfield__DescriptionAssignment_3_1_in_rule__Textfield__Group_3__1__Impl7804);
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


    // $ANTLR start "rule__Link__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3932:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3936:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3937:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__07838);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__07841);
            rule__Link__Group__1();

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
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3944:1: rule__Link__Group__0__Impl : ( 'link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3948:1: ( ( 'link' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3949:1: ( 'link' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3949:1: ( 'link' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3950:1: 'link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Link__Group__0__Impl7869); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3963:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3967:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3968:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__17900);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__17903);
            rule__Link__Group__2();

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
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3975:1: rule__Link__Group__1__Impl : ( ( rule__Link__DescriptionAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3979:1: ( ( ( rule__Link__DescriptionAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3980:1: ( ( rule__Link__DescriptionAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3980:1: ( ( rule__Link__DescriptionAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3981:1: ( rule__Link__DescriptionAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3982:1: ( rule__Link__DescriptionAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3982:2: rule__Link__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__DescriptionAssignment_1_in_rule__Link__Group__1__Impl7930);
            rule__Link__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3992:1: rule__Link__Group__2 : rule__Link__Group__2__Impl ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3996:1: ( rule__Link__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3997:2: rule__Link__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__27960);
            rule__Link__Group__2__Impl();

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
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4003:1: rule__Link__Group__2__Impl : ( ( rule__Link__UrlAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4007:1: ( ( ( rule__Link__UrlAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4008:1: ( ( rule__Link__UrlAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4008:1: ( ( rule__Link__UrlAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4009:1: ( rule__Link__UrlAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4010:1: ( rule__Link__UrlAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4010:2: rule__Link__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__UrlAssignment_2_in_rule__Link__Group__2__Impl7987);
            rule__Link__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Model__ActivitiesAssignment_0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4027:1: rule__Model__ActivitiesAssignment_0 : ( ruleActivity ) ;
    public final void rule__Model__ActivitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4031:1: ( ( ruleActivity ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4032:1: ( ruleActivity )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4032:1: ( ruleActivity )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4033:1: ruleActivity
            {
             before(grammarAccess.getModelAccess().getActivitiesActivityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleActivity_in_rule__Model__ActivitiesAssignment_08028);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4042:1: rule__Model__RolesAssignment_1 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4046:1: ( ( ruleRole ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4047:1: ( ruleRole )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4047:1: ( ruleRole )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4048:1: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Model__RolesAssignment_18059);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4057:1: rule__Model__WorkProductsAssignment_2 : ( ruleWorkProduct ) ;
    public final void rule__Model__WorkProductsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4061:1: ( ( ruleWorkProduct ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4062:1: ( ruleWorkProduct )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4062:1: ( ruleWorkProduct )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4063:1: ruleWorkProduct
            {
             before(grammarAccess.getModelAccess().getWorkProductsWorkProductParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWorkProduct_in_rule__Model__WorkProductsAssignment_28090);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4072:1: rule__Model__WorkProductTypesAssignment_3 : ( ruleWorkProductType ) ;
    public final void rule__Model__WorkProductTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4076:1: ( ( ruleWorkProductType ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4077:1: ( ruleWorkProductType )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4077:1: ( ruleWorkProductType )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4078:1: ruleWorkProductType
            {
             before(grammarAccess.getModelAccess().getWorkProductTypesWorkProductTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWorkProductType_in_rule__Model__WorkProductTypesAssignment_38121);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4087:1: rule__Model__GuidancesAssignment_4 : ( ruleGuidance ) ;
    public final void rule__Model__GuidancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4091:1: ( ( ruleGuidance ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4092:1: ( ruleGuidance )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4092:1: ( ruleGuidance )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4093:1: ruleGuidance
            {
             before(grammarAccess.getModelAccess().getGuidancesGuidanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleGuidance_in_rule__Model__GuidancesAssignment_48152);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4102:1: rule__Model__GuidanceTypesAssignment_5 : ( ruleGuidanceType ) ;
    public final void rule__Model__GuidanceTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4106:1: ( ( ruleGuidanceType ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4107:1: ( ruleGuidanceType )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4107:1: ( ruleGuidanceType )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4108:1: ruleGuidanceType
            {
             before(grammarAccess.getModelAccess().getGuidanceTypesGuidanceTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleGuidanceType_in_rule__Model__GuidanceTypesAssignment_58183);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4117:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4121:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4122:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4122:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4123:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_18214); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4132:1: rule__Role__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__Role__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4136:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4137:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4137:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4138:1: ruleTextfield
            {
             before(grammarAccess.getRoleAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Role__TextfieldAssignment_28245);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4147:1: rule__WorkProductType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkProductType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4151:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4152:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4152:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4153:1: RULE_ID
            {
             before(grammarAccess.getWorkProductTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProductType__NameAssignment_18276); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4162:1: rule__WorkProductType__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__WorkProductType__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4166:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4167:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4167:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4168:1: ruleTextfield
            {
             before(grammarAccess.getWorkProductTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__WorkProductType__TextfieldAssignment_28307);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4177:1: rule__WorkProduct__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkProduct__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4181:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4182:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4182:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4183:1: RULE_ID
            {
             before(grammarAccess.getWorkProductAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProduct__NameAssignment_18338); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4192:1: rule__WorkProduct__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkProduct__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4196:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4197:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4197:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4198:1: ( RULE_ID )
            {
             before(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4199:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4200:1: RULE_ID
            {
             before(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProduct__TypeAssignment_38373); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4211:1: rule__WorkProduct__TextfieldAssignment_4 : ( ruleTextfield ) ;
    public final void rule__WorkProduct__TextfieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4215:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4216:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4216:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4217:1: ruleTextfield
            {
             before(grammarAccess.getWorkProductAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__WorkProduct__TextfieldAssignment_48408);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4226:1: rule__WorkProduct__StatesAssignment_5_1 : ( ruleState ) ;
    public final void rule__WorkProduct__StatesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4230:1: ( ( ruleState ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4231:1: ( ruleState )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4231:1: ( ruleState )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4232:1: ruleState
            {
             before(grammarAccess.getWorkProductAccess().getStatesStateParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__WorkProduct__StatesAssignment_5_18439);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4241:1: rule__WorkProduct__StatesAssignment_5_2_1 : ( ruleState ) ;
    public final void rule__WorkProduct__StatesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4245:1: ( ( ruleState ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4246:1: ( ruleState )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4246:1: ( ruleState )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4247:1: ruleState
            {
             before(grammarAccess.getWorkProductAccess().getStatesStateParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__WorkProduct__StatesAssignment_5_2_18470);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4256:1: rule__GuidanceType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GuidanceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4260:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4261:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4261:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4262:1: RULE_ID
            {
             before(grammarAccess.getGuidanceTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GuidanceType__NameAssignment_18501); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4271:1: rule__GuidanceType__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__GuidanceType__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4275:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4276:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4276:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4277:1: ruleTextfield
            {
             before(grammarAccess.getGuidanceTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__GuidanceType__TextfieldAssignment_28532);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4286:1: rule__Guidance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Guidance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4290:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4291:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4291:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4292:1: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guidance__NameAssignment_18563); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4301:1: rule__Guidance__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4305:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4306:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4306:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4307:1: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4308:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4309:1: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guidance__TypeAssignment_38598); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4320:1: rule__Guidance__TextfieldAssignment_4 : ( ruleTextfield ) ;
    public final void rule__Guidance__TextfieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4324:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4325:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4325:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4326:1: ruleTextfield
            {
             before(grammarAccess.getGuidanceAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Guidance__TextfieldAssignment_48633);
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


    // $ANTLR start "rule__Guidance__LinksAssignment_5"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4335:1: rule__Guidance__LinksAssignment_5 : ( ruleLink ) ;
    public final void rule__Guidance__LinksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4339:1: ( ( ruleLink ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4340:1: ( ruleLink )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4340:1: ( ruleLink )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4341:1: ruleLink
            {
             before(grammarAccess.getGuidanceAccess().getLinksLinkParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__Guidance__LinksAssignment_58664);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getLinksLinkParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__LinksAssignment_5"


    // $ANTLR start "rule__State__NameAssignment"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4350:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4354:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4355:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4355:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4356:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment8695); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4365:1: rule__Port__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Port__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4369:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4370:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4370:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4371:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getTypeWorkProductCrossReference_0_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4372:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4373:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getTypeWorkProductIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__TypeAssignment_08730); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4384:1: rule__Port__StateAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Port__StateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4388:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4389:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4389:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4390:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getStateStateCrossReference_1_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4391:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4392:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getStateStateIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__StateAssignment_1_18769); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4403:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4407:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4408:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4408:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4409:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_18804); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4418:1: rule__Activity__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__Activity__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4422:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4423:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4423:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4424:1: ruleTextfield
            {
             before(grammarAccess.getActivityAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Activity__TextfieldAssignment_28835);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4433:1: rule__Activity__RoleAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__RoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4437:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4438:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4438:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4439:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getRoleRoleCrossReference_4_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4440:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4441:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getRoleRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__RoleAssignment_48870); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4452:1: rule__Activity__InPortsAssignment_5_1 : ( rulePort ) ;
    public final void rule__Activity__InPortsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4456:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4457:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4457:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4458:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_18905);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4467:1: rule__Activity__InPortsAssignment_5_2_1 : ( rulePort ) ;
    public final void rule__Activity__InPortsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4471:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4472:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4472:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4473:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_2_18936);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4482:1: rule__Activity__OutPortsAssignment_6_1 : ( rulePort ) ;
    public final void rule__Activity__OutPortsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4486:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4487:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4487:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4488:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_18967);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4497:1: rule__Activity__OutPortsAssignment_6_2_1 : ( rulePort ) ;
    public final void rule__Activity__OutPortsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4501:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4502:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4502:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4503:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_2_18998);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4512:1: rule__Activity__SubActivitiesAssignment_7_1 : ( ruleActivityRef ) ;
    public final void rule__Activity__SubActivitiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4516:1: ( ( ruleActivityRef ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4517:1: ( ruleActivityRef )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4517:1: ( ruleActivityRef )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4518:1: ruleActivityRef
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_19029);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4527:1: rule__Activity__SubActivitiesAssignment_7_2_1 : ( ruleActivityRef ) ;
    public final void rule__Activity__SubActivitiesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4531:1: ( ( ruleActivityRef ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4532:1: ( ruleActivityRef )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4532:1: ( ruleActivityRef )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4533:1: ruleActivityRef
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_2_19060);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4542:1: rule__Activity__GuidancesAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__GuidancesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4546:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4547:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4547:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4548:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4549:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4550:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_19095); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4561:1: rule__Activity__GuidancesAssignment_8_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__GuidancesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4565:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4566:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4566:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4567:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_2_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4568:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4569:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_2_19134); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4580:1: rule__Activity__StepsAssignment_9_2_0 : ( ruleStep ) ;
    public final void rule__Activity__StepsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4584:1: ( ( ruleStep ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4585:1: ( ruleStep )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4585:1: ( ruleStep )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4586:1: ruleStep
            {
             before(grammarAccess.getActivityAccess().getStepsStepParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Activity__StepsAssignment_9_2_09169);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4595:1: rule__Activity__DecisionsAssignment_9_2_1 : ( ruleDecision ) ;
    public final void rule__Activity__DecisionsAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4599:1: ( ( ruleDecision ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4600:1: ( ruleDecision )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4600:1: ( ruleDecision )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4601:1: ruleDecision
            {
             before(grammarAccess.getActivityAccess().getDecisionsDecisionParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_ruleDecision_in_rule__Activity__DecisionsAssignment_9_2_19200);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4610:1: rule__Activity__TransitionsAssignment_9_2_2 : ( ruleTransition ) ;
    public final void rule__Activity__TransitionsAssignment_9_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4614:1: ( ( ruleTransition ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4615:1: ( ruleTransition )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4615:1: ( ruleTransition )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4616:1: ruleTransition
            {
             before(grammarAccess.getActivityAccess().getTransitionsTransitionParserRuleCall_9_2_2_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__Activity__TransitionsAssignment_9_2_29231);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4625:1: rule__ActivityRef__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ActivityRef__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4629:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4630:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4630:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4631:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityRefAccess().getTypeActivityCrossReference_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4632:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4633:1: RULE_ID
            {
             before(grammarAccess.getActivityRefAccess().getTypeActivityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityRef__TypeAssignment9266); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4644:1: rule__Decision__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decision__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4648:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4649:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4649:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4650:1: RULE_ID
            {
             before(grammarAccess.getDecisionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decision__NameAssignment_19301); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4659:1: rule__Decision__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Decision__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4663:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4664:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4664:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4665:1: RULE_STRING
            {
             before(grammarAccess.getDecisionAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Decision__LabelAssignment_29332); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4674:1: rule__Step__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Step__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4678:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4679:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4679:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4680:1: RULE_ID
            {
             before(grammarAccess.getStepAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Step__NameAssignment_19363); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4689:1: rule__Step__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Step__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4693:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4694:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4694:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4695:1: RULE_STRING
            {
             before(grammarAccess.getStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Step__LabelAssignment_29394); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4704:1: rule__InitialTransition__ToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InitialTransition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4708:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4709:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4709:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4710:1: ( RULE_ID )
            {
             before(grammarAccess.getInitialTransitionAccess().getToNodeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4711:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4712:1: RULE_ID
            {
             before(grammarAccess.getInitialTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InitialTransition__ToAssignment_39429); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4723:1: rule__FinalTransition__FromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FinalTransition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4727:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4728:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4728:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4729:1: ( RULE_ID )
            {
             before(grammarAccess.getFinalTransitionAccess().getFromNodeCrossReference_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4730:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4731:1: RULE_ID
            {
             before(grammarAccess.getFinalTransitionAccess().getFromNodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FinalTransition__FromAssignment_19468); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4742:1: rule__DecisionTransition__FromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DecisionTransition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4746:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4747:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4747:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4748:1: ( RULE_ID )
            {
             before(grammarAccess.getDecisionTransitionAccess().getFromDecisionCrossReference_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4749:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4750:1: RULE_ID
            {
             before(grammarAccess.getDecisionTransitionAccess().getFromDecisionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DecisionTransition__FromAssignment_19507); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4761:1: rule__DecisionTransition__ToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DecisionTransition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4765:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4766:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4766:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4767:1: ( RULE_ID )
            {
             before(grammarAccess.getDecisionTransitionAccess().getToNodeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4768:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4769:1: RULE_ID
            {
             before(grammarAccess.getDecisionTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DecisionTransition__ToAssignment_39546); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4780:1: rule__DecisionTransition__GuardAssignment_4 : ( RULE_STRING ) ;
    public final void rule__DecisionTransition__GuardAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4784:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4785:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4785:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4786:1: RULE_STRING
            {
             before(grammarAccess.getDecisionTransitionAccess().getGuardSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecisionTransition__GuardAssignment_49581); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4795:1: rule__NonInitialTransition__FromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NonInitialTransition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4799:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4800:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4800:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4801:1: ( RULE_ID )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromNodeCrossReference_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4802:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4803:1: RULE_ID
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromNodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonInitialTransition__FromAssignment_19616); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4814:1: rule__NonInitialTransition__ToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__NonInitialTransition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4818:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4819:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4819:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4820:1: ( RULE_ID )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToNodeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4821:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4822:1: RULE_ID
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToNodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonInitialTransition__ToAssignment_39655); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4833:1: rule__Textfield__LabelAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Textfield__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4837:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4838:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4838:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4839:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getLabelSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__LabelAssignment_0_19690); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4848:1: rule__Textfield__SummaryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Textfield__SummaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4852:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4853:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4853:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4854:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getSummarySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__SummaryAssignment_29721); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4863:1: rule__Textfield__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Textfield__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4867:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4868:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4868:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4869:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__DescriptionAssignment_3_19752); 
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


    // $ANTLR start "rule__Link__DescriptionAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4878:1: rule__Link__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4882:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4883:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4883:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4884:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_19783); 
             after(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__DescriptionAssignment_1"


    // $ANTLR start "rule__Link__UrlAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4893:1: rule__Link__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Link__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4897:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4898:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4898:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4899:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__UrlAssignment_29814); 
             after(grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__UrlAssignment_2"

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
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ActivitiesAssignment_0_in_rule__Model__Alternatives1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RolesAssignment_1_in_rule__Model__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorkProductsAssignment_2_in_rule__Model__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorkProductTypesAssignment_3_in_rule__Model__Alternatives1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GuidancesAssignment_4_in_rule__Model__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GuidanceTypesAssignment_5_in_rule__Model__Alternatives1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__StepsAssignment_9_2_0_in_rule__Activity__Alternatives_9_21339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DecisionsAssignment_9_2_1_in_rule__Activity__Alternatives_9_21357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__TransitionsAssignment_9_2_2_in_rule__Activity__Alternatives_9_21375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_rule__Transition__Alternatives1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_rule__Transition__Alternatives1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_rule__Transition__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecisionTransition_in_rule__Transition__Alternatives1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__01490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__01493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Role__Group__0__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__11552 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__11555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__21612 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__21615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__TextfieldAssignment_2_in_rule__Role__Group__2__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__31672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Role__Group__3__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__0__Impl_in_rule__WorkProductType__Group__01739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__1_in_rule__WorkProductType__Group__01742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WorkProductType__Group__0__Impl1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__1__Impl_in_rule__WorkProductType__Group__11801 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__2_in_rule__WorkProductType__Group__11804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__NameAssignment_1_in_rule__WorkProductType__Group__1__Impl1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__2__Impl_in_rule__WorkProductType__Group__21861 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__3_in_rule__WorkProductType__Group__21864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__TextfieldAssignment_2_in_rule__WorkProductType__Group__2__Impl1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__3__Impl_in_rule__WorkProductType__Group__31921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkProductType__Group__3__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__0__Impl_in_rule__WorkProduct__Group__01988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__1_in_rule__WorkProduct__Group__01991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WorkProduct__Group__0__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__1__Impl_in_rule__WorkProduct__Group__12050 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__2_in_rule__WorkProduct__Group__12053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__NameAssignment_1_in_rule__WorkProduct__Group__1__Impl2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__2__Impl_in_rule__WorkProduct__Group__22110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__3_in_rule__WorkProduct__Group__22113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WorkProduct__Group__2__Impl2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__3__Impl_in_rule__WorkProduct__Group__32172 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__4_in_rule__WorkProduct__Group__32175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__TypeAssignment_3_in_rule__WorkProduct__Group__3__Impl2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__4__Impl_in_rule__WorkProduct__Group__42232 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__5_in_rule__WorkProduct__Group__42235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__TextfieldAssignment_4_in_rule__WorkProduct__Group__4__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__5__Impl_in_rule__WorkProduct__Group__52292 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__6_in_rule__WorkProduct__Group__52295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__0_in_rule__WorkProduct__Group__5__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__6__Impl_in_rule__WorkProduct__Group__62353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkProduct__Group__6__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__0__Impl_in_rule__WorkProduct__Group_5__02426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__1_in_rule__WorkProduct__Group_5__02429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WorkProduct__Group_5__0__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__1__Impl_in_rule__WorkProduct__Group_5__12488 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__2_in_rule__WorkProduct__Group_5__12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__StatesAssignment_5_1_in_rule__WorkProduct__Group_5__1__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5__2__Impl_in_rule__WorkProduct__Group_5__22548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5_2__0_in_rule__WorkProduct__Group_5__2__Impl2575 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5_2__0__Impl_in_rule__WorkProduct__Group_5_2__02612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5_2__1_in_rule__WorkProduct__Group_5_2__02615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WorkProduct__Group_5_2__0__Impl2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group_5_2__1__Impl_in_rule__WorkProduct__Group_5_2__12674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__StatesAssignment_5_2_1_in_rule__WorkProduct__Group_5_2__1__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__0__Impl_in_rule__GuidanceType__Group__02735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__1_in_rule__GuidanceType__Group__02738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GuidanceType__Group__0__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__1__Impl_in_rule__GuidanceType__Group__12797 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__2_in_rule__GuidanceType__Group__12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__NameAssignment_1_in_rule__GuidanceType__Group__1__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__2__Impl_in_rule__GuidanceType__Group__22857 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__3_in_rule__GuidanceType__Group__22860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__TextfieldAssignment_2_in_rule__GuidanceType__Group__2__Impl2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__3__Impl_in_rule__GuidanceType__Group__32917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GuidanceType__Group__3__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Guidance__Group__0__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__13046 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__13049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__NameAssignment_1_in_rule__Guidance__Group__1__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__23106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guidance__Group__3_in_rule__Guidance__Group__23109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Guidance__Group__2__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__3__Impl_in_rule__Guidance__Group__33168 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__4_in_rule__Guidance__Group__33171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TypeAssignment_3_in_rule__Guidance__Group__3__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__4__Impl_in_rule__Guidance__Group__43228 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__5_in_rule__Guidance__Group__43231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TextfieldAssignment_4_in_rule__Guidance__Group__4__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__5__Impl_in_rule__Guidance__Group__53288 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__6_in_rule__Guidance__Group__53291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__LinksAssignment_5_in_rule__Guidance__Group__5__Impl3318 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__6__Impl_in_rule__Guidance__Group__63349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Guidance__Group__6__Impl3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03422 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__TypeAssignment_0_in_rule__Port__Group__0__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__0_in_rule__Port__Group__1__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__0__Impl_in_rule__Port__Group_1__03544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group_1__1_in_rule__Port__Group_1__03547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Port__Group_1__0__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__1__Impl_in_rule__Port__Group_1__13606 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Port__Group_1__2_in_rule__Port__Group_1__13609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__StateAssignment_1_1_in_rule__Port__Group_1__1__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__2__Impl_in_rule__Port__Group_1__23666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Port__Group_1__2__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Activity__Group__0__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13793 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23853 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__TextfieldAssignment_2_in_rule__Activity__Group__2__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Activity__Group__3__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43975 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__RoleAssignment_4_in_rule__Activity__Group__4__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__54035 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__54038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__64096 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__64099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__74157 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__74160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__84218 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__84221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__94279 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__94282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__104340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Activity__Group__10__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__04421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__04424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group_5__0__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__14483 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__14486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InPortsAssignment_5_1_in_rule__Activity__Group_5__1__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__24543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__Group_5__2__Impl4570 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__04607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__04610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Activity__Group_5_2__0__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__14669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InPortsAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__04730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__04733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Activity__Group_6__0__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__14792 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__14795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OutPortsAssignment_6_1_in_rule__Activity__Group_6__1__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__24852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__Group_6__2__Impl4879 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__04916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__04919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Activity__Group_6_2__0__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__14978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OutPortsAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__05039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__05042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group_7__0__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__15101 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__2_in_rule__Activity__Group_7__15104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SubActivitiesAssignment_7_1_in_rule__Activity__Group_7__1__Impl5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__2__Impl_in_rule__Activity__Group_7__25161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__Group_7__2__Impl5188 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__05225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__05228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Activity__Group_7_2__0__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__15287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SubActivitiesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__05348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__05351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group_8__0__Impl5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__15410 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__15413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__GuidancesAssignment_8_1_in_rule__Activity__Group_8__1__Impl5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__25470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__0_in_rule__Activity__Group_8__2__Impl5497 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__0__Impl_in_rule__Activity__Group_8_2__05534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__1_in_rule__Activity__Group_8_2__05537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Activity__Group_8_2__0__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__1__Impl_in_rule__Activity__Group_8_2__15596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__GuidancesAssignment_8_2_1_in_rule__Activity__Group_8_2__1__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__05657 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__05660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Activity__Group_9__0__Impl5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__15719 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__15722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Activity__Group_9__1__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__25781 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__3_in_rule__Activity__Group_9__25784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_9_2_in_rule__Activity__Group_9__2__Impl5811 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__3__Impl_in_rule__Activity__Group_9__35842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Activity__Group_9__3__Impl5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__0__Impl_in_rule__Decision__Group__05909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decision__Group__1_in_rule__Decision__Group__05912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Decision__Group__0__Impl5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__1__Impl_in_rule__Decision__Group__15971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Decision__Group__2_in_rule__Decision__Group__15974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__NameAssignment_1_in_rule__Decision__Group__1__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__2__Impl_in_rule__Decision__Group__26031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__LabelAssignment_2_in_rule__Decision__Group__2__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__06095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Step__Group__1_in_rule__Step__Group__06098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Step__Group__0__Impl6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__16157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Step__Group__2_in_rule__Step__Group__16160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__NameAssignment_1_in_rule__Step__Group__1__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__26217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__LabelAssignment_2_in_rule__Step__Group__2__Impl6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__0__Impl_in_rule__InitialTransition__Group__06281 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__1_in_rule__InitialTransition__Group__06284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InitialTransition__Group__0__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__1__Impl_in_rule__InitialTransition__Group__16343 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__2_in_rule__InitialTransition__Group__16346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InitialTransition__Group__1__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__2__Impl_in_rule__InitialTransition__Group__26405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__3_in_rule__InitialTransition__Group__26408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InitialTransition__Group__2__Impl6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__3__Impl_in_rule__InitialTransition__Group__36467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__ToAssignment_3_in_rule__InitialTransition__Group__3__Impl6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__0__Impl_in_rule__FinalTransition__Group__06532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__1_in_rule__FinalTransition__Group__06535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FinalTransition__Group__0__Impl6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__1__Impl_in_rule__FinalTransition__Group__16594 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__2_in_rule__FinalTransition__Group__16597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__FromAssignment_1_in_rule__FinalTransition__Group__1__Impl6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__2__Impl_in_rule__FinalTransition__Group__26654 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__3_in_rule__FinalTransition__Group__26657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FinalTransition__Group__2__Impl6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__3__Impl_in_rule__FinalTransition__Group__36716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FinalTransition__Group__3__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__0__Impl_in_rule__DecisionTransition__Group__06783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__1_in_rule__DecisionTransition__Group__06786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DecisionTransition__Group__0__Impl6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__1__Impl_in_rule__DecisionTransition__Group__16845 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__2_in_rule__DecisionTransition__Group__16848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__FromAssignment_1_in_rule__DecisionTransition__Group__1__Impl6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__2__Impl_in_rule__DecisionTransition__Group__26905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__3_in_rule__DecisionTransition__Group__26908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DecisionTransition__Group__2__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__3__Impl_in_rule__DecisionTransition__Group__36967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__4_in_rule__DecisionTransition__Group__36970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__ToAssignment_3_in_rule__DecisionTransition__Group__3__Impl6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__Group__4__Impl_in_rule__DecisionTransition__Group__47027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecisionTransition__GuardAssignment_4_in_rule__DecisionTransition__Group__4__Impl7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__0__Impl_in_rule__NonInitialTransition__Group__07094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__1_in_rule__NonInitialTransition__Group__07097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NonInitialTransition__Group__0__Impl7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__1__Impl_in_rule__NonInitialTransition__Group__17156 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__2_in_rule__NonInitialTransition__Group__17159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__FromAssignment_1_in_rule__NonInitialTransition__Group__1__Impl7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__2__Impl_in_rule__NonInitialTransition__Group__27216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__3_in_rule__NonInitialTransition__Group__27219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NonInitialTransition__Group__2__Impl7247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__3__Impl_in_rule__NonInitialTransition__Group__37278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__ToAssignment_3_in_rule__NonInitialTransition__Group__3__Impl7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__0__Impl_in_rule__Textfield__Group__07343 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Textfield__Group__1_in_rule__Textfield__Group__07346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__0_in_rule__Textfield__Group__0__Impl7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__1__Impl_in_rule__Textfield__Group__17404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group__2_in_rule__Textfield__Group__17407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Textfield__Group__1__Impl7435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__2__Impl_in_rule__Textfield__Group__27466 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Textfield__Group__3_in_rule__Textfield__Group__27469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__SummaryAssignment_2_in_rule__Textfield__Group__2__Impl7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__3__Impl_in_rule__Textfield__Group__37526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__0_in_rule__Textfield__Group__3__Impl7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__0__Impl_in_rule__Textfield__Group_0__07592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__1_in_rule__Textfield__Group_0__07595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Textfield__Group_0__0__Impl7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__1__Impl_in_rule__Textfield__Group_0__17654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__LabelAssignment_0_1_in_rule__Textfield__Group_0__1__Impl7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__0__Impl_in_rule__Textfield__Group_3__07715 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__1_in_rule__Textfield__Group_3__07718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Textfield__Group_3__0__Impl7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__1__Impl_in_rule__Textfield__Group_3__17777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__DescriptionAssignment_3_1_in_rule__Textfield__Group_3__1__Impl7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__07838 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__07841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Link__Group__0__Impl7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__17900 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__17903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__DescriptionAssignment_1_in_rule__Link__Group__1__Impl7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__27960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__UrlAssignment_2_in_rule__Link__Group__2__Impl7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Model__ActivitiesAssignment_08028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Model__RolesAssignment_18059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_rule__Model__WorkProductsAssignment_28090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_rule__Model__WorkProductTypesAssignment_38121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_rule__Model__GuidancesAssignment_48152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_rule__Model__GuidanceTypesAssignment_58183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_18214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Role__TextfieldAssignment_28245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProductType__NameAssignment_18276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__WorkProductType__TextfieldAssignment_28307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProduct__NameAssignment_18338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProduct__TypeAssignment_38373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__WorkProduct__TextfieldAssignment_48408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__WorkProduct__StatesAssignment_5_18439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__WorkProduct__StatesAssignment_5_2_18470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GuidanceType__NameAssignment_18501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__GuidanceType__TextfieldAssignment_28532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guidance__NameAssignment_18563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guidance__TypeAssignment_38598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Guidance__TextfieldAssignment_48633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__Guidance__LinksAssignment_58664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment8695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__TypeAssignment_08730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__StateAssignment_1_18769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_18804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Activity__TextfieldAssignment_28835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__RoleAssignment_48870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_18905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_2_18936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_18967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_2_18998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_19029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_2_19060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_19095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_2_19134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Activity__StepsAssignment_9_2_09169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecision_in_rule__Activity__DecisionsAssignment_9_2_19200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Activity__TransitionsAssignment_9_2_29231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityRef__TypeAssignment9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decision__NameAssignment_19301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Decision__LabelAssignment_29332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Step__NameAssignment_19363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Step__LabelAssignment_29394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InitialTransition__ToAssignment_39429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FinalTransition__FromAssignment_19468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DecisionTransition__FromAssignment_19507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DecisionTransition__ToAssignment_39546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecisionTransition__GuardAssignment_49581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonInitialTransition__FromAssignment_19616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonInitialTransition__ToAssignment_39655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__LabelAssignment_0_19690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__SummaryAssignment_29721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__DescriptionAssignment_3_19752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_19783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__UrlAssignment_29814 = new BitSet(new long[]{0x0000000000000002L});

}