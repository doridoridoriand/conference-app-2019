package io.github.droidkaigi.confsched2019.settings.ui

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import io.github.droidkaigi.confsched2019.settings.R

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)

        requireNotNull(findPreference(getString(R.string.pref_key_add_wifi)))
            .setOnPreferenceClickListener {
                true.also {

                }
            }
    }
}
