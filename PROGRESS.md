# Progress
Current phase: 0 + 1 (setup folded into first Java task)
Current topic: 1.3 Data types (next session) + Git: commit --amend practice, git show, log --stat
Last session: 2026-10-03

## Phase 0 — Setup
- [x] 0.1 What is Git vs GitHub, why version control — done 2026-10-03 (needed hints)
- [x] 0.2 git config (user.name, user.email) — done 2026-10-03
- [x] 0.3 git init — own repo in Interview_prep (not home folder) — done 2026-10-03
- [x] 0.4 The 3 areas: working directory → staging area → repository — taught 2026-10-03
- [x] 0.5 status, add, commit, log --oneline — done 2026-10-03
- [x] 0.6 .gitignore (+ git rm --cached for already-tracked files) — done 2026-10-03 (pattern mistake)
- [x] 0.7 remote add origin, remote -v, branch -M main, push -u — done 2026-10-03
- [x] 0.8 Commit + push PROGRESS.md and MISTAKES.md — done 2026-10-03
- [x] Checkpoint: 3 areas + add → commit → push without help — passed 2026-10-03

## Phase 1 — Core Java Refresh
- [x] 1.1 JDK, JRE, JVM, bytecode, javac/java — done 2026-10-03 (checkpoint 4/4)
- [x] 1.2 main method — done 2026-10-03 (checkpoint 3/3, 1 hint on array index)
- [ ] 1.3 Data types: primitives vs references, defaults, sizes, casting, overflow

## Git skills learned
- [x] init, status, add, commit, log --oneline
- [x] .gitignore, rm --cached
- [x] commit --amend (and why not to amend pushed commits; commit ID = SHA-1 hash)
- [x] remote add, remote -v, branch -M, push -u origin main
- [x] git diff vs git diff --staged, git restore <file>, add . depends on current folder (cd ..)
- [ ] Conventional Commits (feat:/fix:/docs:) — introduced 2026-10-03

## Mock interview scores
- (none yet)

## Notes / open issues
- 2026-10-03: The home folder `C:/Users/sangr` also has a .git (2 commits from another project, no remote). Interview_prep now has its own repo, so it's not affected. Decide later whether to remove the home-folder repo (carefully).
- GitHub repo: https://github.com/samsang-59/Preparation_repo.git (pushed, main at ed7e7fc)
- History has 2 near-duplicate setup commits (9f538db, 4af4def): could squash in Phase 4 to practise rebase -i. Don't rewrite now (already pushed).
