# Progress
Current phase: 0 + 1 (setup folded into first Java task)
Current topic: Cram DONE (Phases 1–5 interview topics). Next: revise MISTAKES.md before interview. After interview → resume full plan at 1.7 Arrays (+ paused items per phase).
Last session: 2026-10-04

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
- [x] 1.3 Data types: primitives, sizes, casting, overflow, defaults — done 2026-10-04 (checkpoint 4/4)
- [x] 1.4 Operators — done 2026-10-04 (checkpoint passed, Q3 after explanation)
- [x] 1.5 Control flow — done 2026-10-04 (checkpoint 3/3)
- [x] 1.6 Strings — done 2026-10-04 (interview cram mode, Q&A only)
- [ ] 1.7 Arrays — PAUSED (after interview)
- [x] 1.8 Pass-by-value — done 2026-10-04 (cram)
- [x] 1.9 static / final — done 2026-10-04 (cram)
- [x] 1.10 Wrappers + Integer cache — done 2026-10-04 (cram)
- [ ] 1.11 var / Scanner / Math — PAUSED (after interview)

## Phase 2 — OOP (cram: core topics)
- [x] Cram done 2026-10-04: class vs object, stack/heap, constructors + this, default constructor trap, encapsulation, access modifiers, inheritance + super() order, diamond problem, upcasting, overloading vs overriding, dynamic dispatch, fields/static not polymorphic, abstract class vs interface, equals/hashCode contract
- [ ] PAUSED (after interview): inner classes, packages, full practice tasks, branching Git track

## Phase 3 — Exceptions (cram)
- [x] Cram done 2026-10-04: hierarchy, checked vs unchecked, try/catch/finally, finally+return, throw vs throws, custom exceptions, try-with-resources, best practices
- [ ] PAUSED: enums, interfaces deep, generics, immutable classes, GitHub collaboration track

## Phase 4 — Collections (cram)
- [x] Cram done 2026-10-04: ArrayList vs LinkedList, HashMap internals (hashCode→bucket, equals, collision, load factor 0.75, resize, treeify >8), HashSet, which collection when, Comparable vs Comparator, fail-fast / ConcurrentModificationException, removeIf
- [ ] PAUSED: Queue/Deque/PriorityQueue deep, Collections utility, List.of, proving equals-without-hashCode in code, Git rewrite-history track

## Phase 5 — Modern Java (cram)
- [x] Cram done 2026-10-04: lambdas, streams (filter/map/toList), intermediate vs terminal, lazy, method references, groupingBy/counting/joining, functional interfaces (Predicate/Function/Consumer/Supplier), Optional
- [ ] PAUSED: flatMap, reduce, parallel streams, records/sealed/switch expressions, Date/Time API, tags/releases/bisect

## Git skills learned
- [x] init, status, add, commit, log --oneline
- [x] .gitignore, rm --cached
- [x] commit --amend (and why not to amend pushed commits; commit ID = SHA-1 hash)
- [x] remote add, remote -v, branch -M, push -u origin main
- [x] git diff vs git diff --staged, git restore <file>, add . depends on current folder (cd ..)
- [~] Conventional Commits — using feat:, still forgetting docs: prefix
- [x] git add <specific files> to split commits, git log --stat, git show — 2026-10-04
- [x] git mv (rename), git show <id>, git show <id> -- <file>, /dev/null = new file — 2026-10-04
- [x] git rm (delete + stage) vs git rm --cached — 2026-10-04

## Mock interview scores
- (none yet)

## Notes / open issues
- 2026-10-03: The home folder `C:/Users/sangr` also has a .git (2 commits from another project, no remote). Interview_prep now has its own repo, so it's not affected. Decide later whether to remove the home-folder repo (carefully).
- GitHub repo: https://github.com/samsang-59/Preparation_repo.git (pushed, main at ed7e7fc)
- History has 2 near-duplicate setup commits (9f538db, 4af4def): could squash in Phase 4 to practise rebase -i. Don't rewrite now (already pushed).
