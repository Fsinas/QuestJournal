@Entry("journal_category", "Journal Category", Colors.BLUE, "material-symbols:folder")
data class JournalCategoryEntry(
    override val id: String = "",
    override val name: String = "",
    override val criteria: List<Criteria> = emptyList(),
    override val modifiers: List<Modifier> = emptyList(),
    override val triggers: List<String> = emptyList(),
    
    @Help("Display name for this category")
    val displayName: String = "",
    
    @Help("Category description")
    val description: String = "",
    
    @Help("Icon for the category (Material or custom)")
    val icon: String = "material-symbols:folder",
    
    @Help("Parent category (for nested structure)")
    val parentCategory: Ref<JournalCategoryEntry> = emptyRef(),
    
    @Help("Display order within parent")
    val sortOrder: Int = 0,
    
    @Help("Category visibility conditions")
    val visibilityRequirements: List<Ref<out Entry>> = emptyList(),
    
    @Help("Maximum quests to show in this category")
    val maxQuests: Int = -1,
    
    @Help("Category color theme")
    val colorTheme: String = "#3498db"
) : Entry
