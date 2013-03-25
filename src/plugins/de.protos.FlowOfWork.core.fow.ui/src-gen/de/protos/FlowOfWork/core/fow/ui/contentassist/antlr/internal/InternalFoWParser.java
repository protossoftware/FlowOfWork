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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Role'", "';'", "'WorkProductType'", "'WorkProduct'", "':'", "'GuidanceType'", "'Guidance'", "'Activity'", "'responsible'", "'inputs'", "','", "'outputs'", "'subActivities'", "'guidances'", "'Behavior'", "'{'", "'}'", "'Decision'", "'Step'", "'Transition'", "'initial'", "'->'", "'final'", "'summary'", "'label'", "'description'"
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
    public static final int T__12=12;
    public static final int T__11=11;
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

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||(LA1_0>=16 && LA1_0<=18)) ) {
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


    // $ANTLR start "entryRulePort"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:230:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:231:1: ( rulePort EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:232:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort424);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort431); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:239:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:243:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:244:1: ( ( rule__Port__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:244:1: ( ( rule__Port__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:245:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:246:1: ( rule__Port__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:246:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort457);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:258:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:259:1: ( ruleActivity EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:260:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity484);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity491); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:267:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:271:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:272:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:272:1: ( ( rule__Activity__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:273:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:274:1: ( rule__Activity__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:274:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity517);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:286:1: entryRuleActivityRef : ruleActivityRef EOF ;
    public final void entryRuleActivityRef() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:287:1: ( ruleActivityRef EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:288:1: ruleActivityRef EOF
            {
             before(grammarAccess.getActivityRefRule()); 
            pushFollow(FOLLOW_ruleActivityRef_in_entryRuleActivityRef544);
            ruleActivityRef();

            state._fsp--;

             after(grammarAccess.getActivityRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityRef551); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:295:1: ruleActivityRef : ( ( rule__ActivityRef__Group__0 ) ) ;
    public final void ruleActivityRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:299:2: ( ( ( rule__ActivityRef__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:300:1: ( ( rule__ActivityRef__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:300:1: ( ( rule__ActivityRef__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:301:1: ( rule__ActivityRef__Group__0 )
            {
             before(grammarAccess.getActivityRefAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:302:1: ( rule__ActivityRef__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:302:2: rule__ActivityRef__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityRef__Group__0_in_ruleActivityRef577);
            rule__ActivityRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityRefAccess().getGroup()); 

            }


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:316:1: entryRuleDecision : ruleDecision EOF ;
    public final void entryRuleDecision() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:317:1: ( ruleDecision EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:318:1: ruleDecision EOF
            {
             before(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_ruleDecision_in_entryRuleDecision606);
            ruleDecision();

            state._fsp--;

             after(grammarAccess.getDecisionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecision613); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:325:1: ruleDecision : ( ( rule__Decision__Group__0 ) ) ;
    public final void ruleDecision() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:329:2: ( ( ( rule__Decision__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:330:1: ( ( rule__Decision__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:330:1: ( ( rule__Decision__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:331:1: ( rule__Decision__Group__0 )
            {
             before(grammarAccess.getDecisionAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:332:1: ( rule__Decision__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:332:2: rule__Decision__Group__0
            {
            pushFollow(FOLLOW_rule__Decision__Group__0_in_ruleDecision639);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:344:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:345:1: ( ruleStep EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:346:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep666);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep673); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:353:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:357:2: ( ( ( rule__Step__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:358:1: ( ( rule__Step__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:358:1: ( ( rule__Step__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:359:1: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:360:1: ( rule__Step__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:360:2: rule__Step__Group__0
            {
            pushFollow(FOLLOW_rule__Step__Group__0_in_ruleStep699);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:372:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:373:1: ( ruleTransition EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:374:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition726);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition733); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:381:1: ruleTransition : ( ( rule__Transition__Alternatives ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:385:2: ( ( ( rule__Transition__Alternatives ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:386:1: ( ( rule__Transition__Alternatives ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:386:1: ( ( rule__Transition__Alternatives ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:387:1: ( rule__Transition__Alternatives )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:388:1: ( rule__Transition__Alternatives )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:388:2: rule__Transition__Alternatives
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_in_ruleTransition759);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:400:1: entryRuleInitialTransition : ruleInitialTransition EOF ;
    public final void entryRuleInitialTransition() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:401:1: ( ruleInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:402:1: ruleInitialTransition EOF
            {
             before(grammarAccess.getInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition786);
            ruleInitialTransition();

            state._fsp--;

             after(grammarAccess.getInitialTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialTransition793); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:409:1: ruleInitialTransition : ( ( rule__InitialTransition__Group__0 ) ) ;
    public final void ruleInitialTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:413:2: ( ( ( rule__InitialTransition__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:414:1: ( ( rule__InitialTransition__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:414:1: ( ( rule__InitialTransition__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:415:1: ( rule__InitialTransition__Group__0 )
            {
             before(grammarAccess.getInitialTransitionAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:416:1: ( rule__InitialTransition__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:416:2: rule__InitialTransition__Group__0
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__0_in_ruleInitialTransition819);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:428:1: entryRuleFinalTransition : ruleFinalTransition EOF ;
    public final void entryRuleFinalTransition() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:429:1: ( ruleFinalTransition EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:430:1: ruleFinalTransition EOF
            {
             before(grammarAccess.getFinalTransitionRule()); 
            pushFollow(FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition846);
            ruleFinalTransition();

            state._fsp--;

             after(grammarAccess.getFinalTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinalTransition853); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:437:1: ruleFinalTransition : ( ( rule__FinalTransition__Group__0 ) ) ;
    public final void ruleFinalTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:441:2: ( ( ( rule__FinalTransition__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:442:1: ( ( rule__FinalTransition__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:442:1: ( ( rule__FinalTransition__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:443:1: ( rule__FinalTransition__Group__0 )
            {
             before(grammarAccess.getFinalTransitionAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:444:1: ( rule__FinalTransition__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:444:2: rule__FinalTransition__Group__0
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__0_in_ruleFinalTransition879);
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


    // $ANTLR start "entryRuleNonInitialTransition"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:456:1: entryRuleNonInitialTransition : ruleNonInitialTransition EOF ;
    public final void entryRuleNonInitialTransition() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:457:1: ( ruleNonInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:458:1: ruleNonInitialTransition EOF
            {
             before(grammarAccess.getNonInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition906);
            ruleNonInitialTransition();

            state._fsp--;

             after(grammarAccess.getNonInitialTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonInitialTransition913); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:465:1: ruleNonInitialTransition : ( ( rule__NonInitialTransition__Group__0 ) ) ;
    public final void ruleNonInitialTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:469:2: ( ( ( rule__NonInitialTransition__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:470:1: ( ( rule__NonInitialTransition__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:470:1: ( ( rule__NonInitialTransition__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:471:1: ( rule__NonInitialTransition__Group__0 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:472:1: ( rule__NonInitialTransition__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:472:2: rule__NonInitialTransition__Group__0
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__0_in_ruleNonInitialTransition939);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:484:1: entryRuleTextfield : ruleTextfield EOF ;
    public final void entryRuleTextfield() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:485:1: ( ruleTextfield EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:486:1: ruleTextfield EOF
            {
             before(grammarAccess.getTextfieldRule()); 
            pushFollow(FOLLOW_ruleTextfield_in_entryRuleTextfield966);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getTextfieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfield973); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:493:1: ruleTextfield : ( ( rule__Textfield__Group__0 ) ) ;
    public final void ruleTextfield() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:497:2: ( ( ( rule__Textfield__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:498:1: ( ( rule__Textfield__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:498:1: ( ( rule__Textfield__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:499:1: ( rule__Textfield__Group__0 )
            {
             before(grammarAccess.getTextfieldAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:500:1: ( rule__Textfield__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:500:2: rule__Textfield__Group__0
            {
            pushFollow(FOLLOW_rule__Textfield__Group__0_in_ruleTextfield999);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:512:1: rule__Model__Alternatives : ( ( ( rule__Model__ActivitiesAssignment_0 ) ) | ( ( rule__Model__RolesAssignment_1 ) ) | ( ( rule__Model__WorkProductsAssignment_2 ) ) | ( ( rule__Model__WorkProductTypesAssignment_3 ) ) | ( ( rule__Model__GuidancesAssignment_4 ) ) | ( ( rule__Model__GuidanceTypesAssignment_5 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:516:1: ( ( ( rule__Model__ActivitiesAssignment_0 ) ) | ( ( rule__Model__RolesAssignment_1 ) ) | ( ( rule__Model__WorkProductsAssignment_2 ) ) | ( ( rule__Model__WorkProductTypesAssignment_3 ) ) | ( ( rule__Model__GuidancesAssignment_4 ) ) | ( ( rule__Model__GuidanceTypesAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 18:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:517:1: ( ( rule__Model__ActivitiesAssignment_0 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:517:1: ( ( rule__Model__ActivitiesAssignment_0 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:518:1: ( rule__Model__ActivitiesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getActivitiesAssignment_0()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:519:1: ( rule__Model__ActivitiesAssignment_0 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:519:2: rule__Model__ActivitiesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__ActivitiesAssignment_0_in_rule__Model__Alternatives1035);
                    rule__Model__ActivitiesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getActivitiesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:523:6: ( ( rule__Model__RolesAssignment_1 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:523:6: ( ( rule__Model__RolesAssignment_1 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:524:1: ( rule__Model__RolesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getRolesAssignment_1()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:525:1: ( rule__Model__RolesAssignment_1 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:525:2: rule__Model__RolesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__RolesAssignment_1_in_rule__Model__Alternatives1053);
                    rule__Model__RolesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getRolesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:529:6: ( ( rule__Model__WorkProductsAssignment_2 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:529:6: ( ( rule__Model__WorkProductsAssignment_2 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:530:1: ( rule__Model__WorkProductsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getWorkProductsAssignment_2()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:531:1: ( rule__Model__WorkProductsAssignment_2 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:531:2: rule__Model__WorkProductsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__WorkProductsAssignment_2_in_rule__Model__Alternatives1071);
                    rule__Model__WorkProductsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getWorkProductsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:535:6: ( ( rule__Model__WorkProductTypesAssignment_3 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:535:6: ( ( rule__Model__WorkProductTypesAssignment_3 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:536:1: ( rule__Model__WorkProductTypesAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getWorkProductTypesAssignment_3()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:537:1: ( rule__Model__WorkProductTypesAssignment_3 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:537:2: rule__Model__WorkProductTypesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__WorkProductTypesAssignment_3_in_rule__Model__Alternatives1089);
                    rule__Model__WorkProductTypesAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getWorkProductTypesAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:541:6: ( ( rule__Model__GuidancesAssignment_4 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:541:6: ( ( rule__Model__GuidancesAssignment_4 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:542:1: ( rule__Model__GuidancesAssignment_4 )
                    {
                     before(grammarAccess.getModelAccess().getGuidancesAssignment_4()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:543:1: ( rule__Model__GuidancesAssignment_4 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:543:2: rule__Model__GuidancesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__GuidancesAssignment_4_in_rule__Model__Alternatives1107);
                    rule__Model__GuidancesAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGuidancesAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:547:6: ( ( rule__Model__GuidanceTypesAssignment_5 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:547:6: ( ( rule__Model__GuidanceTypesAssignment_5 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:548:1: ( rule__Model__GuidanceTypesAssignment_5 )
                    {
                     before(grammarAccess.getModelAccess().getGuidanceTypesAssignment_5()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:549:1: ( rule__Model__GuidanceTypesAssignment_5 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:549:2: rule__Model__GuidanceTypesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Model__GuidanceTypesAssignment_5_in_rule__Model__Alternatives1125);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:559:1: rule__Activity__Alternatives_9_2 : ( ( ( rule__Activity__StepsAssignment_9_2_0 ) ) | ( ( rule__Activity__DecisionsAssignment_9_2_1 ) ) | ( ( rule__Activity__TransitionsAssignment_9_2_2 ) ) );
    public final void rule__Activity__Alternatives_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:563:1: ( ( ( rule__Activity__StepsAssignment_9_2_0 ) ) | ( ( rule__Activity__DecisionsAssignment_9_2_1 ) ) | ( ( rule__Activity__TransitionsAssignment_9_2_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 30:
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
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:564:1: ( ( rule__Activity__StepsAssignment_9_2_0 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:564:1: ( ( rule__Activity__StepsAssignment_9_2_0 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:565:1: ( rule__Activity__StepsAssignment_9_2_0 )
                    {
                     before(grammarAccess.getActivityAccess().getStepsAssignment_9_2_0()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:566:1: ( rule__Activity__StepsAssignment_9_2_0 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:566:2: rule__Activity__StepsAssignment_9_2_0
                    {
                    pushFollow(FOLLOW_rule__Activity__StepsAssignment_9_2_0_in_rule__Activity__Alternatives_9_21159);
                    rule__Activity__StepsAssignment_9_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getStepsAssignment_9_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:570:6: ( ( rule__Activity__DecisionsAssignment_9_2_1 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:570:6: ( ( rule__Activity__DecisionsAssignment_9_2_1 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:571:1: ( rule__Activity__DecisionsAssignment_9_2_1 )
                    {
                     before(grammarAccess.getActivityAccess().getDecisionsAssignment_9_2_1()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:572:1: ( rule__Activity__DecisionsAssignment_9_2_1 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:572:2: rule__Activity__DecisionsAssignment_9_2_1
                    {
                    pushFollow(FOLLOW_rule__Activity__DecisionsAssignment_9_2_1_in_rule__Activity__Alternatives_9_21177);
                    rule__Activity__DecisionsAssignment_9_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getDecisionsAssignment_9_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:576:6: ( ( rule__Activity__TransitionsAssignment_9_2_2 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:576:6: ( ( rule__Activity__TransitionsAssignment_9_2_2 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:577:1: ( rule__Activity__TransitionsAssignment_9_2_2 )
                    {
                     before(grammarAccess.getActivityAccess().getTransitionsAssignment_9_2_2()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:578:1: ( rule__Activity__TransitionsAssignment_9_2_2 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:578:2: rule__Activity__TransitionsAssignment_9_2_2
                    {
                    pushFollow(FOLLOW_rule__Activity__TransitionsAssignment_9_2_2_in_rule__Activity__Alternatives_9_21195);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:588:1: rule__Transition__Alternatives : ( ( ruleInitialTransition ) | ( ruleFinalTransition ) | ( ruleNonInitialTransition ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:592:1: ( ( ruleInitialTransition ) | ( ruleFinalTransition ) | ( ruleNonInitialTransition ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_ID) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==32) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==RULE_ID) ) {
                                alt4=3;
                            }
                            else if ( (LA4_5==33) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_2==31) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
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
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:593:1: ( ruleInitialTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:593:1: ( ruleInitialTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:594:1: ruleInitialTransition
                    {
                     before(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInitialTransition_in_rule__Transition__Alternatives1229);
                    ruleInitialTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:599:6: ( ruleFinalTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:599:6: ( ruleFinalTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:600:1: ruleFinalTransition
                    {
                     before(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFinalTransition_in_rule__Transition__Alternatives1246);
                    ruleFinalTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:605:6: ( ruleNonInitialTransition )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:605:6: ( ruleNonInitialTransition )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:606:1: ruleNonInitialTransition
                    {
                     before(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNonInitialTransition_in_rule__Transition__Alternatives1263);
                    ruleNonInitialTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:618:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:622:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:623:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__01293);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__01296);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:630:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:634:1: ( ( 'Role' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:635:1: ( 'Role' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:635:1: ( 'Role' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:636:1: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Role__Group__0__Impl1324); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:649:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:653:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:654:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__11355);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__11358);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:661:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:665:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:666:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:666:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:667:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:668:1: ( rule__Role__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:668:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl1385);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:678:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:682:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:683:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__21415);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__21418);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:690:1: rule__Role__Group__2__Impl : ( ( rule__Role__TextfieldAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:694:1: ( ( ( rule__Role__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:695:1: ( ( rule__Role__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:695:1: ( ( rule__Role__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:696:1: ( rule__Role__TextfieldAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:697:1: ( rule__Role__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:697:2: rule__Role__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__Role__TextfieldAssignment_2_in_rule__Role__Group__2__Impl1445);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:707:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:711:1: ( rule__Role__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:712:2: rule__Role__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__31475);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:718:1: rule__Role__Group__3__Impl : ( ';' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:722:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:723:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:723:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:724:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Role__Group__3__Impl1503); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:745:1: rule__WorkProductType__Group__0 : rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1 ;
    public final void rule__WorkProductType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:749:1: ( rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:750:2: rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__0__Impl_in_rule__WorkProductType__Group__01542);
            rule__WorkProductType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__1_in_rule__WorkProductType__Group__01545);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:757:1: rule__WorkProductType__Group__0__Impl : ( 'WorkProductType' ) ;
    public final void rule__WorkProductType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:761:1: ( ( 'WorkProductType' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:762:1: ( 'WorkProductType' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:762:1: ( 'WorkProductType' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:763:1: 'WorkProductType'
            {
             before(grammarAccess.getWorkProductTypeAccess().getWorkProductTypeKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__WorkProductType__Group__0__Impl1573); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:776:1: rule__WorkProductType__Group__1 : rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2 ;
    public final void rule__WorkProductType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:780:1: ( rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:781:2: rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__1__Impl_in_rule__WorkProductType__Group__11604);
            rule__WorkProductType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__2_in_rule__WorkProductType__Group__11607);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:788:1: rule__WorkProductType__Group__1__Impl : ( ( rule__WorkProductType__NameAssignment_1 ) ) ;
    public final void rule__WorkProductType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:792:1: ( ( ( rule__WorkProductType__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:793:1: ( ( rule__WorkProductType__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:793:1: ( ( rule__WorkProductType__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:794:1: ( rule__WorkProductType__NameAssignment_1 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:795:1: ( rule__WorkProductType__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:795:2: rule__WorkProductType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkProductType__NameAssignment_1_in_rule__WorkProductType__Group__1__Impl1634);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:805:1: rule__WorkProductType__Group__2 : rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3 ;
    public final void rule__WorkProductType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:809:1: ( rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:810:2: rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__2__Impl_in_rule__WorkProductType__Group__21664);
            rule__WorkProductType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__3_in_rule__WorkProductType__Group__21667);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:817:1: rule__WorkProductType__Group__2__Impl : ( ( rule__WorkProductType__TextfieldAssignment_2 ) ) ;
    public final void rule__WorkProductType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:821:1: ( ( ( rule__WorkProductType__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:822:1: ( ( rule__WorkProductType__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:822:1: ( ( rule__WorkProductType__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:823:1: ( rule__WorkProductType__TextfieldAssignment_2 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:824:1: ( rule__WorkProductType__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:824:2: rule__WorkProductType__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__WorkProductType__TextfieldAssignment_2_in_rule__WorkProductType__Group__2__Impl1694);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:834:1: rule__WorkProductType__Group__3 : rule__WorkProductType__Group__3__Impl ;
    public final void rule__WorkProductType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:838:1: ( rule__WorkProductType__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:839:2: rule__WorkProductType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__3__Impl_in_rule__WorkProductType__Group__31724);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:845:1: rule__WorkProductType__Group__3__Impl : ( ';' ) ;
    public final void rule__WorkProductType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:849:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:850:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:850:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:851:1: ';'
            {
             before(grammarAccess.getWorkProductTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__WorkProductType__Group__3__Impl1752); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:872:1: rule__WorkProduct__Group__0 : rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1 ;
    public final void rule__WorkProduct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:876:1: ( rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:877:2: rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__0__Impl_in_rule__WorkProduct__Group__01791);
            rule__WorkProduct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__1_in_rule__WorkProduct__Group__01794);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:884:1: rule__WorkProduct__Group__0__Impl : ( 'WorkProduct' ) ;
    public final void rule__WorkProduct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:888:1: ( ( 'WorkProduct' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:889:1: ( 'WorkProduct' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:889:1: ( 'WorkProduct' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:890:1: 'WorkProduct'
            {
             before(grammarAccess.getWorkProductAccess().getWorkProductKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__WorkProduct__Group__0__Impl1822); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:903:1: rule__WorkProduct__Group__1 : rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2 ;
    public final void rule__WorkProduct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:907:1: ( rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:908:2: rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__1__Impl_in_rule__WorkProduct__Group__11853);
            rule__WorkProduct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__2_in_rule__WorkProduct__Group__11856);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:915:1: rule__WorkProduct__Group__1__Impl : ( ( rule__WorkProduct__NameAssignment_1 ) ) ;
    public final void rule__WorkProduct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:919:1: ( ( ( rule__WorkProduct__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:920:1: ( ( rule__WorkProduct__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:920:1: ( ( rule__WorkProduct__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:921:1: ( rule__WorkProduct__NameAssignment_1 )
            {
             before(grammarAccess.getWorkProductAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:922:1: ( rule__WorkProduct__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:922:2: rule__WorkProduct__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkProduct__NameAssignment_1_in_rule__WorkProduct__Group__1__Impl1883);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:932:1: rule__WorkProduct__Group__2 : rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3 ;
    public final void rule__WorkProduct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:936:1: ( rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:937:2: rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__2__Impl_in_rule__WorkProduct__Group__21913);
            rule__WorkProduct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__3_in_rule__WorkProduct__Group__21916);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:944:1: rule__WorkProduct__Group__2__Impl : ( ':' ) ;
    public final void rule__WorkProduct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:948:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:949:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:949:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:950:1: ':'
            {
             before(grammarAccess.getWorkProductAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__WorkProduct__Group__2__Impl1944); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:963:1: rule__WorkProduct__Group__3 : rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4 ;
    public final void rule__WorkProduct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:967:1: ( rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:968:2: rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__3__Impl_in_rule__WorkProduct__Group__31975);
            rule__WorkProduct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__4_in_rule__WorkProduct__Group__31978);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:975:1: rule__WorkProduct__Group__3__Impl : ( ( rule__WorkProduct__TypeAssignment_3 ) ) ;
    public final void rule__WorkProduct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:979:1: ( ( ( rule__WorkProduct__TypeAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:980:1: ( ( rule__WorkProduct__TypeAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:980:1: ( ( rule__WorkProduct__TypeAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:981:1: ( rule__WorkProduct__TypeAssignment_3 )
            {
             before(grammarAccess.getWorkProductAccess().getTypeAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:982:1: ( rule__WorkProduct__TypeAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:982:2: rule__WorkProduct__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__WorkProduct__TypeAssignment_3_in_rule__WorkProduct__Group__3__Impl2005);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:992:1: rule__WorkProduct__Group__4 : rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5 ;
    public final void rule__WorkProduct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:996:1: ( rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:997:2: rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__4__Impl_in_rule__WorkProduct__Group__42035);
            rule__WorkProduct__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__5_in_rule__WorkProduct__Group__42038);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1004:1: rule__WorkProduct__Group__4__Impl : ( ( rule__WorkProduct__TextfieldAssignment_4 ) ) ;
    public final void rule__WorkProduct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1008:1: ( ( ( rule__WorkProduct__TextfieldAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1009:1: ( ( rule__WorkProduct__TextfieldAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1009:1: ( ( rule__WorkProduct__TextfieldAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1010:1: ( rule__WorkProduct__TextfieldAssignment_4 )
            {
             before(grammarAccess.getWorkProductAccess().getTextfieldAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1011:1: ( rule__WorkProduct__TextfieldAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1011:2: rule__WorkProduct__TextfieldAssignment_4
            {
            pushFollow(FOLLOW_rule__WorkProduct__TextfieldAssignment_4_in_rule__WorkProduct__Group__4__Impl2065);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1021:1: rule__WorkProduct__Group__5 : rule__WorkProduct__Group__5__Impl ;
    public final void rule__WorkProduct__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1025:1: ( rule__WorkProduct__Group__5__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1026:2: rule__WorkProduct__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__5__Impl_in_rule__WorkProduct__Group__52095);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1032:1: rule__WorkProduct__Group__5__Impl : ( ';' ) ;
    public final void rule__WorkProduct__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1036:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1037:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1037:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1038:1: ';'
            {
             before(grammarAccess.getWorkProductAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__WorkProduct__Group__5__Impl2123); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1063:1: rule__GuidanceType__Group__0 : rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1 ;
    public final void rule__GuidanceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1067:1: ( rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1068:2: rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__0__Impl_in_rule__GuidanceType__Group__02166);
            rule__GuidanceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__1_in_rule__GuidanceType__Group__02169);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1075:1: rule__GuidanceType__Group__0__Impl : ( 'GuidanceType' ) ;
    public final void rule__GuidanceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1079:1: ( ( 'GuidanceType' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1080:1: ( 'GuidanceType' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1080:1: ( 'GuidanceType' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1081:1: 'GuidanceType'
            {
             before(grammarAccess.getGuidanceTypeAccess().getGuidanceTypeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__GuidanceType__Group__0__Impl2197); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1094:1: rule__GuidanceType__Group__1 : rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2 ;
    public final void rule__GuidanceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1098:1: ( rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1099:2: rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__1__Impl_in_rule__GuidanceType__Group__12228);
            rule__GuidanceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__2_in_rule__GuidanceType__Group__12231);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1106:1: rule__GuidanceType__Group__1__Impl : ( ( rule__GuidanceType__NameAssignment_1 ) ) ;
    public final void rule__GuidanceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1110:1: ( ( ( rule__GuidanceType__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1111:1: ( ( rule__GuidanceType__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1111:1: ( ( rule__GuidanceType__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1112:1: ( rule__GuidanceType__NameAssignment_1 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1113:1: ( rule__GuidanceType__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1113:2: rule__GuidanceType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GuidanceType__NameAssignment_1_in_rule__GuidanceType__Group__1__Impl2258);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1123:1: rule__GuidanceType__Group__2 : rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3 ;
    public final void rule__GuidanceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1127:1: ( rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1128:2: rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__2__Impl_in_rule__GuidanceType__Group__22288);
            rule__GuidanceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__3_in_rule__GuidanceType__Group__22291);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1135:1: rule__GuidanceType__Group__2__Impl : ( ( rule__GuidanceType__TextfieldAssignment_2 ) ) ;
    public final void rule__GuidanceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1139:1: ( ( ( rule__GuidanceType__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1140:1: ( ( rule__GuidanceType__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1140:1: ( ( rule__GuidanceType__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1141:1: ( rule__GuidanceType__TextfieldAssignment_2 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1142:1: ( rule__GuidanceType__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1142:2: rule__GuidanceType__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__GuidanceType__TextfieldAssignment_2_in_rule__GuidanceType__Group__2__Impl2318);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1152:1: rule__GuidanceType__Group__3 : rule__GuidanceType__Group__3__Impl ;
    public final void rule__GuidanceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1156:1: ( rule__GuidanceType__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1157:2: rule__GuidanceType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__3__Impl_in_rule__GuidanceType__Group__32348);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1163:1: rule__GuidanceType__Group__3__Impl : ( ';' ) ;
    public final void rule__GuidanceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1167:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1168:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1168:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1169:1: ';'
            {
             before(grammarAccess.getGuidanceTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__GuidanceType__Group__3__Impl2376); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1190:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1194:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1195:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02415);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02418);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1202:1: rule__Guidance__Group__0__Impl : ( 'Guidance' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1206:1: ( ( 'Guidance' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1207:1: ( 'Guidance' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1207:1: ( 'Guidance' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1208:1: 'Guidance'
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Guidance__Group__0__Impl2446); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1221:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1225:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1226:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__12477);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__12480);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1233:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__NameAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1237:1: ( ( ( rule__Guidance__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1238:1: ( ( rule__Guidance__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1238:1: ( ( rule__Guidance__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1239:1: ( rule__Guidance__NameAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1240:1: ( rule__Guidance__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1240:2: rule__Guidance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Guidance__NameAssignment_1_in_rule__Guidance__Group__1__Impl2507);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1250:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1254:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1255:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__22537);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__3_in_rule__Guidance__Group__22540);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1262:1: rule__Guidance__Group__2__Impl : ( ':' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1266:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1267:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1267:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1268:1: ':'
            {
             before(grammarAccess.getGuidanceAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Guidance__Group__2__Impl2568); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1281:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1285:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1286:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_rule__Guidance__Group__3__Impl_in_rule__Guidance__Group__32599);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__4_in_rule__Guidance__Group__32602);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1293:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__TypeAssignment_3 ) ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1297:1: ( ( ( rule__Guidance__TypeAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1298:1: ( ( rule__Guidance__TypeAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1298:1: ( ( rule__Guidance__TypeAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1299:1: ( rule__Guidance__TypeAssignment_3 )
            {
             before(grammarAccess.getGuidanceAccess().getTypeAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1300:1: ( rule__Guidance__TypeAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1300:2: rule__Guidance__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Guidance__TypeAssignment_3_in_rule__Guidance__Group__3__Impl2629);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1310:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl rule__Guidance__Group__5 ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1314:1: ( rule__Guidance__Group__4__Impl rule__Guidance__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1315:2: rule__Guidance__Group__4__Impl rule__Guidance__Group__5
            {
            pushFollow(FOLLOW_rule__Guidance__Group__4__Impl_in_rule__Guidance__Group__42659);
            rule__Guidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__5_in_rule__Guidance__Group__42662);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1322:1: rule__Guidance__Group__4__Impl : ( ( rule__Guidance__TextfieldAssignment_4 ) ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1326:1: ( ( ( rule__Guidance__TextfieldAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1327:1: ( ( rule__Guidance__TextfieldAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1327:1: ( ( rule__Guidance__TextfieldAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1328:1: ( rule__Guidance__TextfieldAssignment_4 )
            {
             before(grammarAccess.getGuidanceAccess().getTextfieldAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1329:1: ( rule__Guidance__TextfieldAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1329:2: rule__Guidance__TextfieldAssignment_4
            {
            pushFollow(FOLLOW_rule__Guidance__TextfieldAssignment_4_in_rule__Guidance__Group__4__Impl2689);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1339:1: rule__Guidance__Group__5 : rule__Guidance__Group__5__Impl ;
    public final void rule__Guidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1343:1: ( rule__Guidance__Group__5__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1344:2: rule__Guidance__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Guidance__Group__5__Impl_in_rule__Guidance__Group__52719);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1350:1: rule__Guidance__Group__5__Impl : ( ';' ) ;
    public final void rule__Guidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1354:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1355:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1355:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1356:1: ';'
            {
             before(grammarAccess.getGuidanceAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__Guidance__Group__5__Impl2747); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1381:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1385:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1386:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02790);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02793);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1393:1: rule__Port__Group__0__Impl : ( ( rule__Port__NameAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1397:1: ( ( ( rule__Port__NameAssignment_0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1398:1: ( ( rule__Port__NameAssignment_0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1398:1: ( ( rule__Port__NameAssignment_0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1399:1: ( rule__Port__NameAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1400:1: ( rule__Port__NameAssignment_0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1400:2: rule__Port__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_0_in_rule__Port__Group__0__Impl2820);
            rule__Port__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1410:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1414:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1415:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12850);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__2_in_rule__Port__Group__12853);
            rule__Port__Group__2();

            state._fsp--;


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1422:1: rule__Port__Group__1__Impl : ( ':' ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1426:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1427:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1427:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1428:1: ':'
            {
             before(grammarAccess.getPortAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Port__Group__1__Impl2881); 
             after(grammarAccess.getPortAccess().getColonKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Port__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1441:1: rule__Port__Group__2 : rule__Port__Group__2__Impl ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1445:1: ( rule__Port__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1446:2: rule__Port__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__22912);
            rule__Port__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1452:1: rule__Port__Group__2__Impl : ( ( rule__Port__TypeAssignment_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1456:1: ( ( ( rule__Port__TypeAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1457:1: ( ( rule__Port__TypeAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1457:1: ( ( rule__Port__TypeAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1458:1: ( rule__Port__TypeAssignment_2 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1459:1: ( rule__Port__TypeAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1459:2: rule__Port__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Port__TypeAssignment_2_in_rule__Port__Group__2__Impl2939);
            rule__Port__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1475:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1479:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1480:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02975);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02978);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1487:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1491:1: ( ( 'Activity' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1492:1: ( 'Activity' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1492:1: ( 'Activity' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1493:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Activity__Group__0__Impl3006); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1506:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1510:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1511:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13037);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13040);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1518:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1522:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1523:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1523:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1524:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1525:1: ( rule__Activity__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1525:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl3067);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1535:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1539:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1540:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23097);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23100);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1547:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__TextfieldAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1551:1: ( ( ( rule__Activity__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1552:1: ( ( rule__Activity__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1552:1: ( ( rule__Activity__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1553:1: ( rule__Activity__TextfieldAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1554:1: ( rule__Activity__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1554:2: rule__Activity__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__TextfieldAssignment_2_in_rule__Activity__Group__2__Impl3127);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1564:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1568:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1569:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33157);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33160);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1576:1: rule__Activity__Group__3__Impl : ( 'responsible' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1580:1: ( ( 'responsible' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1581:1: ( 'responsible' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1581:1: ( 'responsible' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1582:1: 'responsible'
            {
             before(grammarAccess.getActivityAccess().getResponsibleKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Activity__Group__3__Impl3188); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1595:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1599:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1600:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43219);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43222);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1607:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__RoleAssignment_4 ) ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1611:1: ( ( ( rule__Activity__RoleAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1612:1: ( ( rule__Activity__RoleAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1612:1: ( ( rule__Activity__RoleAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1613:1: ( rule__Activity__RoleAssignment_4 )
            {
             before(grammarAccess.getActivityAccess().getRoleAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1614:1: ( rule__Activity__RoleAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1614:2: rule__Activity__RoleAssignment_4
            {
            pushFollow(FOLLOW_rule__Activity__RoleAssignment_4_in_rule__Activity__Group__4__Impl3249);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1624:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1628:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1629:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__53279);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__53282);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1636:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1640:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1641:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1641:1: ( ( rule__Activity__Group_5__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1642:1: ( rule__Activity__Group_5__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_5()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1643:1: ( rule__Activity__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1643:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl3309);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1653:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1657:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1658:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63340);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63343);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1665:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__Group_6__0 )? ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1669:1: ( ( ( rule__Activity__Group_6__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1670:1: ( ( rule__Activity__Group_6__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1670:1: ( ( rule__Activity__Group_6__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1671:1: ( rule__Activity__Group_6__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_6()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1672:1: ( rule__Activity__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1672:2: rule__Activity__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl3370);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1682:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1686:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1687:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73401);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__73404);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1694:1: rule__Activity__Group__7__Impl : ( ( rule__Activity__Group_7__0 )? ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1698:1: ( ( ( rule__Activity__Group_7__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1699:1: ( ( rule__Activity__Group_7__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1699:1: ( ( rule__Activity__Group_7__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1700:1: ( rule__Activity__Group_7__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_7()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1701:1: ( rule__Activity__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1701:2: rule__Activity__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl3431);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1711:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1715:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1716:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__83462);
            rule__Activity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__83465);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1723:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__Group_8__0 )? ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1727:1: ( ( ( rule__Activity__Group_8__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1728:1: ( ( rule__Activity__Group_8__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1728:1: ( ( rule__Activity__Group_8__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1729:1: ( rule__Activity__Group_8__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_8()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1730:1: ( rule__Activity__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1730:2: rule__Activity__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl3492);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1740:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1744:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1745:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__93523);
            rule__Activity__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__93526);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1752:1: rule__Activity__Group__9__Impl : ( ( rule__Activity__Group_9__0 )? ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1756:1: ( ( ( rule__Activity__Group_9__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1757:1: ( ( rule__Activity__Group_9__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1757:1: ( ( rule__Activity__Group_9__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1758:1: ( rule__Activity__Group_9__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_9()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1759:1: ( rule__Activity__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1759:2: rule__Activity__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl3553);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1769:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1773:1: ( rule__Activity__Group__10__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1774:2: rule__Activity__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__103584);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1780:1: rule__Activity__Group__10__Impl : ( ';' ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1784:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1785:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1785:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1786:1: ';'
            {
             before(grammarAccess.getActivityAccess().getSemicolonKeyword_10()); 
            match(input,12,FOLLOW_12_in_rule__Activity__Group__10__Impl3612); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1821:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1825:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1826:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__03665);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__03668);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1833:1: rule__Activity__Group_5__0__Impl : ( 'inputs' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1837:1: ( ( 'inputs' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1838:1: ( 'inputs' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1838:1: ( 'inputs' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1839:1: 'inputs'
            {
             before(grammarAccess.getActivityAccess().getInputsKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Activity__Group_5__0__Impl3696); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1852:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1856:1: ( rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1857:2: rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__13727);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__13730);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1864:1: rule__Activity__Group_5__1__Impl : ( ( rule__Activity__InPortsAssignment_5_1 ) ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1868:1: ( ( ( rule__Activity__InPortsAssignment_5_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1869:1: ( ( rule__Activity__InPortsAssignment_5_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1869:1: ( ( rule__Activity__InPortsAssignment_5_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1870:1: ( rule__Activity__InPortsAssignment_5_1 )
            {
             before(grammarAccess.getActivityAccess().getInPortsAssignment_5_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1871:1: ( rule__Activity__InPortsAssignment_5_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1871:2: rule__Activity__InPortsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Activity__InPortsAssignment_5_1_in_rule__Activity__Group_5__1__Impl3757);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1881:1: rule__Activity__Group_5__2 : rule__Activity__Group_5__2__Impl ;
    public final void rule__Activity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1885:1: ( rule__Activity__Group_5__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1886:2: rule__Activity__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__23787);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1892:1: rule__Activity__Group_5__2__Impl : ( ( rule__Activity__Group_5_2__0 )* ) ;
    public final void rule__Activity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1896:1: ( ( ( rule__Activity__Group_5_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1897:1: ( ( rule__Activity__Group_5_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1897:1: ( ( rule__Activity__Group_5_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1898:1: ( rule__Activity__Group_5_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_5_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1899:1: ( rule__Activity__Group_5_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1899:2: rule__Activity__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__Group_5__2__Impl3814);
            	    rule__Activity__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1915:1: rule__Activity__Group_5_2__0 : rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 ;
    public final void rule__Activity__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1919:1: ( rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1920:2: rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__03851);
            rule__Activity__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__03854);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1927:1: rule__Activity__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1931:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1932:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1932:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1933:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_5_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group_5_2__0__Impl3882); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1946:1: rule__Activity__Group_5_2__1 : rule__Activity__Group_5_2__1__Impl ;
    public final void rule__Activity__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1950:1: ( rule__Activity__Group_5_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1951:2: rule__Activity__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__13913);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1957:1: rule__Activity__Group_5_2__1__Impl : ( ( rule__Activity__InPortsAssignment_5_2_1 ) ) ;
    public final void rule__Activity__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1961:1: ( ( ( rule__Activity__InPortsAssignment_5_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1962:1: ( ( rule__Activity__InPortsAssignment_5_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1962:1: ( ( rule__Activity__InPortsAssignment_5_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1963:1: ( rule__Activity__InPortsAssignment_5_2_1 )
            {
             before(grammarAccess.getActivityAccess().getInPortsAssignment_5_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1964:1: ( rule__Activity__InPortsAssignment_5_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1964:2: rule__Activity__InPortsAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Activity__InPortsAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl3940);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1978:1: rule__Activity__Group_6__0 : rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 ;
    public final void rule__Activity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1982:1: ( rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1983:2: rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__03974);
            rule__Activity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__03977);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1990:1: rule__Activity__Group_6__0__Impl : ( 'outputs' ) ;
    public final void rule__Activity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1994:1: ( ( 'outputs' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1995:1: ( 'outputs' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1995:1: ( 'outputs' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1996:1: 'outputs'
            {
             before(grammarAccess.getActivityAccess().getOutputsKeyword_6_0()); 
            match(input,22,FOLLOW_22_in_rule__Activity__Group_6__0__Impl4005); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2009:1: rule__Activity__Group_6__1 : rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 ;
    public final void rule__Activity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2013:1: ( rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2014:2: rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__14036);
            rule__Activity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__14039);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2021:1: rule__Activity__Group_6__1__Impl : ( ( rule__Activity__OutPortsAssignment_6_1 ) ) ;
    public final void rule__Activity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2025:1: ( ( ( rule__Activity__OutPortsAssignment_6_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2026:1: ( ( rule__Activity__OutPortsAssignment_6_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2026:1: ( ( rule__Activity__OutPortsAssignment_6_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2027:1: ( rule__Activity__OutPortsAssignment_6_1 )
            {
             before(grammarAccess.getActivityAccess().getOutPortsAssignment_6_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2028:1: ( rule__Activity__OutPortsAssignment_6_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2028:2: rule__Activity__OutPortsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Activity__OutPortsAssignment_6_1_in_rule__Activity__Group_6__1__Impl4066);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2038:1: rule__Activity__Group_6__2 : rule__Activity__Group_6__2__Impl ;
    public final void rule__Activity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2042:1: ( rule__Activity__Group_6__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2043:2: rule__Activity__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__24096);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2049:1: rule__Activity__Group_6__2__Impl : ( ( rule__Activity__Group_6_2__0 )* ) ;
    public final void rule__Activity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2053:1: ( ( ( rule__Activity__Group_6_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2054:1: ( ( rule__Activity__Group_6_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2054:1: ( ( rule__Activity__Group_6_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2055:1: ( rule__Activity__Group_6_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_6_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2056:1: ( rule__Activity__Group_6_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2056:2: rule__Activity__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__Group_6__2__Impl4123);
            	    rule__Activity__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2072:1: rule__Activity__Group_6_2__0 : rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 ;
    public final void rule__Activity__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2076:1: ( rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2077:2: rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__04160);
            rule__Activity__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__04163);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2084:1: rule__Activity__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2088:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2089:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2089:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2090:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_6_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group_6_2__0__Impl4191); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2103:1: rule__Activity__Group_6_2__1 : rule__Activity__Group_6_2__1__Impl ;
    public final void rule__Activity__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2107:1: ( rule__Activity__Group_6_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2108:2: rule__Activity__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__14222);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2114:1: rule__Activity__Group_6_2__1__Impl : ( ( rule__Activity__OutPortsAssignment_6_2_1 ) ) ;
    public final void rule__Activity__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2118:1: ( ( ( rule__Activity__OutPortsAssignment_6_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2119:1: ( ( rule__Activity__OutPortsAssignment_6_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2119:1: ( ( rule__Activity__OutPortsAssignment_6_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2120:1: ( rule__Activity__OutPortsAssignment_6_2_1 )
            {
             before(grammarAccess.getActivityAccess().getOutPortsAssignment_6_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2121:1: ( rule__Activity__OutPortsAssignment_6_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2121:2: rule__Activity__OutPortsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Activity__OutPortsAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl4249);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2135:1: rule__Activity__Group_7__0 : rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 ;
    public final void rule__Activity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2139:1: ( rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2140:2: rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__04283);
            rule__Activity__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__04286);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2147:1: rule__Activity__Group_7__0__Impl : ( 'subActivities' ) ;
    public final void rule__Activity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2151:1: ( ( 'subActivities' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2152:1: ( 'subActivities' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2152:1: ( 'subActivities' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2153:1: 'subActivities'
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesKeyword_7_0()); 
            match(input,23,FOLLOW_23_in_rule__Activity__Group_7__0__Impl4314); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2166:1: rule__Activity__Group_7__1 : rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2 ;
    public final void rule__Activity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2170:1: ( rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2171:2: rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__14345);
            rule__Activity__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7__2_in_rule__Activity__Group_7__14348);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2178:1: rule__Activity__Group_7__1__Impl : ( ( rule__Activity__SubActivitiesAssignment_7_1 ) ) ;
    public final void rule__Activity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2182:1: ( ( ( rule__Activity__SubActivitiesAssignment_7_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2183:1: ( ( rule__Activity__SubActivitiesAssignment_7_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2183:1: ( ( rule__Activity__SubActivitiesAssignment_7_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2184:1: ( rule__Activity__SubActivitiesAssignment_7_1 )
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2185:1: ( rule__Activity__SubActivitiesAssignment_7_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2185:2: rule__Activity__SubActivitiesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Activity__SubActivitiesAssignment_7_1_in_rule__Activity__Group_7__1__Impl4375);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2195:1: rule__Activity__Group_7__2 : rule__Activity__Group_7__2__Impl ;
    public final void rule__Activity__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2199:1: ( rule__Activity__Group_7__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2200:2: rule__Activity__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__2__Impl_in_rule__Activity__Group_7__24405);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2206:1: rule__Activity__Group_7__2__Impl : ( ( rule__Activity__Group_7_2__0 )* ) ;
    public final void rule__Activity__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2210:1: ( ( ( rule__Activity__Group_7_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2211:1: ( ( rule__Activity__Group_7_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2211:1: ( ( rule__Activity__Group_7_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2212:1: ( rule__Activity__Group_7_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_7_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2213:1: ( rule__Activity__Group_7_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2213:2: rule__Activity__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__Group_7__2__Impl4432);
            	    rule__Activity__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2229:1: rule__Activity__Group_7_2__0 : rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 ;
    public final void rule__Activity__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2233:1: ( rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2234:2: rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__04469);
            rule__Activity__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__04472);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2241:1: rule__Activity__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2245:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2246:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2246:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2247:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_7_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group_7_2__0__Impl4500); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2260:1: rule__Activity__Group_7_2__1 : rule__Activity__Group_7_2__1__Impl ;
    public final void rule__Activity__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2264:1: ( rule__Activity__Group_7_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2265:2: rule__Activity__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__14531);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2271:1: rule__Activity__Group_7_2__1__Impl : ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) ) ;
    public final void rule__Activity__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2275:1: ( ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2276:1: ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2276:1: ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2277:1: ( rule__Activity__SubActivitiesAssignment_7_2_1 )
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2278:1: ( rule__Activity__SubActivitiesAssignment_7_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2278:2: rule__Activity__SubActivitiesAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Activity__SubActivitiesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl4558);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2292:1: rule__Activity__Group_8__0 : rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 ;
    public final void rule__Activity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2296:1: ( rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2297:2: rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__04592);
            rule__Activity__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__04595);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2304:1: rule__Activity__Group_8__0__Impl : ( 'guidances' ) ;
    public final void rule__Activity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2308:1: ( ( 'guidances' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2309:1: ( 'guidances' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2309:1: ( 'guidances' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2310:1: 'guidances'
            {
             before(grammarAccess.getActivityAccess().getGuidancesKeyword_8_0()); 
            match(input,24,FOLLOW_24_in_rule__Activity__Group_8__0__Impl4623); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2323:1: rule__Activity__Group_8__1 : rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 ;
    public final void rule__Activity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2327:1: ( rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2328:2: rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__14654);
            rule__Activity__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__14657);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2335:1: rule__Activity__Group_8__1__Impl : ( ( rule__Activity__GuidancesAssignment_8_1 ) ) ;
    public final void rule__Activity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2339:1: ( ( ( rule__Activity__GuidancesAssignment_8_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2340:1: ( ( rule__Activity__GuidancesAssignment_8_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2340:1: ( ( rule__Activity__GuidancesAssignment_8_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2341:1: ( rule__Activity__GuidancesAssignment_8_1 )
            {
             before(grammarAccess.getActivityAccess().getGuidancesAssignment_8_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2342:1: ( rule__Activity__GuidancesAssignment_8_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2342:2: rule__Activity__GuidancesAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Activity__GuidancesAssignment_8_1_in_rule__Activity__Group_8__1__Impl4684);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2352:1: rule__Activity__Group_8__2 : rule__Activity__Group_8__2__Impl ;
    public final void rule__Activity__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2356:1: ( rule__Activity__Group_8__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2357:2: rule__Activity__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__24714);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2363:1: rule__Activity__Group_8__2__Impl : ( ( rule__Activity__Group_8_2__0 )* ) ;
    public final void rule__Activity__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2367:1: ( ( ( rule__Activity__Group_8_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2368:1: ( ( rule__Activity__Group_8_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2368:1: ( ( rule__Activity__Group_8_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2369:1: ( rule__Activity__Group_8_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_8_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2370:1: ( rule__Activity__Group_8_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2370:2: rule__Activity__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_8_2__0_in_rule__Activity__Group_8__2__Impl4741);
            	    rule__Activity__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2386:1: rule__Activity__Group_8_2__0 : rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1 ;
    public final void rule__Activity__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2390:1: ( rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2391:2: rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8_2__0__Impl_in_rule__Activity__Group_8_2__04778);
            rule__Activity__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8_2__1_in_rule__Activity__Group_8_2__04781);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2398:1: rule__Activity__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2402:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2403:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2403:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2404:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_8_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group_8_2__0__Impl4809); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2417:1: rule__Activity__Group_8_2__1 : rule__Activity__Group_8_2__1__Impl ;
    public final void rule__Activity__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2421:1: ( rule__Activity__Group_8_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2422:2: rule__Activity__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8_2__1__Impl_in_rule__Activity__Group_8_2__14840);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2428:1: rule__Activity__Group_8_2__1__Impl : ( ( rule__Activity__GuidancesAssignment_8_2_1 ) ) ;
    public final void rule__Activity__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2432:1: ( ( ( rule__Activity__GuidancesAssignment_8_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2433:1: ( ( rule__Activity__GuidancesAssignment_8_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2433:1: ( ( rule__Activity__GuidancesAssignment_8_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2434:1: ( rule__Activity__GuidancesAssignment_8_2_1 )
            {
             before(grammarAccess.getActivityAccess().getGuidancesAssignment_8_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2435:1: ( rule__Activity__GuidancesAssignment_8_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2435:2: rule__Activity__GuidancesAssignment_8_2_1
            {
            pushFollow(FOLLOW_rule__Activity__GuidancesAssignment_8_2_1_in_rule__Activity__Group_8_2__1__Impl4867);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2449:1: rule__Activity__Group_9__0 : rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 ;
    public final void rule__Activity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2453:1: ( rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2454:2: rule__Activity__Group_9__0__Impl rule__Activity__Group_9__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__04901);
            rule__Activity__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__04904);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2461:1: rule__Activity__Group_9__0__Impl : ( 'Behavior' ) ;
    public final void rule__Activity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2465:1: ( ( 'Behavior' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2466:1: ( 'Behavior' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2466:1: ( 'Behavior' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2467:1: 'Behavior'
            {
             before(grammarAccess.getActivityAccess().getBehaviorKeyword_9_0()); 
            match(input,25,FOLLOW_25_in_rule__Activity__Group_9__0__Impl4932); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2480:1: rule__Activity__Group_9__1 : rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 ;
    public final void rule__Activity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2484:1: ( rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2485:2: rule__Activity__Group_9__1__Impl rule__Activity__Group_9__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__14963);
            rule__Activity__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__14966);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2492:1: rule__Activity__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2496:1: ( ( '{' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2497:1: ( '{' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2497:1: ( '{' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2498:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,26,FOLLOW_26_in_rule__Activity__Group_9__1__Impl4994); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2511:1: rule__Activity__Group_9__2 : rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3 ;
    public final void rule__Activity__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2515:1: ( rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2516:2: rule__Activity__Group_9__2__Impl rule__Activity__Group_9__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__25025);
            rule__Activity__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_9__3_in_rule__Activity__Group_9__25028);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2523:1: rule__Activity__Group_9__2__Impl : ( ( rule__Activity__Alternatives_9_2 )* ) ;
    public final void rule__Activity__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2527:1: ( ( ( rule__Activity__Alternatives_9_2 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2528:1: ( ( rule__Activity__Alternatives_9_2 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2528:1: ( ( rule__Activity__Alternatives_9_2 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2529:1: ( rule__Activity__Alternatives_9_2 )*
            {
             before(grammarAccess.getActivityAccess().getAlternatives_9_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2530:1: ( rule__Activity__Alternatives_9_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=28 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2530:2: rule__Activity__Alternatives_9_2
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Alternatives_9_2_in_rule__Activity__Group_9__2__Impl5055);
            	    rule__Activity__Alternatives_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2540:1: rule__Activity__Group_9__3 : rule__Activity__Group_9__3__Impl ;
    public final void rule__Activity__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2544:1: ( rule__Activity__Group_9__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2545:2: rule__Activity__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_9__3__Impl_in_rule__Activity__Group_9__35086);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2551:1: rule__Activity__Group_9__3__Impl : ( '}' ) ;
    public final void rule__Activity__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2555:1: ( ( '}' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2556:1: ( '}' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2556:1: ( '}' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2557:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,27,FOLLOW_27_in_rule__Activity__Group_9__3__Impl5114); 
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


    // $ANTLR start "rule__ActivityRef__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2578:1: rule__ActivityRef__Group__0 : rule__ActivityRef__Group__0__Impl rule__ActivityRef__Group__1 ;
    public final void rule__ActivityRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2582:1: ( rule__ActivityRef__Group__0__Impl rule__ActivityRef__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2583:2: rule__ActivityRef__Group__0__Impl rule__ActivityRef__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityRef__Group__0__Impl_in_rule__ActivityRef__Group__05153);
            rule__ActivityRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityRef__Group__1_in_rule__ActivityRef__Group__05156);
            rule__ActivityRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityRef__Group__0"


    // $ANTLR start "rule__ActivityRef__Group__0__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2590:1: rule__ActivityRef__Group__0__Impl : ( ( rule__ActivityRef__NameAssignment_0 ) ) ;
    public final void rule__ActivityRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2594:1: ( ( ( rule__ActivityRef__NameAssignment_0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2595:1: ( ( rule__ActivityRef__NameAssignment_0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2595:1: ( ( rule__ActivityRef__NameAssignment_0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2596:1: ( rule__ActivityRef__NameAssignment_0 )
            {
             before(grammarAccess.getActivityRefAccess().getNameAssignment_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2597:1: ( rule__ActivityRef__NameAssignment_0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2597:2: rule__ActivityRef__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ActivityRef__NameAssignment_0_in_rule__ActivityRef__Group__0__Impl5183);
            rule__ActivityRef__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActivityRefAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityRef__Group__0__Impl"


    // $ANTLR start "rule__ActivityRef__Group__1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2607:1: rule__ActivityRef__Group__1 : rule__ActivityRef__Group__1__Impl rule__ActivityRef__Group__2 ;
    public final void rule__ActivityRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2611:1: ( rule__ActivityRef__Group__1__Impl rule__ActivityRef__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2612:2: rule__ActivityRef__Group__1__Impl rule__ActivityRef__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityRef__Group__1__Impl_in_rule__ActivityRef__Group__15213);
            rule__ActivityRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityRef__Group__2_in_rule__ActivityRef__Group__15216);
            rule__ActivityRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityRef__Group__1"


    // $ANTLR start "rule__ActivityRef__Group__1__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2619:1: rule__ActivityRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ActivityRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2623:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2624:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2624:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2625:1: ':'
            {
             before(grammarAccess.getActivityRefAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__ActivityRef__Group__1__Impl5244); 
             after(grammarAccess.getActivityRefAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityRef__Group__1__Impl"


    // $ANTLR start "rule__ActivityRef__Group__2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2638:1: rule__ActivityRef__Group__2 : rule__ActivityRef__Group__2__Impl ;
    public final void rule__ActivityRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2642:1: ( rule__ActivityRef__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2643:2: rule__ActivityRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityRef__Group__2__Impl_in_rule__ActivityRef__Group__25275);
            rule__ActivityRef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityRef__Group__2"


    // $ANTLR start "rule__ActivityRef__Group__2__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2649:1: rule__ActivityRef__Group__2__Impl : ( ( rule__ActivityRef__TypeAssignment_2 ) ) ;
    public final void rule__ActivityRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2653:1: ( ( ( rule__ActivityRef__TypeAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2654:1: ( ( rule__ActivityRef__TypeAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2654:1: ( ( rule__ActivityRef__TypeAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2655:1: ( rule__ActivityRef__TypeAssignment_2 )
            {
             before(grammarAccess.getActivityRefAccess().getTypeAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2656:1: ( rule__ActivityRef__TypeAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2656:2: rule__ActivityRef__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityRef__TypeAssignment_2_in_rule__ActivityRef__Group__2__Impl5302);
            rule__ActivityRef__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityRefAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityRef__Group__2__Impl"


    // $ANTLR start "rule__Decision__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2672:1: rule__Decision__Group__0 : rule__Decision__Group__0__Impl rule__Decision__Group__1 ;
    public final void rule__Decision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2676:1: ( rule__Decision__Group__0__Impl rule__Decision__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2677:2: rule__Decision__Group__0__Impl rule__Decision__Group__1
            {
            pushFollow(FOLLOW_rule__Decision__Group__0__Impl_in_rule__Decision__Group__05338);
            rule__Decision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decision__Group__1_in_rule__Decision__Group__05341);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2684:1: rule__Decision__Group__0__Impl : ( 'Decision' ) ;
    public final void rule__Decision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2688:1: ( ( 'Decision' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2689:1: ( 'Decision' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2689:1: ( 'Decision' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2690:1: 'Decision'
            {
             before(grammarAccess.getDecisionAccess().getDecisionKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Decision__Group__0__Impl5369); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2703:1: rule__Decision__Group__1 : rule__Decision__Group__1__Impl rule__Decision__Group__2 ;
    public final void rule__Decision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2707:1: ( rule__Decision__Group__1__Impl rule__Decision__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2708:2: rule__Decision__Group__1__Impl rule__Decision__Group__2
            {
            pushFollow(FOLLOW_rule__Decision__Group__1__Impl_in_rule__Decision__Group__15400);
            rule__Decision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decision__Group__2_in_rule__Decision__Group__15403);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2715:1: rule__Decision__Group__1__Impl : ( ( rule__Decision__NameAssignment_1 ) ) ;
    public final void rule__Decision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2719:1: ( ( ( rule__Decision__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2720:1: ( ( rule__Decision__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2720:1: ( ( rule__Decision__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2721:1: ( rule__Decision__NameAssignment_1 )
            {
             before(grammarAccess.getDecisionAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2722:1: ( rule__Decision__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2722:2: rule__Decision__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Decision__NameAssignment_1_in_rule__Decision__Group__1__Impl5430);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2732:1: rule__Decision__Group__2 : rule__Decision__Group__2__Impl ;
    public final void rule__Decision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2736:1: ( rule__Decision__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2737:2: rule__Decision__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Decision__Group__2__Impl_in_rule__Decision__Group__25460);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2743:1: rule__Decision__Group__2__Impl : ( ';' ) ;
    public final void rule__Decision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2747:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2748:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2748:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2749:1: ';'
            {
             before(grammarAccess.getDecisionAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Decision__Group__2__Impl5488); 
             after(grammarAccess.getDecisionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2768:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2772:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2773:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__05525);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__1_in_rule__Step__Group__05528);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2780:1: rule__Step__Group__0__Impl : ( 'Step' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2784:1: ( ( 'Step' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2785:1: ( 'Step' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2785:1: ( 'Step' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2786:1: 'Step'
            {
             before(grammarAccess.getStepAccess().getStepKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Step__Group__0__Impl5556); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2799:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2803:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2804:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__15587);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__2_in_rule__Step__Group__15590);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2811:1: rule__Step__Group__1__Impl : ( ( rule__Step__NameAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2815:1: ( ( ( rule__Step__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2816:1: ( ( rule__Step__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2816:1: ( ( rule__Step__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2817:1: ( rule__Step__NameAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2818:1: ( rule__Step__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2818:2: rule__Step__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Step__NameAssignment_1_in_rule__Step__Group__1__Impl5617);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2828:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2832:1: ( rule__Step__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2833:2: rule__Step__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__25647);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2839:1: rule__Step__Group__2__Impl : ( ';' ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2843:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2844:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2844:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2845:1: ';'
            {
             before(grammarAccess.getStepAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Step__Group__2__Impl5675); 
             after(grammarAccess.getStepAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2864:1: rule__InitialTransition__Group__0 : rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1 ;
    public final void rule__InitialTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2868:1: ( rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2869:2: rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__0__Impl_in_rule__InitialTransition__Group__05712);
            rule__InitialTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__1_in_rule__InitialTransition__Group__05715);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2876:1: rule__InitialTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__InitialTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2880:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2881:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2881:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2882:1: 'Transition'
            {
             before(grammarAccess.getInitialTransitionAccess().getTransitionKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__InitialTransition__Group__0__Impl5743); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2895:1: rule__InitialTransition__Group__1 : rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2 ;
    public final void rule__InitialTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2899:1: ( rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2900:2: rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__1__Impl_in_rule__InitialTransition__Group__15774);
            rule__InitialTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__2_in_rule__InitialTransition__Group__15777);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2907:1: rule__InitialTransition__Group__1__Impl : ( ( rule__InitialTransition__NameAssignment_1 ) ) ;
    public final void rule__InitialTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2911:1: ( ( ( rule__InitialTransition__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2912:1: ( ( rule__InitialTransition__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2912:1: ( ( rule__InitialTransition__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2913:1: ( rule__InitialTransition__NameAssignment_1 )
            {
             before(grammarAccess.getInitialTransitionAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2914:1: ( rule__InitialTransition__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2914:2: rule__InitialTransition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InitialTransition__NameAssignment_1_in_rule__InitialTransition__Group__1__Impl5804);
            rule__InitialTransition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2924:1: rule__InitialTransition__Group__2 : rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3 ;
    public final void rule__InitialTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2928:1: ( rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2929:2: rule__InitialTransition__Group__2__Impl rule__InitialTransition__Group__3
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__2__Impl_in_rule__InitialTransition__Group__25834);
            rule__InitialTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__3_in_rule__InitialTransition__Group__25837);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2936:1: rule__InitialTransition__Group__2__Impl : ( 'initial' ) ;
    public final void rule__InitialTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2940:1: ( ( 'initial' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2941:1: ( 'initial' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2941:1: ( 'initial' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2942:1: 'initial'
            {
             before(grammarAccess.getInitialTransitionAccess().getInitialKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__InitialTransition__Group__2__Impl5865); 
             after(grammarAccess.getInitialTransitionAccess().getInitialKeyword_2()); 

            }


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2955:1: rule__InitialTransition__Group__3 : rule__InitialTransition__Group__3__Impl rule__InitialTransition__Group__4 ;
    public final void rule__InitialTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2959:1: ( rule__InitialTransition__Group__3__Impl rule__InitialTransition__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2960:2: rule__InitialTransition__Group__3__Impl rule__InitialTransition__Group__4
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__3__Impl_in_rule__InitialTransition__Group__35896);
            rule__InitialTransition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__4_in_rule__InitialTransition__Group__35899);
            rule__InitialTransition__Group__4();

            state._fsp--;


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2967:1: rule__InitialTransition__Group__3__Impl : ( '->' ) ;
    public final void rule__InitialTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2971:1: ( ( '->' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2972:1: ( '->' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2972:1: ( '->' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2973:1: '->'
            {
             before(grammarAccess.getInitialTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__InitialTransition__Group__3__Impl5927); 
             after(grammarAccess.getInitialTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__InitialTransition__Group__4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2986:1: rule__InitialTransition__Group__4 : rule__InitialTransition__Group__4__Impl ;
    public final void rule__InitialTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2990:1: ( rule__InitialTransition__Group__4__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2991:2: rule__InitialTransition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__4__Impl_in_rule__InitialTransition__Group__45958);
            rule__InitialTransition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__Group__4"


    // $ANTLR start "rule__InitialTransition__Group__4__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2997:1: rule__InitialTransition__Group__4__Impl : ( ( rule__InitialTransition__ToAssignment_4 ) ) ;
    public final void rule__InitialTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3001:1: ( ( ( rule__InitialTransition__ToAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3002:1: ( ( rule__InitialTransition__ToAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3002:1: ( ( rule__InitialTransition__ToAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3003:1: ( rule__InitialTransition__ToAssignment_4 )
            {
             before(grammarAccess.getInitialTransitionAccess().getToAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3004:1: ( rule__InitialTransition__ToAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3004:2: rule__InitialTransition__ToAssignment_4
            {
            pushFollow(FOLLOW_rule__InitialTransition__ToAssignment_4_in_rule__InitialTransition__Group__4__Impl5985);
            rule__InitialTransition__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInitialTransitionAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__Group__4__Impl"


    // $ANTLR start "rule__FinalTransition__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3024:1: rule__FinalTransition__Group__0 : rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1 ;
    public final void rule__FinalTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3028:1: ( rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3029:2: rule__FinalTransition__Group__0__Impl rule__FinalTransition__Group__1
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__0__Impl_in_rule__FinalTransition__Group__06025);
            rule__FinalTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__1_in_rule__FinalTransition__Group__06028);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3036:1: rule__FinalTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__FinalTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3040:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3041:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3041:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3042:1: 'Transition'
            {
             before(grammarAccess.getFinalTransitionAccess().getTransitionKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__FinalTransition__Group__0__Impl6056); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3055:1: rule__FinalTransition__Group__1 : rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2 ;
    public final void rule__FinalTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3059:1: ( rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3060:2: rule__FinalTransition__Group__1__Impl rule__FinalTransition__Group__2
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__1__Impl_in_rule__FinalTransition__Group__16087);
            rule__FinalTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__2_in_rule__FinalTransition__Group__16090);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3067:1: rule__FinalTransition__Group__1__Impl : ( ( rule__FinalTransition__NameAssignment_1 ) ) ;
    public final void rule__FinalTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3071:1: ( ( ( rule__FinalTransition__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3072:1: ( ( rule__FinalTransition__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3072:1: ( ( rule__FinalTransition__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3073:1: ( rule__FinalTransition__NameAssignment_1 )
            {
             before(grammarAccess.getFinalTransitionAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3074:1: ( rule__FinalTransition__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3074:2: rule__FinalTransition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FinalTransition__NameAssignment_1_in_rule__FinalTransition__Group__1__Impl6117);
            rule__FinalTransition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3084:1: rule__FinalTransition__Group__2 : rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3 ;
    public final void rule__FinalTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3088:1: ( rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3089:2: rule__FinalTransition__Group__2__Impl rule__FinalTransition__Group__3
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__2__Impl_in_rule__FinalTransition__Group__26147);
            rule__FinalTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__3_in_rule__FinalTransition__Group__26150);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3096:1: rule__FinalTransition__Group__2__Impl : ( ( rule__FinalTransition__FromAssignment_2 ) ) ;
    public final void rule__FinalTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3100:1: ( ( ( rule__FinalTransition__FromAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3101:1: ( ( rule__FinalTransition__FromAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3101:1: ( ( rule__FinalTransition__FromAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3102:1: ( rule__FinalTransition__FromAssignment_2 )
            {
             before(grammarAccess.getFinalTransitionAccess().getFromAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3103:1: ( rule__FinalTransition__FromAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3103:2: rule__FinalTransition__FromAssignment_2
            {
            pushFollow(FOLLOW_rule__FinalTransition__FromAssignment_2_in_rule__FinalTransition__Group__2__Impl6177);
            rule__FinalTransition__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalTransitionAccess().getFromAssignment_2()); 

            }


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3113:1: rule__FinalTransition__Group__3 : rule__FinalTransition__Group__3__Impl rule__FinalTransition__Group__4 ;
    public final void rule__FinalTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3117:1: ( rule__FinalTransition__Group__3__Impl rule__FinalTransition__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3118:2: rule__FinalTransition__Group__3__Impl rule__FinalTransition__Group__4
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__3__Impl_in_rule__FinalTransition__Group__36207);
            rule__FinalTransition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FinalTransition__Group__4_in_rule__FinalTransition__Group__36210);
            rule__FinalTransition__Group__4();

            state._fsp--;


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3125:1: rule__FinalTransition__Group__3__Impl : ( '->' ) ;
    public final void rule__FinalTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3129:1: ( ( '->' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3130:1: ( '->' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3130:1: ( '->' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3131:1: '->'
            {
             before(grammarAccess.getFinalTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__FinalTransition__Group__3__Impl6238); 
             after(grammarAccess.getFinalTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__FinalTransition__Group__4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3144:1: rule__FinalTransition__Group__4 : rule__FinalTransition__Group__4__Impl ;
    public final void rule__FinalTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3148:1: ( rule__FinalTransition__Group__4__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3149:2: rule__FinalTransition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FinalTransition__Group__4__Impl_in_rule__FinalTransition__Group__46269);
            rule__FinalTransition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__Group__4"


    // $ANTLR start "rule__FinalTransition__Group__4__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3155:1: rule__FinalTransition__Group__4__Impl : ( 'final' ) ;
    public final void rule__FinalTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3159:1: ( ( 'final' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3160:1: ( 'final' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3160:1: ( 'final' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3161:1: 'final'
            {
             before(grammarAccess.getFinalTransitionAccess().getFinalKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__FinalTransition__Group__4__Impl6297); 
             after(grammarAccess.getFinalTransitionAccess().getFinalKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__Group__4__Impl"


    // $ANTLR start "rule__NonInitialTransition__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3184:1: rule__NonInitialTransition__Group__0 : rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1 ;
    public final void rule__NonInitialTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3188:1: ( rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3189:2: rule__NonInitialTransition__Group__0__Impl rule__NonInitialTransition__Group__1
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__0__Impl_in_rule__NonInitialTransition__Group__06338);
            rule__NonInitialTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__1_in_rule__NonInitialTransition__Group__06341);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3196:1: rule__NonInitialTransition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__NonInitialTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3200:1: ( ( 'Transition' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3201:1: ( 'Transition' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3201:1: ( 'Transition' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3202:1: 'Transition'
            {
             before(grammarAccess.getNonInitialTransitionAccess().getTransitionKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__NonInitialTransition__Group__0__Impl6369); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3215:1: rule__NonInitialTransition__Group__1 : rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2 ;
    public final void rule__NonInitialTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3219:1: ( rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3220:2: rule__NonInitialTransition__Group__1__Impl rule__NonInitialTransition__Group__2
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__1__Impl_in_rule__NonInitialTransition__Group__16400);
            rule__NonInitialTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__2_in_rule__NonInitialTransition__Group__16403);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3227:1: rule__NonInitialTransition__Group__1__Impl : ( ( rule__NonInitialTransition__NameAssignment_1 ) ) ;
    public final void rule__NonInitialTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3231:1: ( ( ( rule__NonInitialTransition__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3232:1: ( ( rule__NonInitialTransition__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3232:1: ( ( rule__NonInitialTransition__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3233:1: ( rule__NonInitialTransition__NameAssignment_1 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3234:1: ( rule__NonInitialTransition__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3234:2: rule__NonInitialTransition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__NameAssignment_1_in_rule__NonInitialTransition__Group__1__Impl6430);
            rule__NonInitialTransition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonInitialTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3244:1: rule__NonInitialTransition__Group__2 : rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3 ;
    public final void rule__NonInitialTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3248:1: ( rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3249:2: rule__NonInitialTransition__Group__2__Impl rule__NonInitialTransition__Group__3
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__2__Impl_in_rule__NonInitialTransition__Group__26460);
            rule__NonInitialTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__3_in_rule__NonInitialTransition__Group__26463);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3256:1: rule__NonInitialTransition__Group__2__Impl : ( ( rule__NonInitialTransition__FromAssignment_2 ) ) ;
    public final void rule__NonInitialTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3260:1: ( ( ( rule__NonInitialTransition__FromAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3261:1: ( ( rule__NonInitialTransition__FromAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3261:1: ( ( rule__NonInitialTransition__FromAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3262:1: ( rule__NonInitialTransition__FromAssignment_2 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3263:1: ( rule__NonInitialTransition__FromAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3263:2: rule__NonInitialTransition__FromAssignment_2
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__FromAssignment_2_in_rule__NonInitialTransition__Group__2__Impl6490);
            rule__NonInitialTransition__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNonInitialTransitionAccess().getFromAssignment_2()); 

            }


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3273:1: rule__NonInitialTransition__Group__3 : rule__NonInitialTransition__Group__3__Impl rule__NonInitialTransition__Group__4 ;
    public final void rule__NonInitialTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3277:1: ( rule__NonInitialTransition__Group__3__Impl rule__NonInitialTransition__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3278:2: rule__NonInitialTransition__Group__3__Impl rule__NonInitialTransition__Group__4
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__3__Impl_in_rule__NonInitialTransition__Group__36520);
            rule__NonInitialTransition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonInitialTransition__Group__4_in_rule__NonInitialTransition__Group__36523);
            rule__NonInitialTransition__Group__4();

            state._fsp--;


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3285:1: rule__NonInitialTransition__Group__3__Impl : ( '->' ) ;
    public final void rule__NonInitialTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3289:1: ( ( '->' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3290:1: ( '->' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3290:1: ( '->' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3291:1: '->'
            {
             before(grammarAccess.getNonInitialTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__NonInitialTransition__Group__3__Impl6551); 
             after(grammarAccess.getNonInitialTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__NonInitialTransition__Group__4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3304:1: rule__NonInitialTransition__Group__4 : rule__NonInitialTransition__Group__4__Impl ;
    public final void rule__NonInitialTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3308:1: ( rule__NonInitialTransition__Group__4__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3309:2: rule__NonInitialTransition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__Group__4__Impl_in_rule__NonInitialTransition__Group__46582);
            rule__NonInitialTransition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__Group__4"


    // $ANTLR start "rule__NonInitialTransition__Group__4__Impl"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3315:1: rule__NonInitialTransition__Group__4__Impl : ( ( rule__NonInitialTransition__ToAssignment_4 ) ) ;
    public final void rule__NonInitialTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3319:1: ( ( ( rule__NonInitialTransition__ToAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3320:1: ( ( rule__NonInitialTransition__ToAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3320:1: ( ( rule__NonInitialTransition__ToAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3321:1: ( rule__NonInitialTransition__ToAssignment_4 )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3322:1: ( rule__NonInitialTransition__ToAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3322:2: rule__NonInitialTransition__ToAssignment_4
            {
            pushFollow(FOLLOW_rule__NonInitialTransition__ToAssignment_4_in_rule__NonInitialTransition__Group__4__Impl6609);
            rule__NonInitialTransition__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNonInitialTransitionAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__Group__4__Impl"


    // $ANTLR start "rule__Textfield__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3342:1: rule__Textfield__Group__0 : rule__Textfield__Group__0__Impl rule__Textfield__Group__1 ;
    public final void rule__Textfield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3346:1: ( rule__Textfield__Group__0__Impl rule__Textfield__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3347:2: rule__Textfield__Group__0__Impl rule__Textfield__Group__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group__0__Impl_in_rule__Textfield__Group__06649);
            rule__Textfield__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__1_in_rule__Textfield__Group__06652);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3354:1: rule__Textfield__Group__0__Impl : ( ( rule__Textfield__Group_0__0 )? ) ;
    public final void rule__Textfield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3358:1: ( ( ( rule__Textfield__Group_0__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3359:1: ( ( rule__Textfield__Group_0__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3359:1: ( ( rule__Textfield__Group_0__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3360:1: ( rule__Textfield__Group_0__0 )?
            {
             before(grammarAccess.getTextfieldAccess().getGroup_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3361:1: ( rule__Textfield__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3361:2: rule__Textfield__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Textfield__Group_0__0_in_rule__Textfield__Group__0__Impl6679);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3371:1: rule__Textfield__Group__1 : rule__Textfield__Group__1__Impl rule__Textfield__Group__2 ;
    public final void rule__Textfield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3375:1: ( rule__Textfield__Group__1__Impl rule__Textfield__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3376:2: rule__Textfield__Group__1__Impl rule__Textfield__Group__2
            {
            pushFollow(FOLLOW_rule__Textfield__Group__1__Impl_in_rule__Textfield__Group__16710);
            rule__Textfield__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__2_in_rule__Textfield__Group__16713);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3383:1: rule__Textfield__Group__1__Impl : ( 'summary' ) ;
    public final void rule__Textfield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3387:1: ( ( 'summary' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3388:1: ( 'summary' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3388:1: ( 'summary' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3389:1: 'summary'
            {
             before(grammarAccess.getTextfieldAccess().getSummaryKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Textfield__Group__1__Impl6741); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3402:1: rule__Textfield__Group__2 : rule__Textfield__Group__2__Impl rule__Textfield__Group__3 ;
    public final void rule__Textfield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3406:1: ( rule__Textfield__Group__2__Impl rule__Textfield__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3407:2: rule__Textfield__Group__2__Impl rule__Textfield__Group__3
            {
            pushFollow(FOLLOW_rule__Textfield__Group__2__Impl_in_rule__Textfield__Group__26772);
            rule__Textfield__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__3_in_rule__Textfield__Group__26775);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3414:1: rule__Textfield__Group__2__Impl : ( ( rule__Textfield__SummaryAssignment_2 ) ) ;
    public final void rule__Textfield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3418:1: ( ( ( rule__Textfield__SummaryAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3419:1: ( ( rule__Textfield__SummaryAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3419:1: ( ( rule__Textfield__SummaryAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3420:1: ( rule__Textfield__SummaryAssignment_2 )
            {
             before(grammarAccess.getTextfieldAccess().getSummaryAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3421:1: ( rule__Textfield__SummaryAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3421:2: rule__Textfield__SummaryAssignment_2
            {
            pushFollow(FOLLOW_rule__Textfield__SummaryAssignment_2_in_rule__Textfield__Group__2__Impl6802);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3431:1: rule__Textfield__Group__3 : rule__Textfield__Group__3__Impl ;
    public final void rule__Textfield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3435:1: ( rule__Textfield__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3436:2: rule__Textfield__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group__3__Impl_in_rule__Textfield__Group__36832);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3442:1: rule__Textfield__Group__3__Impl : ( ( rule__Textfield__Group_3__0 )? ) ;
    public final void rule__Textfield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3446:1: ( ( ( rule__Textfield__Group_3__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3447:1: ( ( rule__Textfield__Group_3__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3447:1: ( ( rule__Textfield__Group_3__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3448:1: ( rule__Textfield__Group_3__0 )?
            {
             before(grammarAccess.getTextfieldAccess().getGroup_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3449:1: ( rule__Textfield__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3449:2: rule__Textfield__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Textfield__Group_3__0_in_rule__Textfield__Group__3__Impl6859);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3467:1: rule__Textfield__Group_0__0 : rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1 ;
    public final void rule__Textfield__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3471:1: ( rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3472:2: rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group_0__0__Impl_in_rule__Textfield__Group_0__06898);
            rule__Textfield__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group_0__1_in_rule__Textfield__Group_0__06901);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3479:1: rule__Textfield__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__Textfield__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3483:1: ( ( 'label' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3484:1: ( 'label' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3484:1: ( 'label' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3485:1: 'label'
            {
             before(grammarAccess.getTextfieldAccess().getLabelKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__Textfield__Group_0__0__Impl6929); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3498:1: rule__Textfield__Group_0__1 : rule__Textfield__Group_0__1__Impl ;
    public final void rule__Textfield__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3502:1: ( rule__Textfield__Group_0__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3503:2: rule__Textfield__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group_0__1__Impl_in_rule__Textfield__Group_0__16960);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3509:1: rule__Textfield__Group_0__1__Impl : ( ( rule__Textfield__LabelAssignment_0_1 ) ) ;
    public final void rule__Textfield__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3513:1: ( ( ( rule__Textfield__LabelAssignment_0_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3514:1: ( ( rule__Textfield__LabelAssignment_0_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3514:1: ( ( rule__Textfield__LabelAssignment_0_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3515:1: ( rule__Textfield__LabelAssignment_0_1 )
            {
             before(grammarAccess.getTextfieldAccess().getLabelAssignment_0_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3516:1: ( rule__Textfield__LabelAssignment_0_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3516:2: rule__Textfield__LabelAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Textfield__LabelAssignment_0_1_in_rule__Textfield__Group_0__1__Impl6987);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3530:1: rule__Textfield__Group_3__0 : rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1 ;
    public final void rule__Textfield__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3534:1: ( rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3535:2: rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group_3__0__Impl_in_rule__Textfield__Group_3__07021);
            rule__Textfield__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group_3__1_in_rule__Textfield__Group_3__07024);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3542:1: rule__Textfield__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Textfield__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3546:1: ( ( 'description' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3547:1: ( 'description' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3547:1: ( 'description' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3548:1: 'description'
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionKeyword_3_0()); 
            match(input,36,FOLLOW_36_in_rule__Textfield__Group_3__0__Impl7052); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3561:1: rule__Textfield__Group_3__1 : rule__Textfield__Group_3__1__Impl ;
    public final void rule__Textfield__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3565:1: ( rule__Textfield__Group_3__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3566:2: rule__Textfield__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group_3__1__Impl_in_rule__Textfield__Group_3__17083);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3572:1: rule__Textfield__Group_3__1__Impl : ( ( rule__Textfield__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Textfield__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3576:1: ( ( ( rule__Textfield__DescriptionAssignment_3_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3577:1: ( ( rule__Textfield__DescriptionAssignment_3_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3577:1: ( ( rule__Textfield__DescriptionAssignment_3_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3578:1: ( rule__Textfield__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionAssignment_3_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3579:1: ( rule__Textfield__DescriptionAssignment_3_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3579:2: rule__Textfield__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Textfield__DescriptionAssignment_3_1_in_rule__Textfield__Group_3__1__Impl7110);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3594:1: rule__Model__ActivitiesAssignment_0 : ( ruleActivity ) ;
    public final void rule__Model__ActivitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3598:1: ( ( ruleActivity ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3599:1: ( ruleActivity )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3599:1: ( ruleActivity )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3600:1: ruleActivity
            {
             before(grammarAccess.getModelAccess().getActivitiesActivityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleActivity_in_rule__Model__ActivitiesAssignment_07149);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3609:1: rule__Model__RolesAssignment_1 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3613:1: ( ( ruleRole ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3614:1: ( ruleRole )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3614:1: ( ruleRole )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3615:1: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Model__RolesAssignment_17180);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3624:1: rule__Model__WorkProductsAssignment_2 : ( ruleWorkProduct ) ;
    public final void rule__Model__WorkProductsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3628:1: ( ( ruleWorkProduct ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3629:1: ( ruleWorkProduct )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3629:1: ( ruleWorkProduct )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3630:1: ruleWorkProduct
            {
             before(grammarAccess.getModelAccess().getWorkProductsWorkProductParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWorkProduct_in_rule__Model__WorkProductsAssignment_27211);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3639:1: rule__Model__WorkProductTypesAssignment_3 : ( ruleWorkProductType ) ;
    public final void rule__Model__WorkProductTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3643:1: ( ( ruleWorkProductType ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3644:1: ( ruleWorkProductType )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3644:1: ( ruleWorkProductType )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3645:1: ruleWorkProductType
            {
             before(grammarAccess.getModelAccess().getWorkProductTypesWorkProductTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWorkProductType_in_rule__Model__WorkProductTypesAssignment_37242);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3654:1: rule__Model__GuidancesAssignment_4 : ( ruleGuidance ) ;
    public final void rule__Model__GuidancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3658:1: ( ( ruleGuidance ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3659:1: ( ruleGuidance )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3659:1: ( ruleGuidance )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3660:1: ruleGuidance
            {
             before(grammarAccess.getModelAccess().getGuidancesGuidanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleGuidance_in_rule__Model__GuidancesAssignment_47273);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3669:1: rule__Model__GuidanceTypesAssignment_5 : ( ruleGuidanceType ) ;
    public final void rule__Model__GuidanceTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3673:1: ( ( ruleGuidanceType ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3674:1: ( ruleGuidanceType )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3674:1: ( ruleGuidanceType )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3675:1: ruleGuidanceType
            {
             before(grammarAccess.getModelAccess().getGuidanceTypesGuidanceTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleGuidanceType_in_rule__Model__GuidanceTypesAssignment_57304);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3684:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3688:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3689:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3689:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3690:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17335); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3699:1: rule__Role__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__Role__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3703:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3704:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3704:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3705:1: ruleTextfield
            {
             before(grammarAccess.getRoleAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Role__TextfieldAssignment_27366);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3714:1: rule__WorkProductType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkProductType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3718:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3719:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3719:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3720:1: RULE_ID
            {
             before(grammarAccess.getWorkProductTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProductType__NameAssignment_17397); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3729:1: rule__WorkProductType__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__WorkProductType__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3733:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3734:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3734:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3735:1: ruleTextfield
            {
             before(grammarAccess.getWorkProductTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__WorkProductType__TextfieldAssignment_27428);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3744:1: rule__WorkProduct__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkProduct__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3748:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3749:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3749:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3750:1: RULE_ID
            {
             before(grammarAccess.getWorkProductAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProduct__NameAssignment_17459); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3759:1: rule__WorkProduct__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkProduct__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3763:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3764:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3764:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3765:1: ( RULE_ID )
            {
             before(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3766:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3767:1: RULE_ID
            {
             before(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProduct__TypeAssignment_37494); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3778:1: rule__WorkProduct__TextfieldAssignment_4 : ( ruleTextfield ) ;
    public final void rule__WorkProduct__TextfieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3782:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3783:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3783:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3784:1: ruleTextfield
            {
             before(grammarAccess.getWorkProductAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__WorkProduct__TextfieldAssignment_47529);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3793:1: rule__GuidanceType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GuidanceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3797:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3798:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3798:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3799:1: RULE_ID
            {
             before(grammarAccess.getGuidanceTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GuidanceType__NameAssignment_17560); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3808:1: rule__GuidanceType__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__GuidanceType__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3812:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3813:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3813:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3814:1: ruleTextfield
            {
             before(grammarAccess.getGuidanceTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__GuidanceType__TextfieldAssignment_27591);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3823:1: rule__Guidance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Guidance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3827:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3828:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3828:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3829:1: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guidance__NameAssignment_17622); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3838:1: rule__Guidance__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3842:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3843:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3843:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3844:1: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3845:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3846:1: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guidance__TypeAssignment_37657); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3857:1: rule__Guidance__TextfieldAssignment_4 : ( ruleTextfield ) ;
    public final void rule__Guidance__TextfieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3861:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3862:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3862:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3863:1: ruleTextfield
            {
             before(grammarAccess.getGuidanceAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Guidance__TextfieldAssignment_47692);
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


    // $ANTLR start "rule__Port__NameAssignment_0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3872:1: rule__Port__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3876:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3877:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3877:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3878:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_07723); 
             after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NameAssignment_0"


    // $ANTLR start "rule__Port__TypeAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3887:1: rule__Port__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Port__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3891:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3892:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3892:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3893:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getTypeWorkProductCrossReference_2_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3894:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3895:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getTypeWorkProductIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__TypeAssignment_27758); 
             after(grammarAccess.getPortAccess().getTypeWorkProductIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPortAccess().getTypeWorkProductCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__TypeAssignment_2"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3906:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3910:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3911:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3911:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3912:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_17793); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3921:1: rule__Activity__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__Activity__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3925:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3926:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3926:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3927:1: ruleTextfield
            {
             before(grammarAccess.getActivityAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Activity__TextfieldAssignment_27824);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3936:1: rule__Activity__RoleAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__RoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3940:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3941:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3941:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3942:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getRoleRoleCrossReference_4_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3943:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3944:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getRoleRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__RoleAssignment_47859); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3955:1: rule__Activity__InPortsAssignment_5_1 : ( rulePort ) ;
    public final void rule__Activity__InPortsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3959:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3960:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3960:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3961:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_17894);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3970:1: rule__Activity__InPortsAssignment_5_2_1 : ( rulePort ) ;
    public final void rule__Activity__InPortsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3974:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3975:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3975:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3976:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_2_17925);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3985:1: rule__Activity__OutPortsAssignment_6_1 : ( rulePort ) ;
    public final void rule__Activity__OutPortsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3989:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3990:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3990:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3991:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_17956);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4000:1: rule__Activity__OutPortsAssignment_6_2_1 : ( rulePort ) ;
    public final void rule__Activity__OutPortsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4004:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4005:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4005:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4006:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_2_17987);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4015:1: rule__Activity__SubActivitiesAssignment_7_1 : ( ruleActivityRef ) ;
    public final void rule__Activity__SubActivitiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4019:1: ( ( ruleActivityRef ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4020:1: ( ruleActivityRef )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4020:1: ( ruleActivityRef )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4021:1: ruleActivityRef
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_18018);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4030:1: rule__Activity__SubActivitiesAssignment_7_2_1 : ( ruleActivityRef ) ;
    public final void rule__Activity__SubActivitiesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4034:1: ( ( ruleActivityRef ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4035:1: ( ruleActivityRef )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4035:1: ( ruleActivityRef )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4036:1: ruleActivityRef
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_2_18049);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4045:1: rule__Activity__GuidancesAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__GuidancesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4049:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4050:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4050:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4051:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4052:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4053:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_18084); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4064:1: rule__Activity__GuidancesAssignment_8_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__GuidancesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4068:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4069:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4069:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4070:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_2_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4071:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4072:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_2_18123); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4083:1: rule__Activity__StepsAssignment_9_2_0 : ( ruleStep ) ;
    public final void rule__Activity__StepsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4087:1: ( ( ruleStep ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4088:1: ( ruleStep )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4088:1: ( ruleStep )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4089:1: ruleStep
            {
             before(grammarAccess.getActivityAccess().getStepsStepParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Activity__StepsAssignment_9_2_08158);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4098:1: rule__Activity__DecisionsAssignment_9_2_1 : ( ruleDecision ) ;
    public final void rule__Activity__DecisionsAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4102:1: ( ( ruleDecision ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4103:1: ( ruleDecision )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4103:1: ( ruleDecision )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4104:1: ruleDecision
            {
             before(grammarAccess.getActivityAccess().getDecisionsDecisionParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_ruleDecision_in_rule__Activity__DecisionsAssignment_9_2_18189);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4113:1: rule__Activity__TransitionsAssignment_9_2_2 : ( ruleTransition ) ;
    public final void rule__Activity__TransitionsAssignment_9_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4117:1: ( ( ruleTransition ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4118:1: ( ruleTransition )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4118:1: ( ruleTransition )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4119:1: ruleTransition
            {
             before(grammarAccess.getActivityAccess().getTransitionsTransitionParserRuleCall_9_2_2_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__Activity__TransitionsAssignment_9_2_28220);
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


    // $ANTLR start "rule__ActivityRef__NameAssignment_0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4128:1: rule__ActivityRef__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ActivityRef__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4132:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4133:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4133:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4134:1: RULE_ID
            {
             before(grammarAccess.getActivityRefAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityRef__NameAssignment_08251); 
             after(grammarAccess.getActivityRefAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityRef__NameAssignment_0"


    // $ANTLR start "rule__ActivityRef__TypeAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4143:1: rule__ActivityRef__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ActivityRef__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4147:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4148:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4148:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4149:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityRefAccess().getTypeActivityCrossReference_2_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4150:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4151:1: RULE_ID
            {
             before(grammarAccess.getActivityRefAccess().getTypeActivityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityRef__TypeAssignment_28286); 
             after(grammarAccess.getActivityRefAccess().getTypeActivityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getActivityRefAccess().getTypeActivityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityRef__TypeAssignment_2"


    // $ANTLR start "rule__Decision__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4162:1: rule__Decision__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decision__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4166:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4167:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4167:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4168:1: RULE_ID
            {
             before(grammarAccess.getDecisionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decision__NameAssignment_18321); 
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


    // $ANTLR start "rule__Step__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4177:1: rule__Step__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Step__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4181:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4182:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4182:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4183:1: RULE_ID
            {
             before(grammarAccess.getStepAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Step__NameAssignment_18352); 
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


    // $ANTLR start "rule__InitialTransition__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4192:1: rule__InitialTransition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialTransition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4196:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4197:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4197:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4198:1: RULE_ID
            {
             before(grammarAccess.getInitialTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InitialTransition__NameAssignment_18383); 
             after(grammarAccess.getInitialTransitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__NameAssignment_1"


    // $ANTLR start "rule__InitialTransition__ToAssignment_4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4207:1: rule__InitialTransition__ToAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InitialTransition__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4211:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4212:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4212:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4213:1: ( RULE_ID )
            {
             before(grammarAccess.getInitialTransitionAccess().getToNodeCrossReference_4_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4214:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4215:1: RULE_ID
            {
             before(grammarAccess.getInitialTransitionAccess().getToNodeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InitialTransition__ToAssignment_48418); 
             after(grammarAccess.getInitialTransitionAccess().getToNodeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInitialTransitionAccess().getToNodeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialTransition__ToAssignment_4"


    // $ANTLR start "rule__FinalTransition__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4226:1: rule__FinalTransition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FinalTransition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4230:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4231:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4231:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4232:1: RULE_ID
            {
             before(grammarAccess.getFinalTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FinalTransition__NameAssignment_18453); 
             after(grammarAccess.getFinalTransitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__NameAssignment_1"


    // $ANTLR start "rule__FinalTransition__FromAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4241:1: rule__FinalTransition__FromAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FinalTransition__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4245:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4246:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4246:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4247:1: ( RULE_ID )
            {
             before(grammarAccess.getFinalTransitionAccess().getFromNodeCrossReference_2_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4248:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4249:1: RULE_ID
            {
             before(grammarAccess.getFinalTransitionAccess().getFromNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FinalTransition__FromAssignment_28488); 
             after(grammarAccess.getFinalTransitionAccess().getFromNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFinalTransitionAccess().getFromNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalTransition__FromAssignment_2"


    // $ANTLR start "rule__NonInitialTransition__NameAssignment_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4260:1: rule__NonInitialTransition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NonInitialTransition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4264:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4265:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4265:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4266:1: RULE_ID
            {
             before(grammarAccess.getNonInitialTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonInitialTransition__NameAssignment_18523); 
             after(grammarAccess.getNonInitialTransitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__NameAssignment_1"


    // $ANTLR start "rule__NonInitialTransition__FromAssignment_2"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4275:1: rule__NonInitialTransition__FromAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__NonInitialTransition__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4279:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4280:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4280:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4281:1: ( RULE_ID )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromNodeCrossReference_2_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4282:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4283:1: RULE_ID
            {
             before(grammarAccess.getNonInitialTransitionAccess().getFromNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonInitialTransition__FromAssignment_28558); 
             after(grammarAccess.getNonInitialTransitionAccess().getFromNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getNonInitialTransitionAccess().getFromNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__FromAssignment_2"


    // $ANTLR start "rule__NonInitialTransition__ToAssignment_4"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4294:1: rule__NonInitialTransition__ToAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__NonInitialTransition__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4298:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4299:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4299:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4300:1: ( RULE_ID )
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToNodeCrossReference_4_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4301:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4302:1: RULE_ID
            {
             before(grammarAccess.getNonInitialTransitionAccess().getToNodeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonInitialTransition__ToAssignment_48597); 
             after(grammarAccess.getNonInitialTransitionAccess().getToNodeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getNonInitialTransitionAccess().getToNodeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonInitialTransition__ToAssignment_4"


    // $ANTLR start "rule__Textfield__LabelAssignment_0_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4313:1: rule__Textfield__LabelAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Textfield__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4317:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4318:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4318:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4319:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getLabelSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__LabelAssignment_0_18632); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4328:1: rule__Textfield__SummaryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Textfield__SummaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4332:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4333:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4333:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4334:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getSummarySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__SummaryAssignment_28663); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4343:1: rule__Textfield__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Textfield__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4347:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4348:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4348:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:4349:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__DescriptionAssignment_3_18694); 
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
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000076802L});
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
    public static final BitSet FOLLOW_rulePort_in_entryRulePort424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_entryRuleActivityRef544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityRef551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__0_in_ruleActivityRef577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecision_in_entryRuleDecision606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecision613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__0_in_ruleDecision639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0_in_ruleStep699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_in_ruleTransition759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialTransition793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__0_in_ruleInitialTransition819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinalTransition853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__0_in_ruleFinalTransition879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonInitialTransition913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__0_in_ruleNonInitialTransition939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_entryRuleTextfield966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfield973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__0_in_ruleTextfield999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ActivitiesAssignment_0_in_rule__Model__Alternatives1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RolesAssignment_1_in_rule__Model__Alternatives1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorkProductsAssignment_2_in_rule__Model__Alternatives1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorkProductTypesAssignment_3_in_rule__Model__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GuidancesAssignment_4_in_rule__Model__Alternatives1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GuidanceTypesAssignment_5_in_rule__Model__Alternatives1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__StepsAssignment_9_2_0_in_rule__Activity__Alternatives_9_21159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DecisionsAssignment_9_2_1_in_rule__Activity__Alternatives_9_21177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__TransitionsAssignment_9_2_2_in_rule__Activity__Alternatives_9_21195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_rule__Transition__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_rule__Transition__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_rule__Transition__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__01293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__01296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Role__Group__0__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__11355 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__21415 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__21418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__TextfieldAssignment_2_in_rule__Role__Group__2__Impl1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__31475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Role__Group__3__Impl1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__0__Impl_in_rule__WorkProductType__Group__01542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__1_in_rule__WorkProductType__Group__01545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WorkProductType__Group__0__Impl1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__1__Impl_in_rule__WorkProductType__Group__11604 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__2_in_rule__WorkProductType__Group__11607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__NameAssignment_1_in_rule__WorkProductType__Group__1__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__2__Impl_in_rule__WorkProductType__Group__21664 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__3_in_rule__WorkProductType__Group__21667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__TextfieldAssignment_2_in_rule__WorkProductType__Group__2__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__3__Impl_in_rule__WorkProductType__Group__31724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkProductType__Group__3__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__0__Impl_in_rule__WorkProduct__Group__01791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__1_in_rule__WorkProduct__Group__01794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WorkProduct__Group__0__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__1__Impl_in_rule__WorkProduct__Group__11853 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__2_in_rule__WorkProduct__Group__11856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__NameAssignment_1_in_rule__WorkProduct__Group__1__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__2__Impl_in_rule__WorkProduct__Group__21913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__3_in_rule__WorkProduct__Group__21916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WorkProduct__Group__2__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__3__Impl_in_rule__WorkProduct__Group__31975 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__4_in_rule__WorkProduct__Group__31978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__TypeAssignment_3_in_rule__WorkProduct__Group__3__Impl2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__4__Impl_in_rule__WorkProduct__Group__42035 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__5_in_rule__WorkProduct__Group__42038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__TextfieldAssignment_4_in_rule__WorkProduct__Group__4__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__5__Impl_in_rule__WorkProduct__Group__52095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkProduct__Group__5__Impl2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__0__Impl_in_rule__GuidanceType__Group__02166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__1_in_rule__GuidanceType__Group__02169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GuidanceType__Group__0__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__1__Impl_in_rule__GuidanceType__Group__12228 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__2_in_rule__GuidanceType__Group__12231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__NameAssignment_1_in_rule__GuidanceType__Group__1__Impl2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__2__Impl_in_rule__GuidanceType__Group__22288 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__3_in_rule__GuidanceType__Group__22291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__TextfieldAssignment_2_in_rule__GuidanceType__Group__2__Impl2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__3__Impl_in_rule__GuidanceType__Group__32348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GuidanceType__Group__3__Impl2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Guidance__Group__0__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__12477 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__12480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__NameAssignment_1_in_rule__Guidance__Group__1__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__22537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guidance__Group__3_in_rule__Guidance__Group__22540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Guidance__Group__2__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__3__Impl_in_rule__Guidance__Group__32599 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__4_in_rule__Guidance__Group__32602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TypeAssignment_3_in_rule__Guidance__Group__3__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__4__Impl_in_rule__Guidance__Group__42659 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__5_in_rule__Guidance__Group__42662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TextfieldAssignment_4_in_rule__Guidance__Group__4__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__5__Impl_in_rule__Guidance__Group__52719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Guidance__Group__5__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02790 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_0_in_rule__Port__Group__0__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__2_in_rule__Port__Group__12853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Port__Group__1__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__22912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__TypeAssignment_2_in_rule__Port__Group__2__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Activity__Group__0__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13037 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23097 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__TextfieldAssignment_2_in_rule__Activity__Group__2__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Activity__Group__3__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43219 = new BitSet(new long[]{0x0000000003D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__RoleAssignment_4_in_rule__Activity__Group__4__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__53279 = new BitSet(new long[]{0x0000000003D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__53282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63340 = new BitSet(new long[]{0x0000000003D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73401 = new BitSet(new long[]{0x0000000003D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__73404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__83462 = new BitSet(new long[]{0x0000000003D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__83465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__93523 = new BitSet(new long[]{0x0000000003D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__93526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0_in_rule__Activity__Group__9__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__103584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Activity__Group__10__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__03665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__03668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Activity__Group_5__0__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__13727 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__13730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InPortsAssignment_5_1_in_rule__Activity__Group_5__1__Impl3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__23787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__Group_5__2__Impl3814 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__03851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__03854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group_5_2__0__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__13913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InPortsAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__03974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__03977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Activity__Group_6__0__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__14036 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__14039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OutPortsAssignment_6_1_in_rule__Activity__Group_6__1__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__24096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__Group_6__2__Impl4123 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__04160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__04163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group_6_2__0__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__14222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OutPortsAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__04283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__04286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Activity__Group_7__0__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__14345 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__2_in_rule__Activity__Group_7__14348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SubActivitiesAssignment_7_1_in_rule__Activity__Group_7__1__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__2__Impl_in_rule__Activity__Group_7__24405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__Group_7__2__Impl4432 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__04469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__04472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group_7_2__0__Impl4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__14531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SubActivitiesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__04592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__04595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group_8__0__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__14654 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__14657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__GuidancesAssignment_8_1_in_rule__Activity__Group_8__1__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__24714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__0_in_rule__Activity__Group_8__2__Impl4741 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__0__Impl_in_rule__Activity__Group_8_2__04778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__1_in_rule__Activity__Group_8_2__04781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group_8_2__0__Impl4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__1__Impl_in_rule__Activity__Group_8_2__14840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__GuidancesAssignment_8_2_1_in_rule__Activity__Group_8_2__1__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__0__Impl_in_rule__Activity__Group_9__04901 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1_in_rule__Activity__Group_9__04904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Activity__Group_9__0__Impl4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__1__Impl_in_rule__Activity__Group_9__14963 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2_in_rule__Activity__Group_9__14966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group_9__1__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__2__Impl_in_rule__Activity__Group_9__25025 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__3_in_rule__Activity__Group_9__25028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_9_2_in_rule__Activity__Group_9__2__Impl5055 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_9__3__Impl_in_rule__Activity__Group_9__35086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group_9__3__Impl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__0__Impl_in_rule__ActivityRef__Group__05153 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__1_in_rule__ActivityRef__Group__05156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__NameAssignment_0_in_rule__ActivityRef__Group__0__Impl5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__1__Impl_in_rule__ActivityRef__Group__15213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__2_in_rule__ActivityRef__Group__15216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ActivityRef__Group__1__Impl5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__2__Impl_in_rule__ActivityRef__Group__25275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__TypeAssignment_2_in_rule__ActivityRef__Group__2__Impl5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__0__Impl_in_rule__Decision__Group__05338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decision__Group__1_in_rule__Decision__Group__05341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Decision__Group__0__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__1__Impl_in_rule__Decision__Group__15400 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Decision__Group__2_in_rule__Decision__Group__15403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__NameAssignment_1_in_rule__Decision__Group__1__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decision__Group__2__Impl_in_rule__Decision__Group__25460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Decision__Group__2__Impl5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__05525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Step__Group__1_in_rule__Step__Group__05528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Step__Group__0__Impl5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__15587 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Step__Group__2_in_rule__Step__Group__15590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__NameAssignment_1_in_rule__Step__Group__1__Impl5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__25647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Step__Group__2__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__0__Impl_in_rule__InitialTransition__Group__05712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__1_in_rule__InitialTransition__Group__05715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InitialTransition__Group__0__Impl5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__1__Impl_in_rule__InitialTransition__Group__15774 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__2_in_rule__InitialTransition__Group__15777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__NameAssignment_1_in_rule__InitialTransition__Group__1__Impl5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__2__Impl_in_rule__InitialTransition__Group__25834 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__3_in_rule__InitialTransition__Group__25837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InitialTransition__Group__2__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__3__Impl_in_rule__InitialTransition__Group__35896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__4_in_rule__InitialTransition__Group__35899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InitialTransition__Group__3__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__4__Impl_in_rule__InitialTransition__Group__45958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__ToAssignment_4_in_rule__InitialTransition__Group__4__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__0__Impl_in_rule__FinalTransition__Group__06025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__1_in_rule__FinalTransition__Group__06028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FinalTransition__Group__0__Impl6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__1__Impl_in_rule__FinalTransition__Group__16087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__2_in_rule__FinalTransition__Group__16090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__NameAssignment_1_in_rule__FinalTransition__Group__1__Impl6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__2__Impl_in_rule__FinalTransition__Group__26147 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__3_in_rule__FinalTransition__Group__26150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__FromAssignment_2_in_rule__FinalTransition__Group__2__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__3__Impl_in_rule__FinalTransition__Group__36207 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__4_in_rule__FinalTransition__Group__36210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FinalTransition__Group__3__Impl6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FinalTransition__Group__4__Impl_in_rule__FinalTransition__Group__46269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FinalTransition__Group__4__Impl6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__0__Impl_in_rule__NonInitialTransition__Group__06338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__1_in_rule__NonInitialTransition__Group__06341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NonInitialTransition__Group__0__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__1__Impl_in_rule__NonInitialTransition__Group__16400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__2_in_rule__NonInitialTransition__Group__16403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__NameAssignment_1_in_rule__NonInitialTransition__Group__1__Impl6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__2__Impl_in_rule__NonInitialTransition__Group__26460 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__3_in_rule__NonInitialTransition__Group__26463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__FromAssignment_2_in_rule__NonInitialTransition__Group__2__Impl6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__3__Impl_in_rule__NonInitialTransition__Group__36520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__4_in_rule__NonInitialTransition__Group__36523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__NonInitialTransition__Group__3__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__Group__4__Impl_in_rule__NonInitialTransition__Group__46582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonInitialTransition__ToAssignment_4_in_rule__NonInitialTransition__Group__4__Impl6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__0__Impl_in_rule__Textfield__Group__06649 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Textfield__Group__1_in_rule__Textfield__Group__06652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__0_in_rule__Textfield__Group__0__Impl6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__1__Impl_in_rule__Textfield__Group__16710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group__2_in_rule__Textfield__Group__16713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Textfield__Group__1__Impl6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__2__Impl_in_rule__Textfield__Group__26772 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Textfield__Group__3_in_rule__Textfield__Group__26775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__SummaryAssignment_2_in_rule__Textfield__Group__2__Impl6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__3__Impl_in_rule__Textfield__Group__36832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__0_in_rule__Textfield__Group__3__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__0__Impl_in_rule__Textfield__Group_0__06898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__1_in_rule__Textfield__Group_0__06901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Textfield__Group_0__0__Impl6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__1__Impl_in_rule__Textfield__Group_0__16960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__LabelAssignment_0_1_in_rule__Textfield__Group_0__1__Impl6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__0__Impl_in_rule__Textfield__Group_3__07021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__1_in_rule__Textfield__Group_3__07024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Textfield__Group_3__0__Impl7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__1__Impl_in_rule__Textfield__Group_3__17083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__DescriptionAssignment_3_1_in_rule__Textfield__Group_3__1__Impl7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Model__ActivitiesAssignment_07149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Model__RolesAssignment_17180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_rule__Model__WorkProductsAssignment_27211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_rule__Model__WorkProductTypesAssignment_37242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_rule__Model__GuidancesAssignment_47273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_rule__Model__GuidanceTypesAssignment_57304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Role__TextfieldAssignment_27366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProductType__NameAssignment_17397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__WorkProductType__TextfieldAssignment_27428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProduct__NameAssignment_17459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProduct__TypeAssignment_37494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__WorkProduct__TextfieldAssignment_47529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GuidanceType__NameAssignment_17560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__GuidanceType__TextfieldAssignment_27591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guidance__NameAssignment_17622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guidance__TypeAssignment_37657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Guidance__TextfieldAssignment_47692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_07723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__TypeAssignment_27758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_17793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Activity__TextfieldAssignment_27824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__RoleAssignment_47859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_17894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_2_17925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_17956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_2_17987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_18018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_2_18049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_18084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_2_18123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Activity__StepsAssignment_9_2_08158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecision_in_rule__Activity__DecisionsAssignment_9_2_18189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Activity__TransitionsAssignment_9_2_28220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityRef__NameAssignment_08251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityRef__TypeAssignment_28286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decision__NameAssignment_18321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Step__NameAssignment_18352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InitialTransition__NameAssignment_18383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InitialTransition__ToAssignment_48418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FinalTransition__NameAssignment_18453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FinalTransition__FromAssignment_28488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonInitialTransition__NameAssignment_18523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonInitialTransition__FromAssignment_28558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonInitialTransition__ToAssignment_48597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__LabelAssignment_0_18632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__SummaryAssignment_28663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__DescriptionAssignment_3_18694 = new BitSet(new long[]{0x0000000000000002L});

}