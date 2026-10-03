# Mistakes

| Date | Topic | What I thought | Correct idea | Revised? |
|---|---|---|---|---|
| 2026-10-03 | 0.1 Git vs GitHub | GitHub is the tool you use to "apply" Git's rules, and it stores "different types of software" | Git = version control program on your laptop, works offline, tracks commits. GitHub = website that hosts Git repos (files + full history) online for backup and collaboration. You can use Git without GitHub. Commits are local, and GitHub only sees them after `git push`. | ❌ |
| 2026-10-03 | 1.1 javac / packages | Wrote `package phase-01-core-java;` (copied the folder name) | Package names follow identifier rules: letters, digits, `_`, `$` only, and can't start with a digit. `-` is the minus operator → compile error. Folder names can have `-`, package names can't. | ❌ |
| 2026-10-03 | Git: commit IDs | Thought the new commit ID was the old ID with characters "shifted" (+5, +1, +3) | A commit ID is a SHA-1 hash (fingerprint) calculated from: file snapshot + message + author + timestamp + parent. Change anything → completely different ID, no pattern. That's why `--amend` gives a new ID and you shouldn't amend pushed commits. | ❌ |
| 2026-10-03 | Git: .gitignore | Wrote `.*class` instead of `*.class` | `*` = "anything". `*.class` = any name ending in .class. `.*class` = names starting with a dot. | ❌ |
