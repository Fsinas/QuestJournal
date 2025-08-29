@Entry("journal_display", "Journal Display Settings", Colors.PURPLE, "material-symbols:settings")
data class JournalDisplayEntry(
    override val id: String = "",
    override val name: String = "",
    override val criteria: List<Criteria> = emptyList(),
    override val modifiers: List<Modifier> = emptyList(),
    override val triggers: List<String> = emptyList(),
    
    @Help("Default GUI type for this player")
    val defaultGuiType: JournalGuiType = JournalGuiType.INVENTORY_GRID,
    
    @Help("Items per page for paginated views")
    val itemsPerPage: Int = 28,
    
    @Help("Enable quest pinning")
    val allowPinning: Boolean = true,
    
    @Help("Max pinned quests")
    val maxPinnedQuests: Int = 3,
    
    @Help("Show completed quests")
    val showCompletedQuests: Boolean = true,
    
    @Help("Auto-open journal on quest start")
    val autoOpenOnQuestStart: Boolean = false,
    
    @Help("Sidebar position")
    val sidebarPosition: SidebarPosition = SidebarPosition.RIGHT,
    
    @Help("Enable quest notifications")
    val enableNotifications: Boolean = true
) : Entry

enum class JournalGuiType {
    INVENTORY_GRID,
    BOOK_PAGES,
    SIDEBAR_OVERLAY,
    BOSSBAR_PROGRESS
}

enum class SidebarPosition {
    LEFT, RIGHT, TOP, BOTTOM
}