package eu.kanade.tachiyomi.extension.id.doujindesu

import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.Filter

class DoujindesuFilters : FilterList(
        TypeFilter(),
            StatusFilter()
)

class TypeFilter : Filter.Select<String>("Tipe", arrayOf("Semua", "Manga", "Manhwa", "Manhua"))
class StatusFilter : Filter.Select<String>("Status", arrayOf("Semua", "Ongoing", "Completed"))

) 