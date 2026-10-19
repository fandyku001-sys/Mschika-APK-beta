MSCHIKA APK TEST - BUILD VIA WEB (GITHUB ACTIONS)

This is the simple Android Java test app. The ZIP contains source code and a GitHub Actions workflow; it is NOT itself an APK.

BUILD WITHOUT INSTALLING ANDROID STUDIO:
1. Sign in to https://github.com/ or create a free account.
2. Create a new repository. A private repository is fine. Name it Mschika-APK-Test.
3. Upload the CONTENTS of this extracted ZIP to the repository root (not the enclosing folder). Make sure the .github/workflows/android.yml file is included. On GitHub, enable viewing hidden files if needed; easiest is to upload the ZIP's extracted contents from your computer.
4. Commit the uploaded files to the main branch.
5. Open the repository's Actions tab. Select "Build Mschika APK" in the left column.
6. Click "Run workflow" and then the green "Run workflow" button. If a workflow run already started after the commit, you can open that run instead.
7. Wait for the run to finish successfully. Open the run page, scroll to Artifacts, and download "Mschika-debug-APK".
8. Extract the downloaded artifact ZIP. It contains app-debug.apk. Transfer it to your Android phone and install it. Android may ask you to allow installing unknown apps for the app you use to open the APK.

NOTES:
- GitHub Actions builds the APK on GitHub's cloud servers; Android Studio is not required on your PC.
- The first build may take several minutes.
- Do not upload passwords, signing keys, or private credentials to the repository.
