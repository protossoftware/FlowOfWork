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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Role'", "';'", "'WorkProductType'", "'WorkProduct'", "':'", "'GuidanceType'", "'Guidance'", "'Activity'", "'responsible'", "'inputs'", "','", "'outputs'", "'subActivities'", "'guidances'", "'summary'", "'label'", "'description'"
    };
    public static final int RULE_ID=4;
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
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
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


    // $ANTLR start "entryRuleTextfield"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:314:1: entryRuleTextfield : ruleTextfield EOF ;
    public final void entryRuleTextfield() throws RecognitionException {
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:315:1: ( ruleTextfield EOF )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:316:1: ruleTextfield EOF
            {
             before(grammarAccess.getTextfieldRule()); 
            pushFollow(FOLLOW_ruleTextfield_in_entryRuleTextfield604);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getTextfieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfield611); 

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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:323:1: ruleTextfield : ( ( rule__Textfield__Group__0 ) ) ;
    public final void ruleTextfield() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:327:2: ( ( ( rule__Textfield__Group__0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:328:1: ( ( rule__Textfield__Group__0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:328:1: ( ( rule__Textfield__Group__0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:329:1: ( rule__Textfield__Group__0 )
            {
             before(grammarAccess.getTextfieldAccess().getGroup()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:330:1: ( rule__Textfield__Group__0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:330:2: rule__Textfield__Group__0
            {
            pushFollow(FOLLOW_rule__Textfield__Group__0_in_ruleTextfield637);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:342:1: rule__Model__Alternatives : ( ( ( rule__Model__ActivitiesAssignment_0 ) ) | ( ( rule__Model__RolesAssignment_1 ) ) | ( ( rule__Model__WorkProductsAssignment_2 ) ) | ( ( rule__Model__WorkProductTypesAssignment_3 ) ) | ( ( rule__Model__GuidancesAssignment_4 ) ) | ( ( rule__Model__GuidanceTypesAssignment_5 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:346:1: ( ( ( rule__Model__ActivitiesAssignment_0 ) ) | ( ( rule__Model__RolesAssignment_1 ) ) | ( ( rule__Model__WorkProductsAssignment_2 ) ) | ( ( rule__Model__WorkProductTypesAssignment_3 ) ) | ( ( rule__Model__GuidancesAssignment_4 ) ) | ( ( rule__Model__GuidanceTypesAssignment_5 ) ) )
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
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:347:1: ( ( rule__Model__ActivitiesAssignment_0 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:347:1: ( ( rule__Model__ActivitiesAssignment_0 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:348:1: ( rule__Model__ActivitiesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getActivitiesAssignment_0()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:349:1: ( rule__Model__ActivitiesAssignment_0 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:349:2: rule__Model__ActivitiesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__ActivitiesAssignment_0_in_rule__Model__Alternatives673);
                    rule__Model__ActivitiesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getActivitiesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:353:6: ( ( rule__Model__RolesAssignment_1 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:353:6: ( ( rule__Model__RolesAssignment_1 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:354:1: ( rule__Model__RolesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getRolesAssignment_1()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:355:1: ( rule__Model__RolesAssignment_1 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:355:2: rule__Model__RolesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__RolesAssignment_1_in_rule__Model__Alternatives691);
                    rule__Model__RolesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getRolesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:359:6: ( ( rule__Model__WorkProductsAssignment_2 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:359:6: ( ( rule__Model__WorkProductsAssignment_2 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:360:1: ( rule__Model__WorkProductsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getWorkProductsAssignment_2()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:361:1: ( rule__Model__WorkProductsAssignment_2 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:361:2: rule__Model__WorkProductsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__WorkProductsAssignment_2_in_rule__Model__Alternatives709);
                    rule__Model__WorkProductsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getWorkProductsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:365:6: ( ( rule__Model__WorkProductTypesAssignment_3 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:365:6: ( ( rule__Model__WorkProductTypesAssignment_3 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:366:1: ( rule__Model__WorkProductTypesAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getWorkProductTypesAssignment_3()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:367:1: ( rule__Model__WorkProductTypesAssignment_3 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:367:2: rule__Model__WorkProductTypesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__WorkProductTypesAssignment_3_in_rule__Model__Alternatives727);
                    rule__Model__WorkProductTypesAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getWorkProductTypesAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:371:6: ( ( rule__Model__GuidancesAssignment_4 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:371:6: ( ( rule__Model__GuidancesAssignment_4 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:372:1: ( rule__Model__GuidancesAssignment_4 )
                    {
                     before(grammarAccess.getModelAccess().getGuidancesAssignment_4()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:373:1: ( rule__Model__GuidancesAssignment_4 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:373:2: rule__Model__GuidancesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__GuidancesAssignment_4_in_rule__Model__Alternatives745);
                    rule__Model__GuidancesAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGuidancesAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:377:6: ( ( rule__Model__GuidanceTypesAssignment_5 ) )
                    {
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:377:6: ( ( rule__Model__GuidanceTypesAssignment_5 ) )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:378:1: ( rule__Model__GuidanceTypesAssignment_5 )
                    {
                     before(grammarAccess.getModelAccess().getGuidanceTypesAssignment_5()); 
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:379:1: ( rule__Model__GuidanceTypesAssignment_5 )
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:379:2: rule__Model__GuidanceTypesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Model__GuidanceTypesAssignment_5_in_rule__Model__Alternatives763);
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


    // $ANTLR start "rule__Role__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:391:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:395:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:396:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__0795);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__0798);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:403:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:407:1: ( ( 'Role' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:408:1: ( 'Role' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:408:1: ( 'Role' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:409:1: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Role__Group__0__Impl826); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:422:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:426:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:427:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__1857);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__1860);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:434:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:438:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:439:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:439:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:440:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:441:1: ( rule__Role__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:441:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl887);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:451:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:455:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:456:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__2917);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__2920);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:463:1: rule__Role__Group__2__Impl : ( ( rule__Role__TextfieldAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:467:1: ( ( ( rule__Role__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:468:1: ( ( rule__Role__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:468:1: ( ( rule__Role__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:469:1: ( rule__Role__TextfieldAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:470:1: ( rule__Role__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:470:2: rule__Role__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__Role__TextfieldAssignment_2_in_rule__Role__Group__2__Impl947);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:480:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:484:1: ( rule__Role__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:485:2: rule__Role__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__3977);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:491:1: rule__Role__Group__3__Impl : ( ';' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:495:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:496:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:496:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:497:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Role__Group__3__Impl1005); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:518:1: rule__WorkProductType__Group__0 : rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1 ;
    public final void rule__WorkProductType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:522:1: ( rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:523:2: rule__WorkProductType__Group__0__Impl rule__WorkProductType__Group__1
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__0__Impl_in_rule__WorkProductType__Group__01044);
            rule__WorkProductType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__1_in_rule__WorkProductType__Group__01047);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:530:1: rule__WorkProductType__Group__0__Impl : ( 'WorkProductType' ) ;
    public final void rule__WorkProductType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:534:1: ( ( 'WorkProductType' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:535:1: ( 'WorkProductType' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:535:1: ( 'WorkProductType' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:536:1: 'WorkProductType'
            {
             before(grammarAccess.getWorkProductTypeAccess().getWorkProductTypeKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__WorkProductType__Group__0__Impl1075); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:549:1: rule__WorkProductType__Group__1 : rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2 ;
    public final void rule__WorkProductType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:553:1: ( rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:554:2: rule__WorkProductType__Group__1__Impl rule__WorkProductType__Group__2
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__1__Impl_in_rule__WorkProductType__Group__11106);
            rule__WorkProductType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__2_in_rule__WorkProductType__Group__11109);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:561:1: rule__WorkProductType__Group__1__Impl : ( ( rule__WorkProductType__NameAssignment_1 ) ) ;
    public final void rule__WorkProductType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:565:1: ( ( ( rule__WorkProductType__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:566:1: ( ( rule__WorkProductType__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:566:1: ( ( rule__WorkProductType__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:567:1: ( rule__WorkProductType__NameAssignment_1 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:568:1: ( rule__WorkProductType__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:568:2: rule__WorkProductType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkProductType__NameAssignment_1_in_rule__WorkProductType__Group__1__Impl1136);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:578:1: rule__WorkProductType__Group__2 : rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3 ;
    public final void rule__WorkProductType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:582:1: ( rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:583:2: rule__WorkProductType__Group__2__Impl rule__WorkProductType__Group__3
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__2__Impl_in_rule__WorkProductType__Group__21166);
            rule__WorkProductType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProductType__Group__3_in_rule__WorkProductType__Group__21169);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:590:1: rule__WorkProductType__Group__2__Impl : ( ( rule__WorkProductType__TextfieldAssignment_2 ) ) ;
    public final void rule__WorkProductType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:594:1: ( ( ( rule__WorkProductType__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:595:1: ( ( rule__WorkProductType__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:595:1: ( ( rule__WorkProductType__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:596:1: ( rule__WorkProductType__TextfieldAssignment_2 )
            {
             before(grammarAccess.getWorkProductTypeAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:597:1: ( rule__WorkProductType__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:597:2: rule__WorkProductType__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__WorkProductType__TextfieldAssignment_2_in_rule__WorkProductType__Group__2__Impl1196);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:607:1: rule__WorkProductType__Group__3 : rule__WorkProductType__Group__3__Impl ;
    public final void rule__WorkProductType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:611:1: ( rule__WorkProductType__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:612:2: rule__WorkProductType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WorkProductType__Group__3__Impl_in_rule__WorkProductType__Group__31226);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:618:1: rule__WorkProductType__Group__3__Impl : ( ';' ) ;
    public final void rule__WorkProductType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:622:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:623:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:623:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:624:1: ';'
            {
             before(grammarAccess.getWorkProductTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__WorkProductType__Group__3__Impl1254); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:645:1: rule__WorkProduct__Group__0 : rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1 ;
    public final void rule__WorkProduct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:649:1: ( rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:650:2: rule__WorkProduct__Group__0__Impl rule__WorkProduct__Group__1
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__0__Impl_in_rule__WorkProduct__Group__01293);
            rule__WorkProduct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__1_in_rule__WorkProduct__Group__01296);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:657:1: rule__WorkProduct__Group__0__Impl : ( 'WorkProduct' ) ;
    public final void rule__WorkProduct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:661:1: ( ( 'WorkProduct' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:662:1: ( 'WorkProduct' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:662:1: ( 'WorkProduct' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:663:1: 'WorkProduct'
            {
             before(grammarAccess.getWorkProductAccess().getWorkProductKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__WorkProduct__Group__0__Impl1324); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:676:1: rule__WorkProduct__Group__1 : rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2 ;
    public final void rule__WorkProduct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:680:1: ( rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:681:2: rule__WorkProduct__Group__1__Impl rule__WorkProduct__Group__2
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__1__Impl_in_rule__WorkProduct__Group__11355);
            rule__WorkProduct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__2_in_rule__WorkProduct__Group__11358);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:688:1: rule__WorkProduct__Group__1__Impl : ( ( rule__WorkProduct__NameAssignment_1 ) ) ;
    public final void rule__WorkProduct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:692:1: ( ( ( rule__WorkProduct__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:693:1: ( ( rule__WorkProduct__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:693:1: ( ( rule__WorkProduct__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:694:1: ( rule__WorkProduct__NameAssignment_1 )
            {
             before(grammarAccess.getWorkProductAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:695:1: ( rule__WorkProduct__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:695:2: rule__WorkProduct__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkProduct__NameAssignment_1_in_rule__WorkProduct__Group__1__Impl1385);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:705:1: rule__WorkProduct__Group__2 : rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3 ;
    public final void rule__WorkProduct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:709:1: ( rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:710:2: rule__WorkProduct__Group__2__Impl rule__WorkProduct__Group__3
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__2__Impl_in_rule__WorkProduct__Group__21415);
            rule__WorkProduct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__3_in_rule__WorkProduct__Group__21418);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:717:1: rule__WorkProduct__Group__2__Impl : ( ':' ) ;
    public final void rule__WorkProduct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:721:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:722:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:722:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:723:1: ':'
            {
             before(grammarAccess.getWorkProductAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__WorkProduct__Group__2__Impl1446); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:736:1: rule__WorkProduct__Group__3 : rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4 ;
    public final void rule__WorkProduct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:740:1: ( rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:741:2: rule__WorkProduct__Group__3__Impl rule__WorkProduct__Group__4
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__3__Impl_in_rule__WorkProduct__Group__31477);
            rule__WorkProduct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__4_in_rule__WorkProduct__Group__31480);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:748:1: rule__WorkProduct__Group__3__Impl : ( ( rule__WorkProduct__TypeAssignment_3 ) ) ;
    public final void rule__WorkProduct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:752:1: ( ( ( rule__WorkProduct__TypeAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:753:1: ( ( rule__WorkProduct__TypeAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:753:1: ( ( rule__WorkProduct__TypeAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:754:1: ( rule__WorkProduct__TypeAssignment_3 )
            {
             before(grammarAccess.getWorkProductAccess().getTypeAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:755:1: ( rule__WorkProduct__TypeAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:755:2: rule__WorkProduct__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__WorkProduct__TypeAssignment_3_in_rule__WorkProduct__Group__3__Impl1507);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:765:1: rule__WorkProduct__Group__4 : rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5 ;
    public final void rule__WorkProduct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:769:1: ( rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:770:2: rule__WorkProduct__Group__4__Impl rule__WorkProduct__Group__5
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__4__Impl_in_rule__WorkProduct__Group__41537);
            rule__WorkProduct__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkProduct__Group__5_in_rule__WorkProduct__Group__41540);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:777:1: rule__WorkProduct__Group__4__Impl : ( ( rule__WorkProduct__TextfieldAssignment_4 ) ) ;
    public final void rule__WorkProduct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:781:1: ( ( ( rule__WorkProduct__TextfieldAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:782:1: ( ( rule__WorkProduct__TextfieldAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:782:1: ( ( rule__WorkProduct__TextfieldAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:783:1: ( rule__WorkProduct__TextfieldAssignment_4 )
            {
             before(grammarAccess.getWorkProductAccess().getTextfieldAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:784:1: ( rule__WorkProduct__TextfieldAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:784:2: rule__WorkProduct__TextfieldAssignment_4
            {
            pushFollow(FOLLOW_rule__WorkProduct__TextfieldAssignment_4_in_rule__WorkProduct__Group__4__Impl1567);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:794:1: rule__WorkProduct__Group__5 : rule__WorkProduct__Group__5__Impl ;
    public final void rule__WorkProduct__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:798:1: ( rule__WorkProduct__Group__5__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:799:2: rule__WorkProduct__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WorkProduct__Group__5__Impl_in_rule__WorkProduct__Group__51597);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:805:1: rule__WorkProduct__Group__5__Impl : ( ';' ) ;
    public final void rule__WorkProduct__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:809:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:810:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:810:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:811:1: ';'
            {
             before(grammarAccess.getWorkProductAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__WorkProduct__Group__5__Impl1625); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:836:1: rule__GuidanceType__Group__0 : rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1 ;
    public final void rule__GuidanceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:840:1: ( rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:841:2: rule__GuidanceType__Group__0__Impl rule__GuidanceType__Group__1
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__0__Impl_in_rule__GuidanceType__Group__01668);
            rule__GuidanceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__1_in_rule__GuidanceType__Group__01671);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:848:1: rule__GuidanceType__Group__0__Impl : ( 'GuidanceType' ) ;
    public final void rule__GuidanceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:852:1: ( ( 'GuidanceType' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:853:1: ( 'GuidanceType' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:853:1: ( 'GuidanceType' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:854:1: 'GuidanceType'
            {
             before(grammarAccess.getGuidanceTypeAccess().getGuidanceTypeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__GuidanceType__Group__0__Impl1699); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:867:1: rule__GuidanceType__Group__1 : rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2 ;
    public final void rule__GuidanceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:871:1: ( rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:872:2: rule__GuidanceType__Group__1__Impl rule__GuidanceType__Group__2
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__1__Impl_in_rule__GuidanceType__Group__11730);
            rule__GuidanceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__2_in_rule__GuidanceType__Group__11733);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:879:1: rule__GuidanceType__Group__1__Impl : ( ( rule__GuidanceType__NameAssignment_1 ) ) ;
    public final void rule__GuidanceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:883:1: ( ( ( rule__GuidanceType__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:884:1: ( ( rule__GuidanceType__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:884:1: ( ( rule__GuidanceType__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:885:1: ( rule__GuidanceType__NameAssignment_1 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:886:1: ( rule__GuidanceType__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:886:2: rule__GuidanceType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GuidanceType__NameAssignment_1_in_rule__GuidanceType__Group__1__Impl1760);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:896:1: rule__GuidanceType__Group__2 : rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3 ;
    public final void rule__GuidanceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:900:1: ( rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:901:2: rule__GuidanceType__Group__2__Impl rule__GuidanceType__Group__3
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__2__Impl_in_rule__GuidanceType__Group__21790);
            rule__GuidanceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuidanceType__Group__3_in_rule__GuidanceType__Group__21793);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:908:1: rule__GuidanceType__Group__2__Impl : ( ( rule__GuidanceType__TextfieldAssignment_2 ) ) ;
    public final void rule__GuidanceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:912:1: ( ( ( rule__GuidanceType__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:913:1: ( ( rule__GuidanceType__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:913:1: ( ( rule__GuidanceType__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:914:1: ( rule__GuidanceType__TextfieldAssignment_2 )
            {
             before(grammarAccess.getGuidanceTypeAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:915:1: ( rule__GuidanceType__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:915:2: rule__GuidanceType__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__GuidanceType__TextfieldAssignment_2_in_rule__GuidanceType__Group__2__Impl1820);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:925:1: rule__GuidanceType__Group__3 : rule__GuidanceType__Group__3__Impl ;
    public final void rule__GuidanceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:929:1: ( rule__GuidanceType__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:930:2: rule__GuidanceType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GuidanceType__Group__3__Impl_in_rule__GuidanceType__Group__31850);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:936:1: rule__GuidanceType__Group__3__Impl : ( ';' ) ;
    public final void rule__GuidanceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:940:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:941:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:941:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:942:1: ';'
            {
             before(grammarAccess.getGuidanceTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__GuidanceType__Group__3__Impl1878); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:963:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:967:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:968:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__01917);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__01920);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:975:1: rule__Guidance__Group__0__Impl : ( 'Guidance' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:979:1: ( ( 'Guidance' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:980:1: ( 'Guidance' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:980:1: ( 'Guidance' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:981:1: 'Guidance'
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Guidance__Group__0__Impl1948); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:994:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:998:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:999:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__11979);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__11982);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1006:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__NameAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1010:1: ( ( ( rule__Guidance__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1011:1: ( ( rule__Guidance__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1011:1: ( ( rule__Guidance__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1012:1: ( rule__Guidance__NameAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1013:1: ( rule__Guidance__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1013:2: rule__Guidance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Guidance__NameAssignment_1_in_rule__Guidance__Group__1__Impl2009);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1023:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1027:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1028:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__22039);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__3_in_rule__Guidance__Group__22042);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1035:1: rule__Guidance__Group__2__Impl : ( ':' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1039:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1040:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1040:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1041:1: ':'
            {
             before(grammarAccess.getGuidanceAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Guidance__Group__2__Impl2070); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1054:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1058:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1059:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_rule__Guidance__Group__3__Impl_in_rule__Guidance__Group__32101);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__4_in_rule__Guidance__Group__32104);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1066:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__TypeAssignment_3 ) ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1070:1: ( ( ( rule__Guidance__TypeAssignment_3 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1071:1: ( ( rule__Guidance__TypeAssignment_3 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1071:1: ( ( rule__Guidance__TypeAssignment_3 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1072:1: ( rule__Guidance__TypeAssignment_3 )
            {
             before(grammarAccess.getGuidanceAccess().getTypeAssignment_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1073:1: ( rule__Guidance__TypeAssignment_3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1073:2: rule__Guidance__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Guidance__TypeAssignment_3_in_rule__Guidance__Group__3__Impl2131);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1083:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl rule__Guidance__Group__5 ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1087:1: ( rule__Guidance__Group__4__Impl rule__Guidance__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1088:2: rule__Guidance__Group__4__Impl rule__Guidance__Group__5
            {
            pushFollow(FOLLOW_rule__Guidance__Group__4__Impl_in_rule__Guidance__Group__42161);
            rule__Guidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guidance__Group__5_in_rule__Guidance__Group__42164);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1095:1: rule__Guidance__Group__4__Impl : ( ( rule__Guidance__TextfieldAssignment_4 ) ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1099:1: ( ( ( rule__Guidance__TextfieldAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1100:1: ( ( rule__Guidance__TextfieldAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1100:1: ( ( rule__Guidance__TextfieldAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1101:1: ( rule__Guidance__TextfieldAssignment_4 )
            {
             before(grammarAccess.getGuidanceAccess().getTextfieldAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1102:1: ( rule__Guidance__TextfieldAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1102:2: rule__Guidance__TextfieldAssignment_4
            {
            pushFollow(FOLLOW_rule__Guidance__TextfieldAssignment_4_in_rule__Guidance__Group__4__Impl2191);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1112:1: rule__Guidance__Group__5 : rule__Guidance__Group__5__Impl ;
    public final void rule__Guidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1116:1: ( rule__Guidance__Group__5__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1117:2: rule__Guidance__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Guidance__Group__5__Impl_in_rule__Guidance__Group__52221);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1123:1: rule__Guidance__Group__5__Impl : ( ';' ) ;
    public final void rule__Guidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1127:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1128:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1128:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1129:1: ';'
            {
             before(grammarAccess.getGuidanceAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__Guidance__Group__5__Impl2249); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1154:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1158:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1159:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02292);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02295);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1166:1: rule__Port__Group__0__Impl : ( ( rule__Port__NameAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1170:1: ( ( ( rule__Port__NameAssignment_0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1171:1: ( ( rule__Port__NameAssignment_0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1171:1: ( ( rule__Port__NameAssignment_0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1172:1: ( rule__Port__NameAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1173:1: ( rule__Port__NameAssignment_0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1173:2: rule__Port__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_0_in_rule__Port__Group__0__Impl2322);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1183:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1187:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1188:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12352);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__2_in_rule__Port__Group__12355);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1195:1: rule__Port__Group__1__Impl : ( ':' ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1199:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1200:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1200:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1201:1: ':'
            {
             before(grammarAccess.getPortAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Port__Group__1__Impl2383); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1214:1: rule__Port__Group__2 : rule__Port__Group__2__Impl ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1218:1: ( rule__Port__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1219:2: rule__Port__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__22414);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1225:1: rule__Port__Group__2__Impl : ( ( rule__Port__TypeAssignment_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1229:1: ( ( ( rule__Port__TypeAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1230:1: ( ( rule__Port__TypeAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1230:1: ( ( rule__Port__TypeAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1231:1: ( rule__Port__TypeAssignment_2 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1232:1: ( rule__Port__TypeAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1232:2: rule__Port__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Port__TypeAssignment_2_in_rule__Port__Group__2__Impl2441);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1248:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1252:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1253:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02477);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02480);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1260:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1264:1: ( ( 'Activity' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1265:1: ( 'Activity' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1265:1: ( 'Activity' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1266:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Activity__Group__0__Impl2508); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1279:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1283:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1284:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12539);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12542);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1291:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1295:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1296:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1296:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1297:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1298:1: ( rule__Activity__NameAssignment_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1298:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2569);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1308:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1312:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1313:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22599);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__22602);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1320:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__TextfieldAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1324:1: ( ( ( rule__Activity__TextfieldAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1325:1: ( ( rule__Activity__TextfieldAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1325:1: ( ( rule__Activity__TextfieldAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1326:1: ( rule__Activity__TextfieldAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getTextfieldAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1327:1: ( rule__Activity__TextfieldAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1327:2: rule__Activity__TextfieldAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__TextfieldAssignment_2_in_rule__Activity__Group__2__Impl2629);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1337:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1341:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1342:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__32659);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__32662);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1349:1: rule__Activity__Group__3__Impl : ( 'responsible' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1353:1: ( ( 'responsible' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1354:1: ( 'responsible' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1354:1: ( 'responsible' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1355:1: 'responsible'
            {
             before(grammarAccess.getActivityAccess().getResponsibleKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Activity__Group__3__Impl2690); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1368:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1372:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1373:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42721);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__42724);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1380:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__RoleAssignment_4 ) ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1384:1: ( ( ( rule__Activity__RoleAssignment_4 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1385:1: ( ( rule__Activity__RoleAssignment_4 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1385:1: ( ( rule__Activity__RoleAssignment_4 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1386:1: ( rule__Activity__RoleAssignment_4 )
            {
             before(grammarAccess.getActivityAccess().getRoleAssignment_4()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1387:1: ( rule__Activity__RoleAssignment_4 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1387:2: rule__Activity__RoleAssignment_4
            {
            pushFollow(FOLLOW_rule__Activity__RoleAssignment_4_in_rule__Activity__Group__4__Impl2751);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1397:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1401:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1402:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__52781);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__52784);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1409:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1413:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1414:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1414:1: ( ( rule__Activity__Group_5__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1415:1: ( rule__Activity__Group_5__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_5()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1416:1: ( rule__Activity__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1416:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl2811);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1426:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1430:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1431:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__62842);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__62845);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1438:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__Group_6__0 )? ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1442:1: ( ( ( rule__Activity__Group_6__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1443:1: ( ( rule__Activity__Group_6__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1443:1: ( ( rule__Activity__Group_6__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1444:1: ( rule__Activity__Group_6__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_6()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1445:1: ( rule__Activity__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1445:2: rule__Activity__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl2872);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1455:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1459:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1460:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__72903);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__72906);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1467:1: rule__Activity__Group__7__Impl : ( ( rule__Activity__Group_7__0 )? ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1471:1: ( ( ( rule__Activity__Group_7__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1472:1: ( ( rule__Activity__Group_7__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1472:1: ( ( rule__Activity__Group_7__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1473:1: ( rule__Activity__Group_7__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_7()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1474:1: ( rule__Activity__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1474:2: rule__Activity__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl2933);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1484:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1488:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1489:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__82964);
            rule__Activity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__82967);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1496:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__Group_8__0 )? ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1500:1: ( ( ( rule__Activity__Group_8__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1501:1: ( ( rule__Activity__Group_8__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1501:1: ( ( rule__Activity__Group_8__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1502:1: ( rule__Activity__Group_8__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_8()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1503:1: ( rule__Activity__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1503:2: rule__Activity__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl2994);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1513:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1517:1: ( rule__Activity__Group__9__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1518:2: rule__Activity__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__93025);
            rule__Activity__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1524:1: rule__Activity__Group__9__Impl : ( ';' ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1528:1: ( ( ';' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1529:1: ( ';' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1529:1: ( ';' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1530:1: ';'
            {
             before(grammarAccess.getActivityAccess().getSemicolonKeyword_9()); 
            match(input,12,FOLLOW_12_in_rule__Activity__Group__9__Impl3053); 
             after(grammarAccess.getActivityAccess().getSemicolonKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Activity__Group_5__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1563:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1567:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1568:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__03104);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__03107);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1575:1: rule__Activity__Group_5__0__Impl : ( 'inputs' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1579:1: ( ( 'inputs' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1580:1: ( 'inputs' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1580:1: ( 'inputs' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1581:1: 'inputs'
            {
             before(grammarAccess.getActivityAccess().getInputsKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Activity__Group_5__0__Impl3135); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1594:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1598:1: ( rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1599:2: rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__13166);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__13169);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1606:1: rule__Activity__Group_5__1__Impl : ( ( rule__Activity__InPortsAssignment_5_1 ) ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1610:1: ( ( ( rule__Activity__InPortsAssignment_5_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1611:1: ( ( rule__Activity__InPortsAssignment_5_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1611:1: ( ( rule__Activity__InPortsAssignment_5_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1612:1: ( rule__Activity__InPortsAssignment_5_1 )
            {
             before(grammarAccess.getActivityAccess().getInPortsAssignment_5_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1613:1: ( rule__Activity__InPortsAssignment_5_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1613:2: rule__Activity__InPortsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Activity__InPortsAssignment_5_1_in_rule__Activity__Group_5__1__Impl3196);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1623:1: rule__Activity__Group_5__2 : rule__Activity__Group_5__2__Impl ;
    public final void rule__Activity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1627:1: ( rule__Activity__Group_5__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1628:2: rule__Activity__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__23226);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1634:1: rule__Activity__Group_5__2__Impl : ( ( rule__Activity__Group_5_2__0 )* ) ;
    public final void rule__Activity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1638:1: ( ( ( rule__Activity__Group_5_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1639:1: ( ( rule__Activity__Group_5_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1639:1: ( ( rule__Activity__Group_5_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1640:1: ( rule__Activity__Group_5_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_5_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1641:1: ( rule__Activity__Group_5_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1641:2: rule__Activity__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__Group_5__2__Impl3253);
            	    rule__Activity__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1657:1: rule__Activity__Group_5_2__0 : rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 ;
    public final void rule__Activity__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1661:1: ( rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1662:2: rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__03290);
            rule__Activity__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__03293);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1669:1: rule__Activity__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1673:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1674:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1674:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1675:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_5_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group_5_2__0__Impl3321); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1688:1: rule__Activity__Group_5_2__1 : rule__Activity__Group_5_2__1__Impl ;
    public final void rule__Activity__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1692:1: ( rule__Activity__Group_5_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1693:2: rule__Activity__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__13352);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1699:1: rule__Activity__Group_5_2__1__Impl : ( ( rule__Activity__InPortsAssignment_5_2_1 ) ) ;
    public final void rule__Activity__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1703:1: ( ( ( rule__Activity__InPortsAssignment_5_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1704:1: ( ( rule__Activity__InPortsAssignment_5_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1704:1: ( ( rule__Activity__InPortsAssignment_5_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1705:1: ( rule__Activity__InPortsAssignment_5_2_1 )
            {
             before(grammarAccess.getActivityAccess().getInPortsAssignment_5_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1706:1: ( rule__Activity__InPortsAssignment_5_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1706:2: rule__Activity__InPortsAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Activity__InPortsAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl3379);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1720:1: rule__Activity__Group_6__0 : rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 ;
    public final void rule__Activity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1724:1: ( rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1725:2: rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__03413);
            rule__Activity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__03416);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1732:1: rule__Activity__Group_6__0__Impl : ( 'outputs' ) ;
    public final void rule__Activity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1736:1: ( ( 'outputs' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1737:1: ( 'outputs' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1737:1: ( 'outputs' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1738:1: 'outputs'
            {
             before(grammarAccess.getActivityAccess().getOutputsKeyword_6_0()); 
            match(input,22,FOLLOW_22_in_rule__Activity__Group_6__0__Impl3444); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1751:1: rule__Activity__Group_6__1 : rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 ;
    public final void rule__Activity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1755:1: ( rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1756:2: rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__13475);
            rule__Activity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__13478);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1763:1: rule__Activity__Group_6__1__Impl : ( ( rule__Activity__OutPortsAssignment_6_1 ) ) ;
    public final void rule__Activity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1767:1: ( ( ( rule__Activity__OutPortsAssignment_6_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1768:1: ( ( rule__Activity__OutPortsAssignment_6_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1768:1: ( ( rule__Activity__OutPortsAssignment_6_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1769:1: ( rule__Activity__OutPortsAssignment_6_1 )
            {
             before(grammarAccess.getActivityAccess().getOutPortsAssignment_6_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1770:1: ( rule__Activity__OutPortsAssignment_6_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1770:2: rule__Activity__OutPortsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Activity__OutPortsAssignment_6_1_in_rule__Activity__Group_6__1__Impl3505);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1780:1: rule__Activity__Group_6__2 : rule__Activity__Group_6__2__Impl ;
    public final void rule__Activity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1784:1: ( rule__Activity__Group_6__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1785:2: rule__Activity__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__23535);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1791:1: rule__Activity__Group_6__2__Impl : ( ( rule__Activity__Group_6_2__0 )* ) ;
    public final void rule__Activity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1795:1: ( ( ( rule__Activity__Group_6_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1796:1: ( ( rule__Activity__Group_6_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1796:1: ( ( rule__Activity__Group_6_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1797:1: ( rule__Activity__Group_6_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_6_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1798:1: ( rule__Activity__Group_6_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1798:2: rule__Activity__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__Group_6__2__Impl3562);
            	    rule__Activity__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1814:1: rule__Activity__Group_6_2__0 : rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 ;
    public final void rule__Activity__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1818:1: ( rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1819:2: rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__03599);
            rule__Activity__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__03602);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1826:1: rule__Activity__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1830:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1831:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1831:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1832:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_6_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group_6_2__0__Impl3630); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1845:1: rule__Activity__Group_6_2__1 : rule__Activity__Group_6_2__1__Impl ;
    public final void rule__Activity__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1849:1: ( rule__Activity__Group_6_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1850:2: rule__Activity__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__13661);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1856:1: rule__Activity__Group_6_2__1__Impl : ( ( rule__Activity__OutPortsAssignment_6_2_1 ) ) ;
    public final void rule__Activity__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1860:1: ( ( ( rule__Activity__OutPortsAssignment_6_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1861:1: ( ( rule__Activity__OutPortsAssignment_6_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1861:1: ( ( rule__Activity__OutPortsAssignment_6_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1862:1: ( rule__Activity__OutPortsAssignment_6_2_1 )
            {
             before(grammarAccess.getActivityAccess().getOutPortsAssignment_6_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1863:1: ( rule__Activity__OutPortsAssignment_6_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1863:2: rule__Activity__OutPortsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Activity__OutPortsAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl3688);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1877:1: rule__Activity__Group_7__0 : rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 ;
    public final void rule__Activity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1881:1: ( rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1882:2: rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__03722);
            rule__Activity__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__03725);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1889:1: rule__Activity__Group_7__0__Impl : ( 'subActivities' ) ;
    public final void rule__Activity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1893:1: ( ( 'subActivities' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1894:1: ( 'subActivities' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1894:1: ( 'subActivities' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1895:1: 'subActivities'
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesKeyword_7_0()); 
            match(input,23,FOLLOW_23_in_rule__Activity__Group_7__0__Impl3753); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1908:1: rule__Activity__Group_7__1 : rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2 ;
    public final void rule__Activity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1912:1: ( rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1913:2: rule__Activity__Group_7__1__Impl rule__Activity__Group_7__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__13784);
            rule__Activity__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7__2_in_rule__Activity__Group_7__13787);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1920:1: rule__Activity__Group_7__1__Impl : ( ( rule__Activity__SubActivitiesAssignment_7_1 ) ) ;
    public final void rule__Activity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1924:1: ( ( ( rule__Activity__SubActivitiesAssignment_7_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1925:1: ( ( rule__Activity__SubActivitiesAssignment_7_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1925:1: ( ( rule__Activity__SubActivitiesAssignment_7_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1926:1: ( rule__Activity__SubActivitiesAssignment_7_1 )
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1927:1: ( rule__Activity__SubActivitiesAssignment_7_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1927:2: rule__Activity__SubActivitiesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Activity__SubActivitiesAssignment_7_1_in_rule__Activity__Group_7__1__Impl3814);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1937:1: rule__Activity__Group_7__2 : rule__Activity__Group_7__2__Impl ;
    public final void rule__Activity__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1941:1: ( rule__Activity__Group_7__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1942:2: rule__Activity__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7__2__Impl_in_rule__Activity__Group_7__23844);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1948:1: rule__Activity__Group_7__2__Impl : ( ( rule__Activity__Group_7_2__0 )* ) ;
    public final void rule__Activity__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1952:1: ( ( ( rule__Activity__Group_7_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1953:1: ( ( rule__Activity__Group_7_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1953:1: ( ( rule__Activity__Group_7_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1954:1: ( rule__Activity__Group_7_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_7_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1955:1: ( rule__Activity__Group_7_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1955:2: rule__Activity__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__Group_7__2__Impl3871);
            	    rule__Activity__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1971:1: rule__Activity__Group_7_2__0 : rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 ;
    public final void rule__Activity__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1975:1: ( rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1976:2: rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__03908);
            rule__Activity__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__03911);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1983:1: rule__Activity__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1987:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1988:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1988:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:1989:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_7_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group_7_2__0__Impl3939); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2002:1: rule__Activity__Group_7_2__1 : rule__Activity__Group_7_2__1__Impl ;
    public final void rule__Activity__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2006:1: ( rule__Activity__Group_7_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2007:2: rule__Activity__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__13970);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2013:1: rule__Activity__Group_7_2__1__Impl : ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) ) ;
    public final void rule__Activity__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2017:1: ( ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2018:1: ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2018:1: ( ( rule__Activity__SubActivitiesAssignment_7_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2019:1: ( rule__Activity__SubActivitiesAssignment_7_2_1 )
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesAssignment_7_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2020:1: ( rule__Activity__SubActivitiesAssignment_7_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2020:2: rule__Activity__SubActivitiesAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Activity__SubActivitiesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl3997);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2034:1: rule__Activity__Group_8__0 : rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 ;
    public final void rule__Activity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2038:1: ( rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2039:2: rule__Activity__Group_8__0__Impl rule__Activity__Group_8__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__04031);
            rule__Activity__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__04034);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2046:1: rule__Activity__Group_8__0__Impl : ( 'guidances' ) ;
    public final void rule__Activity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2050:1: ( ( 'guidances' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2051:1: ( 'guidances' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2051:1: ( 'guidances' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2052:1: 'guidances'
            {
             before(grammarAccess.getActivityAccess().getGuidancesKeyword_8_0()); 
            match(input,24,FOLLOW_24_in_rule__Activity__Group_8__0__Impl4062); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2065:1: rule__Activity__Group_8__1 : rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 ;
    public final void rule__Activity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2069:1: ( rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2070:2: rule__Activity__Group_8__1__Impl rule__Activity__Group_8__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__14093);
            rule__Activity__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__14096);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2077:1: rule__Activity__Group_8__1__Impl : ( ( rule__Activity__GuidancesAssignment_8_1 ) ) ;
    public final void rule__Activity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2081:1: ( ( ( rule__Activity__GuidancesAssignment_8_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2082:1: ( ( rule__Activity__GuidancesAssignment_8_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2082:1: ( ( rule__Activity__GuidancesAssignment_8_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2083:1: ( rule__Activity__GuidancesAssignment_8_1 )
            {
             before(grammarAccess.getActivityAccess().getGuidancesAssignment_8_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2084:1: ( rule__Activity__GuidancesAssignment_8_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2084:2: rule__Activity__GuidancesAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Activity__GuidancesAssignment_8_1_in_rule__Activity__Group_8__1__Impl4123);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2094:1: rule__Activity__Group_8__2 : rule__Activity__Group_8__2__Impl ;
    public final void rule__Activity__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2098:1: ( rule__Activity__Group_8__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2099:2: rule__Activity__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__24153);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2105:1: rule__Activity__Group_8__2__Impl : ( ( rule__Activity__Group_8_2__0 )* ) ;
    public final void rule__Activity__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2109:1: ( ( ( rule__Activity__Group_8_2__0 )* ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2110:1: ( ( rule__Activity__Group_8_2__0 )* )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2110:1: ( ( rule__Activity__Group_8_2__0 )* )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2111:1: ( rule__Activity__Group_8_2__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_8_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2112:1: ( rule__Activity__Group_8_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2112:2: rule__Activity__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_8_2__0_in_rule__Activity__Group_8__2__Impl4180);
            	    rule__Activity__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2128:1: rule__Activity__Group_8_2__0 : rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1 ;
    public final void rule__Activity__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2132:1: ( rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2133:2: rule__Activity__Group_8_2__0__Impl rule__Activity__Group_8_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_8_2__0__Impl_in_rule__Activity__Group_8_2__04217);
            rule__Activity__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_8_2__1_in_rule__Activity__Group_8_2__04220);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2140:1: rule__Activity__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2144:1: ( ( ',' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2145:1: ( ',' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2145:1: ( ',' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2146:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_8_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group_8_2__0__Impl4248); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2159:1: rule__Activity__Group_8_2__1 : rule__Activity__Group_8_2__1__Impl ;
    public final void rule__Activity__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2163:1: ( rule__Activity__Group_8_2__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2164:2: rule__Activity__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_8_2__1__Impl_in_rule__Activity__Group_8_2__14279);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2170:1: rule__Activity__Group_8_2__1__Impl : ( ( rule__Activity__GuidancesAssignment_8_2_1 ) ) ;
    public final void rule__Activity__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2174:1: ( ( ( rule__Activity__GuidancesAssignment_8_2_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2175:1: ( ( rule__Activity__GuidancesAssignment_8_2_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2175:1: ( ( rule__Activity__GuidancesAssignment_8_2_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2176:1: ( rule__Activity__GuidancesAssignment_8_2_1 )
            {
             before(grammarAccess.getActivityAccess().getGuidancesAssignment_8_2_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2177:1: ( rule__Activity__GuidancesAssignment_8_2_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2177:2: rule__Activity__GuidancesAssignment_8_2_1
            {
            pushFollow(FOLLOW_rule__Activity__GuidancesAssignment_8_2_1_in_rule__Activity__Group_8_2__1__Impl4306);
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


    // $ANTLR start "rule__ActivityRef__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2191:1: rule__ActivityRef__Group__0 : rule__ActivityRef__Group__0__Impl rule__ActivityRef__Group__1 ;
    public final void rule__ActivityRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2195:1: ( rule__ActivityRef__Group__0__Impl rule__ActivityRef__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2196:2: rule__ActivityRef__Group__0__Impl rule__ActivityRef__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityRef__Group__0__Impl_in_rule__ActivityRef__Group__04340);
            rule__ActivityRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityRef__Group__1_in_rule__ActivityRef__Group__04343);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2203:1: rule__ActivityRef__Group__0__Impl : ( ( rule__ActivityRef__NameAssignment_0 ) ) ;
    public final void rule__ActivityRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2207:1: ( ( ( rule__ActivityRef__NameAssignment_0 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2208:1: ( ( rule__ActivityRef__NameAssignment_0 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2208:1: ( ( rule__ActivityRef__NameAssignment_0 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2209:1: ( rule__ActivityRef__NameAssignment_0 )
            {
             before(grammarAccess.getActivityRefAccess().getNameAssignment_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2210:1: ( rule__ActivityRef__NameAssignment_0 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2210:2: rule__ActivityRef__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ActivityRef__NameAssignment_0_in_rule__ActivityRef__Group__0__Impl4370);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2220:1: rule__ActivityRef__Group__1 : rule__ActivityRef__Group__1__Impl rule__ActivityRef__Group__2 ;
    public final void rule__ActivityRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2224:1: ( rule__ActivityRef__Group__1__Impl rule__ActivityRef__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2225:2: rule__ActivityRef__Group__1__Impl rule__ActivityRef__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityRef__Group__1__Impl_in_rule__ActivityRef__Group__14400);
            rule__ActivityRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityRef__Group__2_in_rule__ActivityRef__Group__14403);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2232:1: rule__ActivityRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ActivityRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2236:1: ( ( ':' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2237:1: ( ':' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2237:1: ( ':' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2238:1: ':'
            {
             before(grammarAccess.getActivityRefAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__ActivityRef__Group__1__Impl4431); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2251:1: rule__ActivityRef__Group__2 : rule__ActivityRef__Group__2__Impl ;
    public final void rule__ActivityRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2255:1: ( rule__ActivityRef__Group__2__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2256:2: rule__ActivityRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityRef__Group__2__Impl_in_rule__ActivityRef__Group__24462);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2262:1: rule__ActivityRef__Group__2__Impl : ( ( rule__ActivityRef__TypeAssignment_2 ) ) ;
    public final void rule__ActivityRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2266:1: ( ( ( rule__ActivityRef__TypeAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2267:1: ( ( rule__ActivityRef__TypeAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2267:1: ( ( rule__ActivityRef__TypeAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2268:1: ( rule__ActivityRef__TypeAssignment_2 )
            {
             before(grammarAccess.getActivityRefAccess().getTypeAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2269:1: ( rule__ActivityRef__TypeAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2269:2: rule__ActivityRef__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityRef__TypeAssignment_2_in_rule__ActivityRef__Group__2__Impl4489);
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


    // $ANTLR start "rule__Textfield__Group__0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2285:1: rule__Textfield__Group__0 : rule__Textfield__Group__0__Impl rule__Textfield__Group__1 ;
    public final void rule__Textfield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2289:1: ( rule__Textfield__Group__0__Impl rule__Textfield__Group__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2290:2: rule__Textfield__Group__0__Impl rule__Textfield__Group__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group__0__Impl_in_rule__Textfield__Group__04525);
            rule__Textfield__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__1_in_rule__Textfield__Group__04528);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2297:1: rule__Textfield__Group__0__Impl : ( ( rule__Textfield__Group_0__0 )? ) ;
    public final void rule__Textfield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2301:1: ( ( ( rule__Textfield__Group_0__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2302:1: ( ( rule__Textfield__Group_0__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2302:1: ( ( rule__Textfield__Group_0__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2303:1: ( rule__Textfield__Group_0__0 )?
            {
             before(grammarAccess.getTextfieldAccess().getGroup_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2304:1: ( rule__Textfield__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2304:2: rule__Textfield__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Textfield__Group_0__0_in_rule__Textfield__Group__0__Impl4555);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2314:1: rule__Textfield__Group__1 : rule__Textfield__Group__1__Impl rule__Textfield__Group__2 ;
    public final void rule__Textfield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2318:1: ( rule__Textfield__Group__1__Impl rule__Textfield__Group__2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2319:2: rule__Textfield__Group__1__Impl rule__Textfield__Group__2
            {
            pushFollow(FOLLOW_rule__Textfield__Group__1__Impl_in_rule__Textfield__Group__14586);
            rule__Textfield__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__2_in_rule__Textfield__Group__14589);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2326:1: rule__Textfield__Group__1__Impl : ( 'summary' ) ;
    public final void rule__Textfield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2330:1: ( ( 'summary' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2331:1: ( 'summary' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2331:1: ( 'summary' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2332:1: 'summary'
            {
             before(grammarAccess.getTextfieldAccess().getSummaryKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Textfield__Group__1__Impl4617); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2345:1: rule__Textfield__Group__2 : rule__Textfield__Group__2__Impl rule__Textfield__Group__3 ;
    public final void rule__Textfield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2349:1: ( rule__Textfield__Group__2__Impl rule__Textfield__Group__3 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2350:2: rule__Textfield__Group__2__Impl rule__Textfield__Group__3
            {
            pushFollow(FOLLOW_rule__Textfield__Group__2__Impl_in_rule__Textfield__Group__24648);
            rule__Textfield__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group__3_in_rule__Textfield__Group__24651);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2357:1: rule__Textfield__Group__2__Impl : ( ( rule__Textfield__SummaryAssignment_2 ) ) ;
    public final void rule__Textfield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2361:1: ( ( ( rule__Textfield__SummaryAssignment_2 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2362:1: ( ( rule__Textfield__SummaryAssignment_2 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2362:1: ( ( rule__Textfield__SummaryAssignment_2 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2363:1: ( rule__Textfield__SummaryAssignment_2 )
            {
             before(grammarAccess.getTextfieldAccess().getSummaryAssignment_2()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2364:1: ( rule__Textfield__SummaryAssignment_2 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2364:2: rule__Textfield__SummaryAssignment_2
            {
            pushFollow(FOLLOW_rule__Textfield__SummaryAssignment_2_in_rule__Textfield__Group__2__Impl4678);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2374:1: rule__Textfield__Group__3 : rule__Textfield__Group__3__Impl ;
    public final void rule__Textfield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2378:1: ( rule__Textfield__Group__3__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2379:2: rule__Textfield__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group__3__Impl_in_rule__Textfield__Group__34708);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2385:1: rule__Textfield__Group__3__Impl : ( ( rule__Textfield__Group_3__0 )? ) ;
    public final void rule__Textfield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2389:1: ( ( ( rule__Textfield__Group_3__0 )? ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2390:1: ( ( rule__Textfield__Group_3__0 )? )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2390:1: ( ( rule__Textfield__Group_3__0 )? )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2391:1: ( rule__Textfield__Group_3__0 )?
            {
             before(grammarAccess.getTextfieldAccess().getGroup_3()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2392:1: ( rule__Textfield__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2392:2: rule__Textfield__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Textfield__Group_3__0_in_rule__Textfield__Group__3__Impl4735);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2410:1: rule__Textfield__Group_0__0 : rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1 ;
    public final void rule__Textfield__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2414:1: ( rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2415:2: rule__Textfield__Group_0__0__Impl rule__Textfield__Group_0__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group_0__0__Impl_in_rule__Textfield__Group_0__04774);
            rule__Textfield__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group_0__1_in_rule__Textfield__Group_0__04777);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2422:1: rule__Textfield__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__Textfield__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2426:1: ( ( 'label' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2427:1: ( 'label' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2427:1: ( 'label' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2428:1: 'label'
            {
             before(grammarAccess.getTextfieldAccess().getLabelKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Textfield__Group_0__0__Impl4805); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2441:1: rule__Textfield__Group_0__1 : rule__Textfield__Group_0__1__Impl ;
    public final void rule__Textfield__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2445:1: ( rule__Textfield__Group_0__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2446:2: rule__Textfield__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group_0__1__Impl_in_rule__Textfield__Group_0__14836);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2452:1: rule__Textfield__Group_0__1__Impl : ( ( rule__Textfield__LabelAssignment_0_1 ) ) ;
    public final void rule__Textfield__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2456:1: ( ( ( rule__Textfield__LabelAssignment_0_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2457:1: ( ( rule__Textfield__LabelAssignment_0_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2457:1: ( ( rule__Textfield__LabelAssignment_0_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2458:1: ( rule__Textfield__LabelAssignment_0_1 )
            {
             before(grammarAccess.getTextfieldAccess().getLabelAssignment_0_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2459:1: ( rule__Textfield__LabelAssignment_0_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2459:2: rule__Textfield__LabelAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Textfield__LabelAssignment_0_1_in_rule__Textfield__Group_0__1__Impl4863);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2473:1: rule__Textfield__Group_3__0 : rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1 ;
    public final void rule__Textfield__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2477:1: ( rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2478:2: rule__Textfield__Group_3__0__Impl rule__Textfield__Group_3__1
            {
            pushFollow(FOLLOW_rule__Textfield__Group_3__0__Impl_in_rule__Textfield__Group_3__04897);
            rule__Textfield__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Textfield__Group_3__1_in_rule__Textfield__Group_3__04900);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2485:1: rule__Textfield__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Textfield__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2489:1: ( ( 'description' ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2490:1: ( 'description' )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2490:1: ( 'description' )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2491:1: 'description'
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__Textfield__Group_3__0__Impl4928); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2504:1: rule__Textfield__Group_3__1 : rule__Textfield__Group_3__1__Impl ;
    public final void rule__Textfield__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2508:1: ( rule__Textfield__Group_3__1__Impl )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2509:2: rule__Textfield__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Textfield__Group_3__1__Impl_in_rule__Textfield__Group_3__14959);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2515:1: rule__Textfield__Group_3__1__Impl : ( ( rule__Textfield__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Textfield__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2519:1: ( ( ( rule__Textfield__DescriptionAssignment_3_1 ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2520:1: ( ( rule__Textfield__DescriptionAssignment_3_1 ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2520:1: ( ( rule__Textfield__DescriptionAssignment_3_1 ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2521:1: ( rule__Textfield__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionAssignment_3_1()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2522:1: ( rule__Textfield__DescriptionAssignment_3_1 )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2522:2: rule__Textfield__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Textfield__DescriptionAssignment_3_1_in_rule__Textfield__Group_3__1__Impl4986);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2537:1: rule__Model__ActivitiesAssignment_0 : ( ruleActivity ) ;
    public final void rule__Model__ActivitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2541:1: ( ( ruleActivity ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2542:1: ( ruleActivity )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2542:1: ( ruleActivity )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2543:1: ruleActivity
            {
             before(grammarAccess.getModelAccess().getActivitiesActivityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleActivity_in_rule__Model__ActivitiesAssignment_05025);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2552:1: rule__Model__RolesAssignment_1 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2556:1: ( ( ruleRole ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2557:1: ( ruleRole )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2557:1: ( ruleRole )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2558:1: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Model__RolesAssignment_15056);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2567:1: rule__Model__WorkProductsAssignment_2 : ( ruleWorkProduct ) ;
    public final void rule__Model__WorkProductsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2571:1: ( ( ruleWorkProduct ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2572:1: ( ruleWorkProduct )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2572:1: ( ruleWorkProduct )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2573:1: ruleWorkProduct
            {
             before(grammarAccess.getModelAccess().getWorkProductsWorkProductParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWorkProduct_in_rule__Model__WorkProductsAssignment_25087);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2582:1: rule__Model__WorkProductTypesAssignment_3 : ( ruleWorkProductType ) ;
    public final void rule__Model__WorkProductTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2586:1: ( ( ruleWorkProductType ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2587:1: ( ruleWorkProductType )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2587:1: ( ruleWorkProductType )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2588:1: ruleWorkProductType
            {
             before(grammarAccess.getModelAccess().getWorkProductTypesWorkProductTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWorkProductType_in_rule__Model__WorkProductTypesAssignment_35118);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2597:1: rule__Model__GuidancesAssignment_4 : ( ruleGuidance ) ;
    public final void rule__Model__GuidancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2601:1: ( ( ruleGuidance ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2602:1: ( ruleGuidance )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2602:1: ( ruleGuidance )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2603:1: ruleGuidance
            {
             before(grammarAccess.getModelAccess().getGuidancesGuidanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleGuidance_in_rule__Model__GuidancesAssignment_45149);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2612:1: rule__Model__GuidanceTypesAssignment_5 : ( ruleGuidanceType ) ;
    public final void rule__Model__GuidanceTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2616:1: ( ( ruleGuidanceType ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2617:1: ( ruleGuidanceType )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2617:1: ( ruleGuidanceType )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2618:1: ruleGuidanceType
            {
             before(grammarAccess.getModelAccess().getGuidanceTypesGuidanceTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleGuidanceType_in_rule__Model__GuidanceTypesAssignment_55180);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2627:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2631:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2632:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2632:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2633:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_15211); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2642:1: rule__Role__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__Role__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2646:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2647:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2647:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2648:1: ruleTextfield
            {
             before(grammarAccess.getRoleAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Role__TextfieldAssignment_25242);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2657:1: rule__WorkProductType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkProductType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2661:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2662:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2662:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2663:1: RULE_ID
            {
             before(grammarAccess.getWorkProductTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProductType__NameAssignment_15273); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2672:1: rule__WorkProductType__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__WorkProductType__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2676:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2677:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2677:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2678:1: ruleTextfield
            {
             before(grammarAccess.getWorkProductTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__WorkProductType__TextfieldAssignment_25304);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2687:1: rule__WorkProduct__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkProduct__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2691:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2692:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2692:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2693:1: RULE_ID
            {
             before(grammarAccess.getWorkProductAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProduct__NameAssignment_15335); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2702:1: rule__WorkProduct__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkProduct__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2706:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2707:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2707:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2708:1: ( RULE_ID )
            {
             before(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2709:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2710:1: RULE_ID
            {
             before(grammarAccess.getWorkProductAccess().getTypeWorkProductTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkProduct__TypeAssignment_35370); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2721:1: rule__WorkProduct__TextfieldAssignment_4 : ( ruleTextfield ) ;
    public final void rule__WorkProduct__TextfieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2725:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2726:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2726:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2727:1: ruleTextfield
            {
             before(grammarAccess.getWorkProductAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__WorkProduct__TextfieldAssignment_45405);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2736:1: rule__GuidanceType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GuidanceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2740:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2741:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2741:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2742:1: RULE_ID
            {
             before(grammarAccess.getGuidanceTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GuidanceType__NameAssignment_15436); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2751:1: rule__GuidanceType__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__GuidanceType__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2755:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2756:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2756:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2757:1: ruleTextfield
            {
             before(grammarAccess.getGuidanceTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__GuidanceType__TextfieldAssignment_25467);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2766:1: rule__Guidance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Guidance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2770:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2771:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2771:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2772:1: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guidance__NameAssignment_15498); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2781:1: rule__Guidance__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2785:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2786:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2786:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2787:1: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeCrossReference_3_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2788:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2789:1: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getTypeGuidanceTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guidance__TypeAssignment_35533); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2800:1: rule__Guidance__TextfieldAssignment_4 : ( ruleTextfield ) ;
    public final void rule__Guidance__TextfieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2804:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2805:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2805:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2806:1: ruleTextfield
            {
             before(grammarAccess.getGuidanceAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Guidance__TextfieldAssignment_45568);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2815:1: rule__Port__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2819:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2820:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2820:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2821:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_05599); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2830:1: rule__Port__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Port__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2834:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2835:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2835:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2836:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getTypeWorkProductCrossReference_2_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2837:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2838:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getTypeWorkProductIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__TypeAssignment_25634); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2849:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2853:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2854:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2854:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2855:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_15669); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2864:1: rule__Activity__TextfieldAssignment_2 : ( ruleTextfield ) ;
    public final void rule__Activity__TextfieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2868:1: ( ( ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2869:1: ( ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2869:1: ( ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2870:1: ruleTextfield
            {
             before(grammarAccess.getActivityAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextfield_in_rule__Activity__TextfieldAssignment_25700);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2879:1: rule__Activity__RoleAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__RoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2883:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2884:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2884:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2885:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getRoleRoleCrossReference_4_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2886:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2887:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getRoleRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__RoleAssignment_45735); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2898:1: rule__Activity__InPortsAssignment_5_1 : ( rulePort ) ;
    public final void rule__Activity__InPortsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2902:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2903:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2903:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2904:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_15770);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2913:1: rule__Activity__InPortsAssignment_5_2_1 : ( rulePort ) ;
    public final void rule__Activity__InPortsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2917:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2918:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2918:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2919:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_2_15801);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2928:1: rule__Activity__OutPortsAssignment_6_1 : ( rulePort ) ;
    public final void rule__Activity__OutPortsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2932:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2933:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2933:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2934:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_15832);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2943:1: rule__Activity__OutPortsAssignment_6_2_1 : ( rulePort ) ;
    public final void rule__Activity__OutPortsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2947:1: ( ( rulePort ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2948:1: ( rulePort )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2948:1: ( rulePort )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2949:1: rulePort
            {
             before(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_2_15863);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2958:1: rule__Activity__SubActivitiesAssignment_7_1 : ( ruleActivityRef ) ;
    public final void rule__Activity__SubActivitiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2962:1: ( ( ruleActivityRef ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2963:1: ( ruleActivityRef )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2963:1: ( ruleActivityRef )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2964:1: ruleActivityRef
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_15894);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2973:1: rule__Activity__SubActivitiesAssignment_7_2_1 : ( ruleActivityRef ) ;
    public final void rule__Activity__SubActivitiesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2977:1: ( ( ruleActivityRef ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2978:1: ( ruleActivityRef )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2978:1: ( ruleActivityRef )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2979:1: ruleActivityRef
            {
             before(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_2_15925);
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2988:1: rule__Activity__GuidancesAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__GuidancesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2992:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2993:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2993:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2994:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2995:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:2996:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_15960); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3007:1: rule__Activity__GuidancesAssignment_8_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__GuidancesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3011:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3012:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3012:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3013:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_2_1_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3014:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3015:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getGuidancesGuidanceIDTerminalRuleCall_8_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_2_15999); 
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


    // $ANTLR start "rule__ActivityRef__NameAssignment_0"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3026:1: rule__ActivityRef__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ActivityRef__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3030:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3031:1: ( RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3031:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3032:1: RULE_ID
            {
             before(grammarAccess.getActivityRefAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityRef__NameAssignment_06034); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3041:1: rule__ActivityRef__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ActivityRef__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3045:1: ( ( ( RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3046:1: ( ( RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3046:1: ( ( RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3047:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityRefAccess().getTypeActivityCrossReference_2_0()); 
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3048:1: ( RULE_ID )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3049:1: RULE_ID
            {
             before(grammarAccess.getActivityRefAccess().getTypeActivityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityRef__TypeAssignment_26069); 
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


    // $ANTLR start "rule__Textfield__LabelAssignment_0_1"
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3060:1: rule__Textfield__LabelAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Textfield__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3064:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3065:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3065:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3066:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getLabelSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__LabelAssignment_0_16104); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3075:1: rule__Textfield__SummaryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Textfield__SummaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3079:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3080:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3080:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3081:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getSummarySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__SummaryAssignment_26135); 
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
    // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3090:1: rule__Textfield__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Textfield__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3094:1: ( ( RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3095:1: ( RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3095:1: ( RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow.ui/src-gen/de/protos/FlowOfWork/core/fow/ui/contentassist/antlr/internal/InternalFoW.g:3096:1: RULE_STRING
            {
             before(grammarAccess.getTextfieldAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Textfield__DescriptionAssignment_3_16166); 
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
    public static final BitSet FOLLOW_ruleTextfield_in_entryRuleTextfield604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfield611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__0_in_ruleTextfield637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ActivitiesAssignment_0_in_rule__Model__Alternatives673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RolesAssignment_1_in_rule__Model__Alternatives691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorkProductsAssignment_2_in_rule__Model__Alternatives709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorkProductTypesAssignment_3_in_rule__Model__Alternatives727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GuidancesAssignment_4_in_rule__Model__Alternatives745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GuidanceTypesAssignment_5_in_rule__Model__Alternatives763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__0795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__0798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Role__Group__0__Impl826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__1857 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__2917 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__TextfieldAssignment_2_in_rule__Role__Group__2__Impl947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Role__Group__3__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__0__Impl_in_rule__WorkProductType__Group__01044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__1_in_rule__WorkProductType__Group__01047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WorkProductType__Group__0__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__1__Impl_in_rule__WorkProductType__Group__11106 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__2_in_rule__WorkProductType__Group__11109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__NameAssignment_1_in_rule__WorkProductType__Group__1__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__2__Impl_in_rule__WorkProductType__Group__21166 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__3_in_rule__WorkProductType__Group__21169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__TextfieldAssignment_2_in_rule__WorkProductType__Group__2__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProductType__Group__3__Impl_in_rule__WorkProductType__Group__31226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkProductType__Group__3__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__0__Impl_in_rule__WorkProduct__Group__01293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__1_in_rule__WorkProduct__Group__01296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WorkProduct__Group__0__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__1__Impl_in_rule__WorkProduct__Group__11355 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__2_in_rule__WorkProduct__Group__11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__NameAssignment_1_in_rule__WorkProduct__Group__1__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__2__Impl_in_rule__WorkProduct__Group__21415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__3_in_rule__WorkProduct__Group__21418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WorkProduct__Group__2__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__3__Impl_in_rule__WorkProduct__Group__31477 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__4_in_rule__WorkProduct__Group__31480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__TypeAssignment_3_in_rule__WorkProduct__Group__3__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__4__Impl_in_rule__WorkProduct__Group__41537 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__5_in_rule__WorkProduct__Group__41540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__TextfieldAssignment_4_in_rule__WorkProduct__Group__4__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkProduct__Group__5__Impl_in_rule__WorkProduct__Group__51597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkProduct__Group__5__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__0__Impl_in_rule__GuidanceType__Group__01668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__1_in_rule__GuidanceType__Group__01671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GuidanceType__Group__0__Impl1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__1__Impl_in_rule__GuidanceType__Group__11730 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__2_in_rule__GuidanceType__Group__11733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__NameAssignment_1_in_rule__GuidanceType__Group__1__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__2__Impl_in_rule__GuidanceType__Group__21790 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__3_in_rule__GuidanceType__Group__21793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__TextfieldAssignment_2_in_rule__GuidanceType__Group__2__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuidanceType__Group__3__Impl_in_rule__GuidanceType__Group__31850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GuidanceType__Group__3__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__01917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__01920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Guidance__Group__0__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__11979 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__11982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__NameAssignment_1_in_rule__Guidance__Group__1__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__22039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guidance__Group__3_in_rule__Guidance__Group__22042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Guidance__Group__2__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__3__Impl_in_rule__Guidance__Group__32101 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__4_in_rule__Guidance__Group__32104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TypeAssignment_3_in_rule__Guidance__Group__3__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__4__Impl_in_rule__Guidance__Group__42161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Guidance__Group__5_in_rule__Guidance__Group__42164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TextfieldAssignment_4_in_rule__Guidance__Group__4__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__Group__5__Impl_in_rule__Guidance__Group__52221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Guidance__Group__5__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_0_in_rule__Port__Group__0__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__2_in_rule__Port__Group__12355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Port__Group__1__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__22414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__TypeAssignment_2_in_rule__Port__Group__2__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Activity__Group__0__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12539 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__22602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__TextfieldAssignment_2_in_rule__Activity__Group__2__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__32659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__32662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Activity__Group__3__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42721 = new BitSet(new long[]{0x0000000001D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__42724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__RoleAssignment_4_in_rule__Activity__Group__4__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__52781 = new BitSet(new long[]{0x0000000001D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__52784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__62842 = new BitSet(new long[]{0x0000000001D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__62845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__72903 = new BitSet(new long[]{0x0000000001D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__72906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__82964 = new BitSet(new long[]{0x0000000001D01000L});
    public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__82967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0_in_rule__Activity__Group__8__Impl2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__93025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Activity__Group__9__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__03104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__03107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Activity__Group_5__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__13166 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__13169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InPortsAssignment_5_1_in_rule__Activity__Group_5__1__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__23226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__Group_5__2__Impl3253 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__03290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__03293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group_5_2__0__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__13352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InPortsAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__03413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__03416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Activity__Group_6__0__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__13475 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__13478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OutPortsAssignment_6_1_in_rule__Activity__Group_6__1__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__23535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__Group_6__2__Impl3562 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__03599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__03602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group_6_2__0__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__13661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OutPortsAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__03722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__03725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Activity__Group_7__0__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__13784 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__2_in_rule__Activity__Group_7__13787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SubActivitiesAssignment_7_1_in_rule__Activity__Group_7__1__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7__2__Impl_in_rule__Activity__Group_7__23844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__Group_7__2__Impl3871 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__03908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__03911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group_7_2__0__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__13970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SubActivitiesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__0__Impl_in_rule__Activity__Group_8__04031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1_in_rule__Activity__Group_8__04034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group_8__0__Impl4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__1__Impl_in_rule__Activity__Group_8__14093 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2_in_rule__Activity__Group_8__14096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__GuidancesAssignment_8_1_in_rule__Activity__Group_8__1__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8__2__Impl_in_rule__Activity__Group_8__24153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__0_in_rule__Activity__Group_8__2__Impl4180 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__0__Impl_in_rule__Activity__Group_8_2__04217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__1_in_rule__Activity__Group_8_2__04220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group_8_2__0__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_8_2__1__Impl_in_rule__Activity__Group_8_2__14279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__GuidancesAssignment_8_2_1_in_rule__Activity__Group_8_2__1__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__0__Impl_in_rule__ActivityRef__Group__04340 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__1_in_rule__ActivityRef__Group__04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__NameAssignment_0_in_rule__ActivityRef__Group__0__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__1__Impl_in_rule__ActivityRef__Group__14400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__2_in_rule__ActivityRef__Group__14403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ActivityRef__Group__1__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__Group__2__Impl_in_rule__ActivityRef__Group__24462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityRef__TypeAssignment_2_in_rule__ActivityRef__Group__2__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__0__Impl_in_rule__Textfield__Group__04525 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Textfield__Group__1_in_rule__Textfield__Group__04528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__0_in_rule__Textfield__Group__0__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__1__Impl_in_rule__Textfield__Group__14586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group__2_in_rule__Textfield__Group__14589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Textfield__Group__1__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__2__Impl_in_rule__Textfield__Group__24648 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Textfield__Group__3_in_rule__Textfield__Group__24651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__SummaryAssignment_2_in_rule__Textfield__Group__2__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group__3__Impl_in_rule__Textfield__Group__34708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__0_in_rule__Textfield__Group__3__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__0__Impl_in_rule__Textfield__Group_0__04774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__1_in_rule__Textfield__Group_0__04777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Textfield__Group_0__0__Impl4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_0__1__Impl_in_rule__Textfield__Group_0__14836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__LabelAssignment_0_1_in_rule__Textfield__Group_0__1__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__0__Impl_in_rule__Textfield__Group_3__04897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__1_in_rule__Textfield__Group_3__04900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Textfield__Group_3__0__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__Group_3__1__Impl_in_rule__Textfield__Group_3__14959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Textfield__DescriptionAssignment_3_1_in_rule__Textfield__Group_3__1__Impl4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Model__ActivitiesAssignment_05025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Model__RolesAssignment_15056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_rule__Model__WorkProductsAssignment_25087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_rule__Model__WorkProductTypesAssignment_35118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_rule__Model__GuidancesAssignment_45149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_rule__Model__GuidanceTypesAssignment_55180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_15211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Role__TextfieldAssignment_25242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProductType__NameAssignment_15273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__WorkProductType__TextfieldAssignment_25304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProduct__NameAssignment_15335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkProduct__TypeAssignment_35370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__WorkProduct__TextfieldAssignment_45405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GuidanceType__NameAssignment_15436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__GuidanceType__TextfieldAssignment_25467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guidance__NameAssignment_15498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guidance__TypeAssignment_35533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Guidance__TextfieldAssignment_45568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_05599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__TypeAssignment_25634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_15669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_rule__Activity__TextfieldAssignment_25700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__RoleAssignment_45735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_15770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__InPortsAssignment_5_2_15801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_15832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Activity__OutPortsAssignment_6_2_15863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_15894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_rule__Activity__SubActivitiesAssignment_7_2_15925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_15960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__GuidancesAssignment_8_2_15999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityRef__NameAssignment_06034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityRef__TypeAssignment_26069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__LabelAssignment_0_16104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__SummaryAssignment_26135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Textfield__DescriptionAssignment_3_16166 = new BitSet(new long[]{0x0000000000000002L});

}