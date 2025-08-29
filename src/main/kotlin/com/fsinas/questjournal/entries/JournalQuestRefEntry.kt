@Entry("journal_quest_ref", "Journal Quest Reference", Colors.GREEN, "material-symbols:assignment")
data class JournalQuestRefEntry(
    override val id: String = "",
    override val name: String = "",
    override val criteria: List<Criteria> = emptyList(),
    override val modifiers: List<Modifier> = emptyList(),
    override val triggers: List<String> = emptyList(),
    
    @Help("Reference to the actual quest")
    val questRef: Ref<QuestEntry> = emptyRef(),
    
    @Help("Categories this quest appears in")
    val categories: List<Ref<JournalCategoryEntry>> = emptyList(),
    
    @Help("Custom display name (overrides quest name)")
    val customDisplayName: String = "",
    
    @Help("Custom description (overrides quest description)")
    val customDescription: String = "",
    
    @Help("Custom icon (overrides quest icon)")
    val customIcon: String = "",
    
    @Help("Pin this quest by default")
    val pinnedByDefault: Boolean = false,
    
    @Help("Show progress percentage")
    val showProgress: Boolean = true,
    
    @Help("Display priority (higher = top)")
    val priority: Int = 0,
    
    @Help("Hide when completed")
    val hideWhenCompleted: Boolean = false
) : Entry
