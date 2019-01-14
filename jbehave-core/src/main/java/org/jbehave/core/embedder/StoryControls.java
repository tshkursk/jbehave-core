package org.jbehave.core.embedder;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Holds flags used by the StoryRunner to control story execution flow.
 */
public class StoryControls {

    private boolean dryRun = false;
    private boolean resetStateBeforeStory = true;
    private boolean resetStateBeforeScenario = true;
    private boolean skipScenariosAfterFailure = false;
    private boolean skipBeforeAndAfterScenarioStepsIfGivenStory = false;
	private boolean ignoreMetaFiltersIfGivenStory = false;
	private boolean metaByRow = false;
    private String storyMetaPrefix = "";
    private String scenarioMetaPrefix = "";
    private boolean skipStoryIfGivenStoryFailed = false;

    public StoryControls() {
    }

    public boolean dryRun() {
        return dryRun;
    }

    public boolean resetStateBeforeStory() {
        return resetStateBeforeStory;
    }

    public boolean resetStateBeforeScenario() {
        return resetStateBeforeScenario;
    }

    public boolean skipScenariosAfterFailure() {
        return skipScenariosAfterFailure;
    }

    public boolean skipBeforeAndAfterScenarioStepsIfGivenStory() {
        return skipBeforeAndAfterScenarioStepsIfGivenStory;
    }

    public boolean ignoreMetaFiltersIfGivenStory() {
		return ignoreMetaFiltersIfGivenStory;
	}

    public boolean metaByRow() {
        return metaByRow;
    }

    public String storyMetaPrefix() {
        return storyMetaPrefix;
    }

    public String scenarioMetaPrefix() {
        return scenarioMetaPrefix;
    }

    public boolean skipStoryIfGivenStoryFailed() {
        return skipStoryIfGivenStoryFailed;
    }

    public StoryControls doDryRun(boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

	public StoryControls doResetStateBeforeScenario(boolean resetStateBeforeScenario) {
        this.resetStateBeforeScenario = resetStateBeforeScenario;
        return this;
    }
    
    public StoryControls doResetStateBeforeStory(boolean resetStateBeforeStory) {
        this.resetStateBeforeStory = resetStateBeforeStory;
        return this;
    }
    
    public StoryControls doSkipScenariosAfterFailure(boolean skipScenariosAfterFailure) {
        this.skipScenariosAfterFailure = skipScenariosAfterFailure;
        return this;
    }

    public StoryControls doSkipBeforeAndAfterScenarioStepsIfGivenStory(boolean skipBeforeAndAfterScenarioStepsIfGivenStory) {
        this.skipBeforeAndAfterScenarioStepsIfGivenStory = skipBeforeAndAfterScenarioStepsIfGivenStory;
        return this;
    }

	public StoryControls doIgnoreMetaFiltersIfGivenStory(
			boolean ignoreMetaFiltersIfGivenStory) {
		this.ignoreMetaFiltersIfGivenStory = ignoreMetaFiltersIfGivenStory;
		return this;
	}

	public StoryControls doMetaByRow(boolean metaByRow) {
	    this.metaByRow = metaByRow;
	    return this;
	}

    public StoryControls useStoryMetaPrefix(String storyMetaPrefix){
        this.storyMetaPrefix = storyMetaPrefix;
        return this;        
    }

    public StoryControls useScenarioMetaPrefix(String scenarioMetaPrefix){
        this.scenarioMetaPrefix = scenarioMetaPrefix;
        return this;        
    }

    public StoryControls doSkipStoryIfGivenStoryFailed(boolean skipStoryIfGivenStoryFailed) {
        this.skipStoryIfGivenStoryFailed = skipStoryIfGivenStoryFailed;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
